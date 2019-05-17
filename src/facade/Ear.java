package facade;

/**
 * 耳朵：SubSystem
 *
 * @author changhao
 */
public class Ear {

    /**
     * 声音
     */
    private String words;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    /**
     * 将声音传入大脑
     *
     * @param br
     * @return
     */
    public boolean sendWordsToBrain(Brain br) {
        return br.sendWordsInBrain(words);
    }
}
