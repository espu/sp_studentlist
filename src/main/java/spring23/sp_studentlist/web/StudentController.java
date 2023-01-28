package spring23.sp_studentlist.web;
import spring23.sp_studentlist.domain.Student;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@RequestMapping(value="/studentlist", method=RequestMethod.GET)
	public String viewStudents(Model model) {
		
		ArrayList<Student> student = new ArrayList<>();
		
		student.add(new Student("Kate", "Cole"));
		student.add(new Student("Dan", "Brown"));
		student.add(new Student("Mike", "Mars"));
		model.addAttribute("studentList", student);
		
		return "studentlist";
	}
}
