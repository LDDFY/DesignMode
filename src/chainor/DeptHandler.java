package chainor;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * 具体处理角色：员工
 *
 * @author LDDFY
 */
@Slf4j
public class DeptHandler extends ConsumerHandler {
    /**
     * 当前角色最大报销额度
     */
    private double freeLimit = 8000;

    @Override
    void doHandler(String user, BigDecimal free) {
        if (free.doubleValue() < freeLimit) {
            log.info("{}:审批通过，最大审批额度为：{}；当前申请额度为：{}", user, freeLimit, free);
        } else {
            if (getNextHandler() != null) {
                getNextHandler().doHandler(user, free);
            } else {
                log.info("{}:审批申请不通过。。。", user);
            }
        }
    }
}
