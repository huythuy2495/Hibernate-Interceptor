// default package
// Generated Jul 11, 2013 4:54:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * StudentInformation generated by hbm2java
 */
public class StudentInformation implements java.io.Serializable {

	private Integer studentId;
	private Student student;
	private String address;
	private String registryNumber;
	private String phoneNumber;
	private Date enlisted;

	public StudentInformation() {
	}

	public StudentInformation(Student student, String address, Date enlisted) {
		this.student = student;
		this.address = address;
		this.enlisted = enlisted;
	}

	public StudentInformation(Student student, String address,
			String registryNumber, String phoneNumber, Date enlisted) {
		this.student = student;
		this.address = address;
		this.registryNumber = registryNumber;
		this.phoneNumber = phoneNumber;
		this.enlisted = enlisted;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegistryNumber() {
		return this.registryNumber;
	}

	public void setRegistryNumber(String registryNumber) {
		this.registryNumber = registryNumber;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getEnlisted() {
		return this.enlisted;
	}

	public void setEnlisted(Date enlisted) {
		this.enlisted = enlisted;
	}

}
