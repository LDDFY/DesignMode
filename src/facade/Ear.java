package facade;

public class Ear {
	
	private String words;

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}
	
	public boolean sendWordsToBrain(Brain br) {
		return br.sendWordsInBrain(words);
	}
}
