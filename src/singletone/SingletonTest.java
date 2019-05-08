package singletone;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式测试类
 *
 * @author changhao
 */
public class SingletonTest {

    /**
     * 序列化对象并返回位置
     *
     * @param o
     * @return
     */
    public static String serializeObject(Object o) throws Exception {
        String realPath = SingletonTest.class.getResource("/").getPath().concat(o.getClass().getSimpleName());
        try (FileOutputStream file = new FileOutputStream(realPath);
             ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(o);
            out.flush();
        }
        return realPath;
    }

    /**
     * 反序列化对象
     *
     * @param path
     * @return
     */
    public static Object deSerializeObject(String path) throws Exception {
        try (
                FileInputStream in = new FileInputStream(new File(path));
                ObjectInputStream oin = new ObjectInputStream(in)) {
            return oin.readObject();
        }
    }

    /**
     * 饿汉模式
     */
    public static void eagerSingletonTest() {
        EagerSingleton singleton = EagerSingleton.getInstance();
        singleton.doSomething();
    }

    /**
     * 懒汉模式
     */
    public static void lazySingletonTest() {
        LazySingleton singleton = LazySingleton.getInstance();
        singleton.doSomething();
    }

    /**
     * 双重检测模式
     */
    public static void dclSingletonTest() {
        DCLSingleton singleton = DCLSingleton.getInstance();
        singleton.doSomething();
    }

    /**
     * 占位符(内部类)模式
     */
    public static void placeholderSingletonTest() {
        PlaceholderSingleton singleton = PlaceholderSingleton.getInstance();
        singleton.doSomething();
    }

    /**
     * 枚举模式
     */
    public static void enumSingletonTest() {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.doSomething();
    }

    /**
     * 反射实例化测试
     *
     * @param clazz
     */
    public static void reflectTest(Class clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();
        clazz.getMethod("doSomething").invoke(o);
    }

    /**
     * 枚举反射测试
     *
     * @throws Exception
     */
    public static void enumSingletonReflectTest() throws Exception {
        EnumSingleton o = EnumSingleton.class.newInstance();
    }


    /**
     * 保证枚举类不被序列化破坏，需要重写readResolve方法。
     *
     * @throws Exception
     */
    public static void deSerializeEagerSingletonTest() throws Exception {
        EagerSingleton singleton = EagerSingleton.getInstance();
        String path = serializeObject(singleton);
        Object o = deSerializeObject(path);
        System.out.println("single:" + System.identityHashCode(singleton) + "\t o:" + System.identityHashCode(o));
    }

    /**
     * 枚举类序列化安全无需做额外操作
     *
     * @throws Exception
     */
    public static void deSerializeEnumTest() throws Exception {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        String path = serializeObject(singleton);
        Object o = deSerializeObject(path);
        System.out.println("single:" + System.identityHashCode(singleton) + "\t o:" + System.identityHashCode(o));
    }

    public static void main(String[] args) throws Exception {
        deSerializeEnumTest();
    }
}
