package one.to.one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String addressName;
	private int studentId;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, String addressName, int studentId) {
		super();
		this.addressId = addressId;
		this.addressName = addressName;
		this.studentId = studentId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressName=" + addressName + ", studentId=" + studentId + "]";
	}


}
