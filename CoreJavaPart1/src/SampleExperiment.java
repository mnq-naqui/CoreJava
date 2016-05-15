
public abstract class SampleExperiment {
private SampleExperiment(){
	
}
SampleExperiment(int i){
	
}
abstract void test();
}
class C extends SampleExperiment{
	public C(){
		super(12);
	}
	void test(){}
}