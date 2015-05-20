package Vehicle;

public class Car extends Vehicle implements vehicleinterface{
	
	private int NumberOfDoors;
	
	public Car(String Name, String Color, Double Weight, Person Owner, int NumberOfDoors){
		super(Name, Color, Weight, Owner);
		this.NumberOfDoors = NumberOfDoors;
	}
	
	public int GetNumberOfDoors(){
		return NumberOfDoors;
	}
	
	public void SetNumberOfDoors(int number){
		this.NumberOfDoors = number;
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
