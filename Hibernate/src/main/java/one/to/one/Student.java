package one.to.one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String name;
	private int age;
	@OneToOne
	private Address addressName;

	public Student() {
		super();

	}

	public Student(int studentId, String name, int age, Address addressName) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.addressName = addressName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddressName() {
		return addressName;
	}

	public void setAddressName(Address addressName) {
		this.addressName = addressName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", addressName=" + addressName
				+ "]";
	}

}
