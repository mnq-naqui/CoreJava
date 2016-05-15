/**
 Program no 66 Lara Material
 */
package com.lara.rst;

interface Switch
{	void on();
	void off();
	}
class Fan
{
	private boolean runningStatus;
	public Switch getSwitch()
	{
		return new Switch()
		{

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
		public boolean getRunningStatus()
		{
			return runningStatus;
		}
	
}
public class Manager15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fan f1=new Fan();
		Switch s1=f1.getSwitch();
		s1.on();
		System.out.println(f1.getRunningStatus());
		s1.off();
		System.out.println(f1.getRunningStatus());
	}

}
