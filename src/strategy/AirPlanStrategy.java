package strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体策略类：乘坐飞机
 *
 * @author LDDFY
 */
@Slf4j
public class AirPlanStrategy implements Strategy {
	@Override
	public void travelType() {
		log.info("by Air Plane..");
	}
}
