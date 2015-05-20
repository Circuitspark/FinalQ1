package Vehicle;

public abstract class Vehicle {
	
	public String Name;
	public String Color;
	public Double Weight;
	public Person Owner;
	
	public Vehicle(String Name, String Color, Double Weight, Person Owner){
		this.Name = Name;
		this.Color = Color;
		this.Weight = Weight;
		this.Owner = Owner;
	}
	
	public String GetName(){
		return Name;
	}
	
	public String GetColor(){
		return Color;
	}
	
	public Double GetWeight(){
		return Weight;
	}
	
	public Person GetOwner(){
		return Owner;
	}
	
	public void setName(String name){
		this.Name = name;
	}
	
	public void setColor(String color){
		this.Color = color;
	}
	
	public void setWeight(Double weight){
		this.Weight = weight;
	}
	
	public void setOwner(Person owner){
		this.Owner = owner;
	}
	
	public void transferOwnership(Person newOwner){
		this.Owner = newOwner;
	}

}
