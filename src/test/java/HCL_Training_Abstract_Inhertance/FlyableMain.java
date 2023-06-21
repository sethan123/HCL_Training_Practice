package HCL_Training_Abstract_Inhertance;




public class FlyableMain {
	
	    public static void main(String[] args) {
	        Spacecraft spacecraft = new Spacecraft();
	        spacecraft.fly_obj();

	        Airplane airplane = new Airplane();
	        airplane.fly_obj();

	        Helicopter helicopter = new Helicopter();
	        helicopter.fly_obj();
	    }
}
