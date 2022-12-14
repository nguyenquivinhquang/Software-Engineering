public class Main{
    public static void main(String[] args) throws Exception {
        CarParkSystem cps = new CarParkSystem();

        // Add employee successful
//        System.out.println("-------------------------------------------");
        cps.addEmployee("001", "Nguyen Qui Vinh Quang", "11111111");
        cps.addEmployee("002", "Bui The Sang", "22222222");
        cps.addEmployee("003", "Nguyen Xuan Tung", "33333333");

        // Add permit successful
//        System.out.println("-------------------------------------------");
        cps.addPermit("A01", "B01", "001");
        cps.addPermit("A02", "B02", "001");
        cps.addPermit("A03", "B03", "002");
        cps.addPermit("A04", "B04", "003");
//        cps.getAllPermitDetail();
        // getPermit infor
        cps.getAllPermitDetail();



//        // Add permit failed
//        System.out.println("-------------------------------------------");
//        System.out.println("Add permit failed");
//        cps.addPermit("A04", "B05", "001");
//        cps.addPermit("A05", "B04", "001");
//
//        // Change employee's phone number
//        System.out.println("-------------------------------------------");
//        System.out.println("Change employee's phone number");
//        cps.changeEmployeePhone("001", "44444444");
//
//        // Delete an employee
//        System.out.println("-------------------------------------------");
//        System.out.println("Delete an employee");
//        cps.deleteEmployee("001");
//
//        // Terminate a permit
//        System.out.println("-------------------------------------------");
//        System.out.println("Terminate a permit");
//        cps.deletePermit("A02");
//
//        // Replace a permit
//        System.out.println("-------------------------------------------");
//        System.out.println("Replace a permit");
//        cps.replacePermit("A03", "A05", "B05");
//
//        // Get employee's detail based on permit number
//        System.out.println("-------------------------------------------");
//        System.out.println("Get employee's detail based on permit number");
//        cps.getEmployeeDetail("A04");
//
//        // Get all permit
//        System.out.println("-------------------------------------------");
//        System.out.println("Get all permit");
//        cps.getAllPermitDetail();
    }   
    
}

