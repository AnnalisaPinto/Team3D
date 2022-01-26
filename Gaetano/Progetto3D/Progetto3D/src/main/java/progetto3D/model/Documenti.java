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

			ResultSet set = connessione.executeQuery("Select * from sezionedocumenti");

			while (set.next()) {
				int id = set.getInt("id");
				String titolo = set.getString("titolo");
				String descrizione = set.getString("descrizione");
				String iframe = set.getString("iframe");

				Documento documento = new Documento(id,titolo, descrizione, iframe);
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
				String descrizione = set.getString("descrizione");
				String iframe = set.getString("iframe");
				documento = new Documento(id,titolo, descrizione, iframe);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			documento = null;
		}
		return documento;
	}
}
