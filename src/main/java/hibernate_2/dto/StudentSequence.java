package hibernate_2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class StudentSequence {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String email;
	private String password;
	private long phone;
	private String address;
	public StudentSequence(int id, String name, String email, String password, long phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	
	public StudentSequence() {
		super();
	}

	@Override
	public String toString() {
		return "StudentSequence [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	
}
