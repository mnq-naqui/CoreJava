package anonymous.innerclass;

public class Fan {
	
	private boolean runningStatus;
	public Switch getSwitch(){
		return new Switch(){

			@Override
			public void on() {
				runningStatus=true;
			}

			@Override
			public void off() {
				runningStatus=false;
			}
			
		};
	}
	public boolean getRunningStatus() {
		return runningStatus;
	}
	
}
