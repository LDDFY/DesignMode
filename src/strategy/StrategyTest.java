package strategy;

/**
 * 策略模式测试类
 * 
 * @author LDDFY
 */
public class StrategyTest {
  public static void main(String[] args) {
    StrategyContext context = new StrategyContext(new TrainStrategy());
    context.travel();

    context.setStrategy(new AirPlanStrategy());
    context.travel();
  }
}
