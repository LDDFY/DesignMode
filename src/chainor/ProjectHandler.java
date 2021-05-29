package chainor;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * 具体处理角色：项目人员
 *
 * @author LDDFY
 */
@Slf4j
public class ProjectHandler extends ConsumerHandler {
	/**
	 * 黑名单
	 */
	private static final String BLACK_LIST = "A";

	@Override
	void doHandler(String user, BigDecimal free) {
		//最大处理额度
		double freeLimit = 15000;
		if (free.doubleValue() < freeLimit) {
			if (BLACK_LIST.equals(user)) {
				log.info("{}:审批不通过，最大审批额度为：{}；当前申请额度为：{}", user, freeLimit, free);
			} else {
				log.info("{}:审批通过，最大审批额度为：{}；当前申请额度为：{}", user, freeLimit, free);
			}
		} else {
			if (getNextHandler() != null) {
				getNextHandler().doHandler(user, free);
			} else {
				log.info("{}:审批申请不通过。。。", user);
			}
		}
	}
}
