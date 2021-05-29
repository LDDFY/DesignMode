package facade;

/**
 * 门店类：Facade
 *
 * @author changhao
 */
public class FacadeHead {

	/**
	 * 耳朵
	 */
	private final Ear ear;

	/**
	 * 大脑
	 */
	private final Brain brain;

	public FacadeHead() {
		ear = new Ear();
		brain = new Brain();
	}

	/**
	 * 耳朵听到声音传入大脑
	 *
	 * @param words 听到的声音
	 */
	public void explainWords(String words) {
		ear.setWords(words);
		ear.sendWordsToBrain(brain);
		brain.explainWords();
	}
}
