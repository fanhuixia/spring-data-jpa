package cn.itlaobing.test;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import cn.itlaobing.entity.Student;
import cn.itlaobing.service.StudentService;
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StundetTest {
	Logger logger=Logger.getLogger(this.getClass());
	@Autowired
	private StudentService studentService;
	@Test
	public void findAllTest(){
		List<Student> list=studentService.selectAll();
		for(Student stu:list) {
			logger.info(stu);
		}
	}
}
