package com.spring.crudStudent.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crudStudent.entity.Student;
import com.spring.crudStudent.repository.StudentRepo;
import com.spring.crudStudent.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}
	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student) ;
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

}
