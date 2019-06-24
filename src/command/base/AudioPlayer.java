/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	AudioPlayer
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package command.base;

import lombok.extern.slf4j.Slf4j;

/**
 * 接收者：Receiver
 *
 * @author changhao
 */
@Slf4j
public class AudioPlayer {

  /**
   * 播放
   */
  public void play() {
    log.info("Play..");
  }

  /**
   * 后退
   */
  public void rewind() {
    log.info("Rewind..");
  }

  /**
   * 停止
   */
  public void stop() {
    log.info("Stop..");
  }
}
