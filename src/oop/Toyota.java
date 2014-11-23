package oop;


/* This is a Concrete class which can implements Car interface and extends MotorVehicle Abstract class.
 Then implements few own methods and variables. */

public class Toyota extends MotorVehicle implements Car  {	
	
	public static double distance(){
		double  fuel= 10;
		double  milepergallon = 5;
		double distance1 = fuel*milepergallon;
		
		return distance1;
	}
		
	

	@Override
	public void start() {
      double speed	=0;	
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop(){};
// 
 


	


	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void fuel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void LicencePlate() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void type() {
		// TODO Auto-generated method stub
		
	}

		
		
	}

