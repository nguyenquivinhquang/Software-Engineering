public class Permit {
    private String permitNr;
	private String regNr;
	private Employee owner;
	
	public Permit(String permitNr, String regNr, Employee owner){
        this.permitNr = permitNr;
        this.regNr = regNr;
        this.owner = owner;
    }

    public String getPermitNr(){
        return permitNr;
    }
    public void setPermitNr(String permitNr){
        this.permitNr = permitNr;
    }
    public String getRegNr(){
        return regNr;
    }
    public void setRegNr(String regNr){
        this.regNr = regNr;
    }
    public Employee getOwner(){
        return owner;
    }
    public void setOwner(Employee owner){
        this.owner = owner;
    }
}
