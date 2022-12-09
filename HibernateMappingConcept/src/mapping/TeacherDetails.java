package mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_details")
public class TeacherDetails {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "hobby")
	private String hobby;

	public TeacherDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherDetails(String city, String hobby) {
		
		this.city = city;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "TeacherDetails [id=" + id + ", city=" + city + ", hobby=" + hobby + "]";
	}
	
	
	
	

}
