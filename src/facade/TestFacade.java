package facade;

public class TestFacade {
	
	public static void main(String[] args) {
		FacadeHead facadeHead=FacadeHead.getFacadeHeadInstance();
		facadeHead.explainWords("你在干吗？");
	}

}
