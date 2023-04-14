package edu.fa.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.fa.model.Student;

public class StudentManagementTest {

	@Test
	public void testBeingPassed() {
		StudentManagement management = new StudentManagement();
		Student student = new Student("Bao", "Da Nang", 6);
		assertTrue(management.isPassed(student));
	}

	@Test
	public void testNotPassed() {
		StudentManagement management = new StudentManagement();
		Student student = new Student("Bao", "Da Nang", 3);
		assertFalse(management.isPassed(student));

	}
}
