import java.util.HashMap;
import java.util.HashSet;

public class CarParkSystem {
    private HashMap<String, Employee> employeeList = new HashMap<>();
    private HashSet<Permit> permitList = new HashSet<>();

    public CarParkSystem() {
    }

    private Employee searchEmployee(String id) {
        if (this.employeeList.containsKey(id) == true) {
            return this.employeeList.get(id);
        }
        return null;
    }

    private Permit searchPermit(String permitNr, String regNr) {
        for (Permit p : permitList) {
            if (p.getPermitNr() == permitNr || p.getRegNr() == regNr) {
                return p;
            }
        }
        return null;
    }


    public void deleteEmployee(String id) {
        Employee e = searchEmployee(id);
        if (e != null) {
            employeeList.remove(e);
            System.out.println("Delete employee successfully");
        } else {

            System.out.println("Failed to delete employee");
        }
    }

    public void addEmployee(String id, String name, String phone) throws Exception {
        if (searchEmployee(id) == null) {
            employeeList.put(id, new Employee(id, name, phone));
            System.out.println("Add employee successfully");
        } else {
            throw new Exception("Add employee: " + id + ", " + name + ", " + phone + " failed\n" + "This employee already exist");
        }
    }

    public void changeEmployeePhone(String id, String phone) throws Exception {
        Employee e = searchEmployee(id);
        if (e != null) {
            e.setPhone(phone);
            System.out.println("Change employee with id: " + id + "'s phone number to " + phone);
        } else {
            throw new Exception("Failed to change phone number");
        }
    }

    public void addPermit(String permitNr, String regNr, String id) throws Exception {
        Employee e = searchEmployee(id);
        if (e != null && searchPermit(permitNr, regNr) == null) {
            Permit p = new Permit(permitNr, regNr, e);
            e.addPermit(new Permit(permitNr, regNr, e));
            permitList.add(p);
            System.out.println("Add permit successfully");
        } else {
            throw new Exception("Add permit: " + permitNr + ", " + regNr + " failed");
        }
    }

    public void deletePermit(String permitNr) throws Exception {
        Permit p = searchPermit(permitNr, null);
        if (p != null) {
            p.getOwner().deletePermit(p);
            permitList.remove(p);
            System.out.println("Delete permit successfully");
        } else {
            throw new Exception("Failed to delete permit");
        }
    }

    public void replacePermit(String oldPermitNr, String newPermitNr, String regNr) throws Exception{
        Permit old_permit = searchPermit(oldPermitNr, null);
        Permit new_permit = searchPermit(newPermitNr, regNr);
        if (old_permit != null && new_permit == null) {
            Employee owner = old_permit.getOwner();
            Permit p = new Permit(newPermitNr, regNr, owner);
            owner.deletePermit(old_permit);
            owner.addPermit(p);
            permitList.remove(old_permit);
            permitList.add(p);
            System.out.println("Replace permit succesfully: " + oldPermitNr + "->" + newPermitNr);
        } else {
            throw new Exception("Failed to replace permit");
        }
    }

    public void getEmployeeDetail(String permitNr) {
        String result = "";
        Permit p = searchPermit(permitNr, null);
        if (p != null) {
            Employee owner = p.getOwner();
            result += owner.getId() + ", " + owner.getName() + ", " + owner.getPhone();
        } else {
            result = "No corresponding permit number";
        }
        System.out.println(result);
    }

    public void getAllPermitDetail() {
        String result = "";
        if (permitList.size() > 0) {
            for (Permit p : permitList) {
                Employee e = p.getOwner();
                result += p.getPermitNr() + ", " + e.getId() + ", " + e.getName() + ", " + e.getPhone() + ", " + p.getRegNr() + "\n";
            }
        } else {
            result = "No permit in permit list";
        }
        System.out.println(result);
    }
}
