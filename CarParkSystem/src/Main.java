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
        
    }   
    
}

