package Vehicle;

public class Truck extends Vehicle implements vehicleinterface{
	
	private int NumberOfAxels;
	
	public Truck(String Name, String Color, Double Weight, Person Owner, int NumberOfAxels){
		super(Name, Color, Weight, Owner);
		this.NumberOfAxels = NumberOfAxels;
	}
	
	public int GetNumberOfAxels(){
		return NumberOfAxels;
	}
	
	public void SetNumberOfAxels(int number){
		this.NumberOfAxels = number;
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
