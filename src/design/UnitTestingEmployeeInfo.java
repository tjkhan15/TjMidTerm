package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo emp1 = new EmployeeInfo("Tanjim",1001);
        try {
            Assert.assertEquals("Tanjim", emp1.getEmployeeName());
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.assertEquals(1001, emp1.getEmployeeID());
        }
    }
}
