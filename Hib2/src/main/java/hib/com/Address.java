//Annotations types

package hib.com;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_add")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addid;
	private String street;
	private String city;
	@Column(name = "student_img")
	private byte[] imagae;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addid, String street, String city, byte[] imagae) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
		this.imagae = imagae;
	}

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public byte[] getImagae() {
		return imagae;
	}

	public void setImagae(byte[] imagae) {
		this.imagae = imagae;
	}

	@Override
	public String toString() {
		return "Address [addid=" + addid + ", street=" + street + ", city=" + city + ", imagae="
				+ Arrays.toString(imagae) + "]";
	}

}
