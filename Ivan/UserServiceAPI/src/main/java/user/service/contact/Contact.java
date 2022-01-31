package user.service.contact;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import user.service.user.User;

@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/*
	 * private int askerUserId; 
	 * private int askedUserId;
	 */

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "askerUserId")
	private User asker;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "askedUserId")
	private User asked;
	/*
	 * @ManyToOne
	 * @JoinColumn(name = "askedUserId") private User asked;
	 */
	//Status richiesta: 0 - Attesa di risposta, 1 - Accettato, 2 - Rifiutato;
	private int status;

	protected Contact() {

	}
	
	public Contact(int id, User asker, User asked, int status) {

		this.id = id;
		this.asker = asker;
		this.asked = asked;
		this.status = status;
	}
	
	public Contact(User asker, User asked, int status) {
		
		this.asker = asker;
		this.asked = asked;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getAsker() {
		return asker;
	}

	public void setAsker(User asker) {
		this.asker = asker;
	}

	public User getAsked() {
		return asked;
	}

	public void setAsked(User asked) {
		this.asked = asked;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
}
