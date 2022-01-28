package users.model;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UsersRepository {

	public static int findOneByNickname(String nickname) {

		// ???
		ConnessioneDB connessione = new ConnessioneDB();
		int count = 0;
		try {
			connessione.connect();

			ResultSet set = connessione
					.executeQuery("SELECT COUNT(*) as 'risultato' FROM user WHERE nickname='" + nickname + "';");
			set.next();
			count = set.getInt("risultato");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public static Users verificaLogin(String nickname, String password) {
		ConnessioneDB connessione = new ConnessioneDB();
		Users user = null;
		try {
			connessione.connect();

			ResultSet set = connessione
					.executeQuery("SELECT * FROM user WHERE nickname='" + nickname + "' AND password ='" + password +"';");
			if(set.next()) {
				int id = set.getInt("id");
				int id_avatar = set.getInt("id_avatar");
				String mail_address = set.getString("mail_address");
				String nickname_trovato = set.getString("nickname");
				
				user = new Users(id, id_avatar, mail_address, nickname_trovato, null);
			};
		
					
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
		
	}
	
	
	
	
	
}
