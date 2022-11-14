package model;

public class User {
	private String User_Name;
	private int Password;
	private String Acc_Holder_Name;
	private long Acc_No;
	private long ContactNo;
	private String EmailId;
	private long Current_Amount;

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {

		Password = password;
	}

	public String getAcc_Holder_Name() {
		return Acc_Holder_Name;
	}

	public void setAcc_Holder_Name(String acc_Holder_Name) {
		Acc_Holder_Name = acc_Holder_Name;
	}

	public long getAcc_No() {
		return Acc_No;
	}

	public void setAcc_No(long acc_No) {
		Acc_No = acc_No;
	}

	public long getContactNo() {
		return ContactNo;
	}

	public void setContactNo(long contact_No) {
		ContactNo = contact_No;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String email_Id) {
		EmailId = email_Id;
	}

	public long getCurrent_Amount() {
		return Current_Amount;
	}

	public void setCurrent_Amount(long Current_Amount) {
		this.Current_Amount = Current_Amount;
	}
}
