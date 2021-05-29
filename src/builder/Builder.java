package builder;

/**
 * 飞机建造接口 （抽象建造着）
 *
 * @author changhao
 */
public interface Builder {
	/**
	 * 安装轮子
	 */
	void buildWheel();

	/**
	 * 安装引擎
	 */
	void buildEngine();

	/**
	 * 组装整体结构
	 */
	void buildStructure();

	/**
	 * 生成对象
	 *
	 * @return
	 */
	Plane build();
}
