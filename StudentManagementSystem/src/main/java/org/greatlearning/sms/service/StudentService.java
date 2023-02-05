package org.greatlearning.sms.service;

import java.util.List;

import org.greatlearning.sms.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(int id);

	public void save(Student student);

	public void deleteById(int id);

}
