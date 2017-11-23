package cn.itlaobing.web;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.itlaobing.entity.Student;
import cn.itlaobing.service.StudentService;
@Controller
@RequestMapping("/students")
public class StundentController {
	@Autowired
	private StudentService studentService;
	//通用的方法
	@ModelAttribute
	public void paramed(@PathVariable(required=false) Integer id,Model model) {
		if(id==null) {
			model.addAttribute("student", new Student());
		}else {
			model.addAttribute("student", studentService.findById(id));
		}
	}
	//全查
	@RequestMapping()
	public String queryAll(Model model) {
		List<Student> list=studentService.selectAll();
		model.addAttribute("student",list);
		return "student/index";
	}
}
