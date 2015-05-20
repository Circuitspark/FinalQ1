package Vehicle;
import java.util.UUID;

public class Person {
	
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	public Person(String FirstName, String LastName, UUID PersonID) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.PersonID = PersonID;
	}
	
	public String GetFirstName(){
		return FirstName;
	}
	
	public String GetLastName(){
		return LastName;
	}
	
	public UUID GetPersonID(){
		return PersonID;
	}
	
	public void setFirstName(String name){
		this.FirstName = name;
	}
	
	public void setLastName(String name){
		this.LastName = name;
	}
	
	public void setPersonID(){
		this.PersonID = UUID.randomUUID();
	}

}
