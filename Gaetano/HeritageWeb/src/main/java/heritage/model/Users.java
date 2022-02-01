package heritage.model;

public class Users {
	
	
	private int id;
	private int id_avatar;
	private String mail_address;
	private String nickname;
	private String password;
	
	public Users(int id, int id_avatar, String mail_address, String nickname, String password) {
		super();
		this.id = id;
		this.id_avatar = id_avatar;
		this.mail_address = mail_address;
		this.nickname = nickname;
		this.password = password;
	}
	public Users(int id, int id_avatar, String mail_address, String nickname) {
		super();
		this.id = id;
		this.id_avatar = id_avatar;
		this.mail_address = mail_address;
		this.nickname = nickname;
	
	}
	
	public Users() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_avatar() {
		return id_avatar;
	}
	public void setId_avatar(int id_avatar) {
		this.id_avatar = id_avatar;
	}
	public String getMail_address() {
		return mail_address;
	}
	public void setMail_address(String mail_address) {
		this.mail_address = mail_address;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
