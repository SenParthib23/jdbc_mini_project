import java.sql.SQLException;

public class EmployeeDaoFactory {
    private static EmployeeDao employeeDao;
    private EmployeeDaoFactory(){

    }
    public static EmployeeDao getEmployeeDao() throws SQLException {
        if(employeeDao == null){
            employeeDao = new EmployeeDaoImpl();
        }
        return employeeDao;
    }
}
