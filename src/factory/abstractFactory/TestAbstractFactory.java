package factory.abstractFactory;

public class TestAbstractFactory {
	
	public static void main(String[] args) {
		
		Factory f=new Factory();
		SampleA sampleAA=f.createA(1);
		SampleA sampleAB=f.createA(2);
		sampleAA.Say();
		sampleAB.Say();
		
		SampleB sampleBA=f.createB(1);
		SampleB sampleBB=f.createB(2);
		sampleBA.Say();
		sampleBB.Say();
	}

}
