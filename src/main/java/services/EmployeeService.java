package services;

public class EmployeeService {
	 Long addEmployee(EmployeeDTO employeeDTO);

	  List<EmployeeObj> getAllEmployees();

	    String deleteEmployee(Long id);

	    EmployeeObj getEmployee(Long id);

	    EmployeeObj updateEmployee(EmployeeDTO employeeObj, Long id);
	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}

}
