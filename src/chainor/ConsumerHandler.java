package chainor;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象处理者角色
 *
 * @author LDDFY
 */
public abstract class ConsumerHandler {

  @Getter
  @Setter
  public ConsumerHandler nextHandler;

  /**
   * 请求处理
   *
   * @param user
   *          用户
   * @param free
   *          折扣
   */
  abstract void doHandler(String user, BigDecimal free);
}
