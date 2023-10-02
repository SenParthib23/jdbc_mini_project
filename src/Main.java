import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
//            Employee employee = new Employee();
//            employee.setName("Nobita");
//            employee.setEmail("Nobita@gmail.com");
//            employee.setId(3);
//
//            EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
//            employeeDao.updateEmployee(employee);
////            employeeDao.deleteEmployee(4);
//            employeeDao.getEmployeeById(2);
        Employee employee = new Employee();

        EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();

        Scanner sc  = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            System.out.println("************************");
            System.out.println("Select from the options below");
            System.out.println("************************");
            System.out.println("Press 1: Add Employee");
            System.out.println("Press 2: Update Employee");
            System.out.println("Press 3: Delete Employee");
            System.out.println("Press 4: Get all employee");
            System.out.println("Press 5: Get employee by Id");
            System.out.println("Press 6: Exit");

            System.out.print("Enter your choice: ");
            int input  =  sc.nextInt();
            switch (input){
                case 1: {
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter email: ");
                    String email = sc.next();
                    employee.setName(name);
                    employee.setEmail(email);
                    employeeDao.addEmployee(employee);
                    System.out.println("New record added...");
                    break;
                }
                case 2: {
                    System.out.print("Enter Id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Email: ");
                    String email = sc.next();
                    employee.setId(id);
                    employee.setName(name);
                    employee.setEmail(email);
                    employeeDao.updateEmployee(employee);
                    System.out.println("Employee data updated...");
                    break;
                }
                case 3:{
                    System.out.print("Enter Id: ");
                    int id = sc.nextInt();
                    employee.setId(id);
                    employeeDao.deleteEmployee(id);
                    System.out.println("Employee data deleted...");
                    break;
                }
                case 4:{
                    employeeDao.getEmployees();
                    System.out.println("Displaying all employees");
                    break;
                }
                case 5:{
                    System.out.print("Enter Id: ");
                    int empId = sc.nextInt();
                    employee.setId(empId);
                    employeeDao.getEmployeeById(empId);
                    System.out.println("Displaying employee with given id...");
                    break;
                }
                case 6:{
                    flag = false;
                    break;
                }
            }
        }

    }
}