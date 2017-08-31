package facade;

public class FacadeHead {
	private Ear ear;
	private Brain brain;
	public static FacadeHead facadeHead;

	private FacadeHead() {
		ear = new Ear();
		brain = new Brain();
	}

	public static FacadeHead getFacadeHeadInstance() {
		synchronized (FacadeHead.class) {
			if (facadeHead == null) {
				return new FacadeHead();
			}else {
				return facadeHead;
			}
		}
	}
	
	
	
	public void explainWords(String words) {
		ear.setWords(words);
		ear.sendWordsToBrain(brain);
		brain.explainWords();
	}

}
