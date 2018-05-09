package iib.gov.in.eo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IIW_USER_MST")
public class UserDetailsEO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5387260945996457954L;
	
	@Column(name="WFL_USER_ID")
	@Id
	private Integer userId = null;
	@Column(name="WFL_USER_NAME")
	private String userName = null;
	@Column(name="WFL_PASSWORD")
	private String password = null;
	

	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
