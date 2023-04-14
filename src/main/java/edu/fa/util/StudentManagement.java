package edu.fa.util;

import edu.fa.model.Student;

/**
 * @author BAO
 *
 */
public class StudentManagement {

  /**
   * @param student Student to check.
   * @return state of passing.
   */
  public boolean isPassed(Student student) {
    if (student.getScore() >= 5) {
      return true;
    }
    return false;
  }
}
