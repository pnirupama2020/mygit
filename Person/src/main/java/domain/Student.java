package domain;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="STUDENT")
public class Student implements Comparable<Student> {

	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer ID;
	    
	    @Column(name="NAME")
	    private String name;
	    @Column(name="age")
	    private int age;
	   
	
	public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}


	public Integer getID() {
			return ID;
		}


		public void setID(Integer iD) {
			ID = iD;
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


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
