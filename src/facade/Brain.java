package facade;

/**
 * 大脑:SubSystem
 *
 * @author changhao
 */
public class Brain {

  private String words;

  /**
   * 接收声音信号并返回是否成功标志
   *
   * @param words
   *          传入单词
   * @return 成功接收标志
   */
  public boolean sendWordsInBrain(String words) {
    this.words = words;
    return (words == null) ? false : true;
  }

  /**
   * 分析单词结果
   */
  public void explainWords() {
    // 模拟分析过程
    try {
      System.out.println("正在分析对方说的话是什么意思......");
      Thread.sleep(2000);
    } catch (InterruptedException e) {
    }
    System.out.println("额，原来你是这个意思！！:" + words);
  }
}
