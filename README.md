# DesignMode
## 面向对象的设计原则
熟记面向对象的设计原则可以更好的理解设计模式，对于面向对象的设计原则，各个版本的说法不一，有说五种的，有说六种的，但是基本就是下面七种原则的组合，这里全部罗列出来，加深一下印象（非斜体的在每个版本中都有）。

1. SRP：单一职责原则，一个类应该仅有一个引起它变化的原因。Single Responsibility Principle
2. OCP：开闭原则，讲的是设计要对扩展有好的支持，而对修改要严格限制。Open Close Principle
3. LSP：里氏替换原则，子类必须能够替换基类，否则不应当设计为其子类。Liskov Substitution Principle
4. DIP：依赖倒换原则，设计要依赖于抽象而不是具体化。Dependence Inversion Principle
5. ISP：将打的接口打散成多个小接口。 Interface Segregation Principle
6. LoD：迪米特法则，一个对象应当尽可能少的去了解其它对象。也就是一个关于如何松耦合的法则。Law of Demeter,也称为最少只是原则LKP Least Knowledge Principle
7. CARP：优先使用复合/聚合，而不是继承。Composition Aggregation Principle

## 设计模式的分类
设计模式一共可以分为23种，3大类：
1. 创建型：Factory Method([工厂方法](doc/Factory.md))、 Abstract Factory([抽象工厂](doc/Factory.md))、 Builder([建造者](doc/Builder.md))、 Prototype([原型](doc/Prototype.md))、 Singleton([单例](doc/Proxy.md))
2. 结构型：Adapter Class/Object([适配器](doc/Adapter.md))、Bridge([桥接](doc/Bridge.md))、Composite([组合](doc/Composite.md))、Decorator([装饰](doc/Decorator.md))、Facade([外观](doc/Facade.md))、FlyWeight([享元](doc/Flyweight.md))、Proxy([代理](doc/Singletone.md))
3. 行为型：Interpreter([解释器](doc/Interpreter.md))、Template Method(模板方法)、Chain of Responsibility([责任链](doc/ChainOfRes.md))、Command([命令](doc/Command.md))、Iterator([迭代器](doc/Iterator.md))、Mediator([中介者](doc/Mediator.md))、Memento([备忘录](doc/Memento.md))、Observer([观察者](doc/Observer.md))、State([状态](doc/State.md))、Strategy(策略)、Visitor(访问者)
