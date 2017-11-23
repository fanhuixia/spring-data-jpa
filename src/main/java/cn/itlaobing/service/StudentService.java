package cn.itlaobing.service;

import java.util.List;

import cn.itlaobing.entity.Student;

public interface StudentService {
	//全查
	public List<Student> selectAll();
	//根据id查找
	public Student findById(Integer id);
}
