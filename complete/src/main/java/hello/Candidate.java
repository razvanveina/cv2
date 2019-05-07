
package hello;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity // This tells Hibernate to make a table out of this class
public class Candidate {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;

  private String surname;

  private String email;

  private String phone;

  private boolean eligibleForTest;

  private CallOutcome testCallOutcome;

  private boolean presentAtTest;

  @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
  private Date testDate;

  private boolean eligibleForInterview;

  private CallOutcome interviewCallOutcome;

  private boolean presentAtInterview;

  @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
  private Date interviewDate;

  private String details;

  private double hrGrade;

  private double testGrade;

  private double interviewGrade;

  private String schoolInfo;

  private int schoolYear;

  private int maxSchoolYear;

  private String cvFileName;

  public Candidate() {
    super();
  }

  public Candidate(String name, String surname, String email, String phone) {
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.phone = phone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public boolean isEligibleForTest() {
    return eligibleForTest;
  }

  public void setEligibleForTest(boolean eligibleForTest) {
    this.eligibleForTest = eligibleForTest;
  }

  public CallOutcome getTestCallOutcome() {
    return testCallOutcome;
  }

  public void setTestCallOutcome(CallOutcome testCallOutcome) {
    this.testCallOutcome = testCallOutcome;
  }

  public Date getTestDate() {
    return testDate;
  }

  public void setTestDate(Date testDate) {
    this.testDate = testDate;
  }

  public boolean isEligibleForInterview() {
    return eligibleForInterview;
  }

  public void setEligibleForInterview(boolean eligibleForInterview) {
    this.eligibleForInterview = eligibleForInterview;
  }

  public CallOutcome getInterviewCallOutcome() {
    return interviewCallOutcome;
  }

  public void setInterviewCallOutcome(CallOutcome interviewCallOutcome) {
    this.interviewCallOutcome = interviewCallOutcome;
  }

  public Date getInterviewDate() {
    return interviewDate;
  }

  public void setInterviewDate(Date interviewDate) {
    this.interviewDate = interviewDate;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public double getHrGrade() {
    return hrGrade;
  }

  public void setHrGrade(double hrGrade) {
    this.hrGrade = hrGrade;
  }

  public double getTestGrade() {
    return testGrade;
  }

  public void setTestGrade(double testGrade) {
    this.testGrade = testGrade;
  }

  public double getInterviewGrade() {
    return interviewGrade;
  }

  public void setInterviewGrade(double interviewGrade) {
    this.interviewGrade = interviewGrade;
  }

  public String getSchoolInfo() {
    return schoolInfo;
  }

  public void setSchoolInfo(String schoolInfo) {
    this.schoolInfo = schoolInfo;
  }

  public int getSchoolYear() {
    return schoolYear;
  }

  public void setSchoolYear(int schoolYear) {
    this.schoolYear = schoolYear;
  }

  public int getMaxSchoolYear() {
    return maxSchoolYear;
  }

  public void setMaxSchoolYear(int maxSchoolYear) {
    this.maxSchoolYear = maxSchoolYear;
  }

  @Override
  public String toString() {
    return "Candidate [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", phone=" + phone + "]";
  }

  public String getCvFileName() {
    return cvFileName;
  }

  public void setCvFileName(String cvFileName) {
    this.cvFileName = cvFileName;
  }

  /**
   * @return the presentAtTest
   */
  public boolean isPresentAtTest() {
    return presentAtTest;
  }

  /**
   * @param presentAtTest the presentAtTest to set
   */
  public void setPresentAtTest(boolean presentAtTest) {
    this.presentAtTest = presentAtTest;
  }

  /**
   * @return the presentAtInterview
   */
  public boolean isPresentAtInterview() {
    return presentAtInterview;
  }

  /**
   * @param presentAtInterview the presentAtInterview to set
   */
  public void setPresentAtInterview(boolean presentAtInterview) {
    this.presentAtInterview = presentAtInterview;
  }

}
