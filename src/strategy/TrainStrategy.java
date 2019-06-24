package strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体策略类：乘火车
 * 
 * @author LDDFY
 */
@Slf4j
public class TrainStrategy implements Strategy {
  @Override
  public void travelType() {
    log.info("by Train..");
  }
}
