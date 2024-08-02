package in.angulareducloud.portal.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userRoles")
public class UserRole {

	@Id
	private long userRoleId;

	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	@ManyToOne
	private Role role;
	
	public long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public UserRole(long userRoleId) {
		super();
		this.userRoleId = userRoleId;
	}

	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
