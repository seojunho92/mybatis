package ch01;

import java.sql.Date;

public class User {
	private int userId;
	private String userName;
	private Date regDate;
	
	public int getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %s", userId, userName, regDate);
	}
}
