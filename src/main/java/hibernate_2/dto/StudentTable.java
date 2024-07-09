package hibernate_2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class StudentTable {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String name;
	private String email;
	private String password;
	private long phone;
	private String address;
	public StudentTable(int id, String name, String email, String password, long phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	public StudentTable() {
		super();
	}
	@Override
	public String toString() {
		return "StudentTable [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone="
				+ phone + ", address=" + address + "]";
	}
	
}
