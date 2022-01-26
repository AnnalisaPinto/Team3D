package users.cestino;

import java.sql.ResultSet;
import java.sql.SQLException;

import users.model.ConnessioneDB;


public class UsersRepository {

	public static int findOneByNickname(String nickname) {

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
	
	
	
	public static int verificaLogin(String nickname, String password) {
		ConnessioneDB connessione = new ConnessioneDB();
		int count = 0;
		try {
			connessione.connect();

			ResultSet set = connessione
					.executeQuery("SELECT nickname, password, COUNT(*) as quanti  FROM user WHERE nickname='" + nickname + "' AND password ='" + password +"';");
			set.next();
			count = set.getInt("quanti");
					
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
		

	}
	
}
