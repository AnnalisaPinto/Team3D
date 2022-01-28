package heritage.model;

import java.util.List;


public class UserController {

	private Users user;
	private boolean loggato = false;

	
	public UserController(Users u, boolean bool) {
		this.user = u;
		this.loggato = bool;	
	}

	public UserController() {
		
	}
	
	public Users getUser() {
		return user;
	}

	public boolean isLoggato() {
		return loggato;
	}


	public String generaControlliLogin() {
		
		String html = "";
		
		
		if(!loggato) {
			html = "<div class=\"make-login\">\r\n"
					+ "	<a href=\"Login.jsp\">Login</a>\r\n"
					+ "</div>";
		} else {
		
			//System.out.println("l'id avatar dell'utente è"  + user.getId_avatar());
			html = "<div class=\"make-logout\">\r\n"
					+ "	<span class=\"user-icon\"><img src=\"../avatars/"+ user.getId_avatar()+ ".png\"></span>\r\n"
					+ "	<h4 class=\"username\">"+user.getNickname()+"</h4>\r\n"
					+ "	<a href=\"?mode=logout\">Logout</a>\r\n"
					+ "</div>";
		}
		return html;		
	}
	
	
	
	public String navigaUtente() {
		String html = "";
		if(!loggato) {
			html = "<h2>L'utente non è loggato</h2>";
		} else {
			html = "<ul><li>Nickname:" + user.getNickname() +  "</li>"
					+"<li>id:" + user.getId()+  "</li>"+ " <li>email:" + user.getMail_address() +  "</li></ul>";
		}
		return html;
	}
	
	public String messaggioConferma() {
		String html = "";
		if(!loggato) {
			html = "<h2>L'utente non esiste o la password è errata</h2>";
		} else {
			html = "<h2>Hai indovinato la password, bravo!</h2><input type=\"hidden\" id=\"loggato\" data-loggato=\"loggato\">";
		}
		return html;
	}
	
	public String generaContatti() {
		
		return "";
	}
	
	/**
	 * Genera il dropdown della navbar. Cambia l'avatar in base a quello scelto
	 * dall'utente scelto. Nel menu, permette l'accesso ai contatti e il logout.
	 * 
	 * @return HTML in stringa
	 */
	public String generaDropdown() {
		String html = "";
		if (!loggato) {
			html = "<img src=\"../avatars/0.png\" alt=\"\" class=\"avatar\"\r\n"
					+ "					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n"
					+ "					role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n"
					+ "					<ul class=\"dropdown-menu dropdown-menu-end\"\r\n"
					+ "						aria-labelledby=\"navbarDropdown\">\r\n"
					+ "						<li><a class=\"dropdown-item\" href=\"Login.jsp\">Login</a></li>\r\n"
					+ "						<li><hr class=\"dropdown-divider\"></li>\r\n"
					+ "						<li><a class=\"dropdown-item\" href=\"#\">Registrati</a></li>\r\n"
					+ "					</ul>";
		} else {
			html = "<img src=\"../avatars/" + user.getId_avatar() + ".png\" alt=\"\" class=\"avatar\"\r\n"
					+ "					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n"
					+ "					role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n"
					+ "					<ul class=\"dropdown-menu dropdown-menu-end\"\r\n"
					+ "						aria-labelledby=\"navbarDropdown\">\r\n"
					+ "						<li><a class=\"dropdown-item\" href=\"#\">Contatti</a></li>\r\n"
					+ "						<li><hr class=\"dropdown-divider\"></li>\r\n"
					+ "						<li><a class=\"dropdown-item\" href=\"?mode=logout\">Logout</a></li>\r\n"
					+ "					</ul>";
		}
		return html;
	}
	public static List<Users> ReadAll() {

		ConnessioneJson json = new ConnessioneJson();
		
		return json.getList("http://localhost:8081/svgProject/listaImmaginiJson");
	}
	
	public static Users ReadOne() {

		ConnessioneJson json = new ConnessioneJson();
		
		return json.getObject("http://localhost:8081/svgProject/listaImmaginiJson");
	}
		
	
}
