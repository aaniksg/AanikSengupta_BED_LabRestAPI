package org.greatlearning.sms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.greatlearning.sms.entity.Student;
import org.greatlearning.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	@Transactional
	public List<Student> findAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	@Transactional
	public Student findById(int id) {
		Student student = new Student();
		student = studentRepository.findById(id).get();
		return student;
	}

	@Override
	@Transactional
	public void save(Student student) {
		studentRepository.save(student);

	}

	@Override
	@Transactional
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}

}
