package web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ed.tutorials.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService ; 

	@RequestMapping(value = "/findEmployee", method = RequestMethod.GET)
	public @ResponseBody Object findEmployee() {
		
	return employeeService.findEmployee();
	}
	
	
}
