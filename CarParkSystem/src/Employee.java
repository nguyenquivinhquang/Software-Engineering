import java.util.ArrayList;
import java.util.HashSet;

public class Employee {
    private String id;
	private String name;
	private String phone;
	private ArrayList<Permit> permits = new ArrayList<Permit>();

	public Employee(String id, String name, String phone){
        this.id = id; 
        this.name = name;
        this.phone = phone;
    }
	
	public void addPermit(Permit permit){
        permits.add(permit);
    }
    public void deletePermit(Permit permit){
        permits.remove(permit);
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }

}
