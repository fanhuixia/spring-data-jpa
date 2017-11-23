package cn.itlaobing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itlaobing.entity.Student;
import cn.itlaobing.mapper.StudentMapper;
import cn.itlaobing.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper studentMapper;
	//全查
	@Transactional(readOnly=true)
	@Override
	public List<Student> selectAll() {
		List<Student> list=studentMapper.findAll();
		return list;
	}
	//根据Id查找
	@Transactional(readOnly=true)
	@Override
	public Student findById(Integer id) {
		return studentMapper.selectByPrimaryKey(id);
	}

}
