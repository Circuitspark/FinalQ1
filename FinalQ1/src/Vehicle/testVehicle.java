package Vehicle;
import java.util.HashMap;
import java.util.UUID;

public class testVehicle {
	
	private Person PersonA;
	private Person PersonB;
	private Truck TheTruck;
	private MotorCycle TheMoto;
	HashMap SubClasses = new HashMap();
	
	public void main(){
		PersonA = new Person("Don", "Merritt", UUID.randomUUID());
		TheTruck = new Truck("Git'r'Done Mobile", "Red", 230.5, PersonA, 2);
		PersonB = new Person("Brendan", "Quinn", UUID.randomUUID());
		TheTruck.transferOwnership(PersonB);
		TheMoto = new MotorCycle("Rice Burner", "Green", 150.5, PersonA, false);
		SubClasses.put(TheTruck, TheMoto);
	}

}
