package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="users")
public class User {
		@Id
		@Column(name="username")
		private String name;
		private String password;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public User(String name, String password) {
			super();
			this.name = name;
			this.password = password;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
