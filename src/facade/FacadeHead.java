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
    private Ear ear;

    /**
     * 大脑
     */
    private Brain brain;

    public FacadeHead() {
        ear = new Ear();
        brain = new Brain();
    }

    /**
     * 耳朵听到声音传入大脑
     *
     * @param words
     */
    public void explainWords(String words) {
        ear.setWords(words);
        ear.sendWordsToBrain(brain);
        brain.explainWords();
    }
}
