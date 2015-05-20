package Vehicle;

public class MotorCycle extends Vehicle implements vehicleinterface{
	
	private boolean hasSideCar;
	
	public MotorCycle(String Name, String Color, Double Weight, Person Owner, boolean hasSideCar){
		super(Name, Color, Weight, Owner);
		this.hasSideCar = hasSideCar;
	}
	
	public boolean gethasSideCar(){
		return hasSideCar;
	}
	
	public void sethasSideCar(boolean car){
		this.hasSideCar = car;
	}
	
	public String getName(){
		return Name;
	}
	
	public String getColor(){
		return Color;
	}
	
	public Double getWeight(){
		return Weight;
	}
	
	public Person getOwner(){
		return Owner;
	}
	@Override
	public void setName(String name){
		this.Name = name;
	}
	@Override
	public void setColor(String color){
		this.Color = color;
	}
	@Override
	public void setWeight(Double weight){
		this.Weight = weight;
	}
	@Override
	public void setOwner(Person owner){
		this.Owner = owner;
	}

}
