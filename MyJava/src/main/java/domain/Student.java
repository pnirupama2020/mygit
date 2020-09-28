package domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="STUDENT")
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID",nullable=false,unique = true)
	private Long id;
	@Column(name="FNAME")
	private String fname;
	@Column(name="LNAME")
	private String lname;
	@Column(name="AGE")
	private String age;
	    
        
		public Student(Long id, String fname, String lname, String age) {
			super();
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.age = age;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getFname() {
			return fname;
		}


		public void setFname(String fname) {
			this.fname = fname;
		}


		public String getLname() {
			return lname;
		}


		public void setLname(String lname) {
			this.lname = lname;
		}


		public String getAge() {
			return age;
		}


		public void setAge(String age) {
			this.age = age;
		}





}
