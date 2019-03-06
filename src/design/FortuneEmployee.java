package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo.setCompanyName("People and Tech");
		System.out.println(EmployeeInfo.getCompanyName());

		EmployeeInfo emp1 = new EmployeeInfo(1001);
		emp1.departments();
		emp1.assignDepartment();
		emp1.calculateSalary();
		emp1.numberOfYearsWithCompany();
		emp1.calculateEmployeeBonus();
		emp1.calculateEmployeePension();

		EmployeeInfo emp2 = new EmployeeInfo("Aktaruz Zaman",1002);

		EmployeeInfo emp3 = new EmployeeInfo("Mustafizur Rahman",1003,26);
		EmployeeInfo emp4 = new EmployeeInfo("Hero Mama", 1004, 37);

	}

}
