package user.service.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private int idAvatar;
	@Column(unique = true)
	private String nickname;
	private String password;
	private String mailAddress;

	/*
	 * @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) private Set<Contact>
	 * contact;
	 */

	protected User() {

	}

	public User(int id, int id_avatar, String nickname, String password, String mailAddress) {

		this.id = id;
		this.idAvatar = id_avatar;
		this.nickname = nickname;
		this.password = password;
		this.mailAddress = mailAddress;
	}

	
	public User(String nickname, String password, String mailAddress, int id_avatar) {

		this.nickname = nickname;
		this.password = password;
		this.mailAddress = mailAddress;
		this.idAvatar = id_avatar;
	}

	public User(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_avatar() {
		return idAvatar;
	}

	public void setId_avatar(int id_avatar) {
		this.idAvatar = id_avatar;
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

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
