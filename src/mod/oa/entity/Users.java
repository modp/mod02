package mod.oa.entity;

import java.util.Date;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String userLogin;
	private String userPass;
	private String userSex;
	private String userEdubg;
	private String userGradfrom;
	private String userPhone;
	private String userEmail;
	private Date userBirthday;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String userName, String userLogin, String userPass,
			String userSex, String userEdubg, String userGradfrom,
			String userPhone, String userEmail, Date userBirthday) {
		this.userName = userName;
		this.userLogin = userLogin;
		this.userPass = userPass;
		this.userSex = userSex;
		this.userEdubg = userEdubg;
		this.userGradfrom = userGradfrom;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userBirthday = userBirthday;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserEdubg() {
		return this.userEdubg;
	}

	public void setUserEdubg(String userEdubg) {
		this.userEdubg = userEdubg;
	}

	public String getUserGradfrom() {
		return this.userGradfrom;
	}

	public void setUserGradfrom(String userGradfrom) {
		this.userGradfrom = userGradfrom;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getUserBirthday() {
		return this.userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

}