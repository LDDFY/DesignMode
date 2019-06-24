package strategy;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 环境类
 * 
 * @author LDDFY
 */
@Slf4j
public class StrategyContext {

  @Setter
  private Strategy strategy;

  public StrategyContext(Strategy strategy) {
    this.strategy = strategy;
  }

  public void travel() {
    strategy.travelType();
  }
}
