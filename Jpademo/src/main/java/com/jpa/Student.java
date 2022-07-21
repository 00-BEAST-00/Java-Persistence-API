package com.jpa;
import javax.persistence.*;
@Entity
@Table(name = "login") 
public class Student {

	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "name")
		private String stuname;
		@Column(name = "email")
		private String stuemail;
		@Column(name = "dob")
		private String studob;
		@Column(name = "password")
		private String stupassword;
		public Student(String stuname, String stuemail, String studob, String stupassword) {
			super();
			
			this.stuname = stuname;
			this.studob = studob;
			this.stuemail = stuemail;
			this.stupassword = stupassword;
		}
		
		public Student() {
			super();
		}

		public String getStuname() {
			return stuname;
		}

		public void setStuname(String stuname) {
			this.stuname = stuname;
		}

		public String getStuemail() {
			return stuemail;
		}

		public void setStuemail(String stuemail) {
			this.stuemail = stuemail;
		}

		public String getStudob() {
			return studob;
		}

		public void setStudob(String studob) {
			this.studob = studob;
		}

		public String getStupassword() {
			return stupassword;
		}

		public void setStupassword(String stupassword) {
			this.stupassword = stupassword;
		}
		
}