package facade;

public class Brain {

	private String words;
	
	public boolean sendWordsInBrain(String words) {
		this.words=words;
		return (words==null)?false:true;
	}
	
	public void explainWords() {
		//模拟分析过程
        try {
            System.out.println("正在分析对方说的话是什么意思......");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("额，原来你是这个意思！！:"+words);
	}
}
