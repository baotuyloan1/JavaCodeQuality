package edu.fa.util;

import edu.fa.model.Student;

public class StudentManagement {
	public boolean isPassed(Student student) {
		if (student.getScore() >= 5) {
			return true;
		}
		return false;
	}
}
