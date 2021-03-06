### 策略模式
#### 概述
> 策略模式作为一种软件设计模式，指对象有某个行为，但是在不同的场景中，该行为有不同的实现算法。

### 涉及角色
1. 抽象策略角色（Strategy）：策略类，通常由一个接口或者抽象类实现。
2. 具体策略角色（ConcreteStrategy)：包装了相关的算法和行为。
3. 环境角色(Context)：持有一个策略类的引用，最终给客户端调用。

### 区别
策略模式和工厂模式的区别：工厂模式是创建型的设计模式，它接受指令，创建出符合要求的实例；而策略模式是行为型的，它接受已经创建好的实例，实现不同的行为。

#### 示例代码
[策略模式](../src/strategy/StrategyTest.java)
