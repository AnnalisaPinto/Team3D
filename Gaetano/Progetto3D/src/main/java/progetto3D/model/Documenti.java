package progetto3D.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Documenti {
	public static List<Documento> ReadAll() {
		List<Documento> documenti = new ArrayList<Documento>();
	
		ConnessioneDB connessione = new ConnessioneDB();

		try {
			connessione.connect();

			ResultSet set = connessione.executeQuery("Select * from documenti order by data");

			while (set.next()) {
				int id = set.getInt("id");
				String titolo = set.getString("titolo");
				String data = set.getString("data");
				boolean amministratore = set.getBoolean("amministratore");

				Documento documento = new Documento(id,titolo, data, amministratore);
				documenti.add(documento);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			documenti = null;
		}
		return documenti;
	}
	
	public static List<Documento> ReadAllByAdmin() {
		List<Documento> documenti = new ArrayList<Documento>();
	
		ConnessioneDB connessione = new ConnessioneDB();

		try {
			connessione.connect();

			ResultSet set = connessione.executeQuery("Select * from documenti where amministratore = 1");

			while (set.next()) {
				int id = set.getInt("id");
				String titolo = set.getString("titolo");
				String data = set.getString("data");
				boolean amministratore = set.getBoolean("amministratore");

				Documento documento = new Documento(id,titolo, data, amministratore);
				documenti.add(documento);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			documenti = null;
		}
		return documenti;
	}

	public static Documento ReadOne(int idOne) {
		Documento documento = null;
		ConnessioneDB connessione = new ConnessioneDB();

		try {
			connessione.connect();

			ResultSet set = connessione.executeQuery("Select * from sezione_documenti where id=" + idOne);

			if (set.next()) {
				int id = set.getInt("id");
				String titolo = set.getString("titolo");
				String data = set.getString("data");
				boolean amministratore = set.getBoolean("amministratore");
				documento = new Documento(id,titolo, data, amministratore);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			documento = null;
		}
		return documento;
	}
}
