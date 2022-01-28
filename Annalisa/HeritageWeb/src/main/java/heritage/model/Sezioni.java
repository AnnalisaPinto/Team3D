package heritage.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Sezioni {
	public static List<Sezione> ReadAll() {
		List<Sezione> sezioni = new ArrayList<Sezione>();
	
		ConnessioneDB connessione = new ConnessioneDB();

		try {
			connessione.connect();

			ResultSet set = connessione.executeQuery("Select * from sezioni");

			while (set.next()) {
				int id = set.getInt("id");
				String iframe = set.getString("iframe");
				String testo = set.getString("testo");
				int id_documento = set.getInt("id_documento");

				Sezione sezione = new Sezione(id,iframe, testo, id_documento);
				sezioni.add(sezione);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			sezioni = null;
		}
		return sezioni;
	}
	
	public static List<Sezione> ReadAllByDocument(int idDoc) {
		List<Sezione> sezioni = new ArrayList<Sezione>();
	
		ConnessioneDB connessione = new ConnessioneDB();

		try {
			connessione.connect();

			ResultSet set = connessione.executeQuery("Select * from sezioni where id_documento="+idDoc);

			while (set.next()) {
				int id = set.getInt("id");
				String iframe = set.getString("iframe");
				String testo = set.getString("testo");
				int id_documento = set.getInt("id_documento");

				Sezione sezione = new Sezione(id,iframe, testo, id_documento);
				sezioni.add(sezione);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			sezioni = null;
		}
		return sezioni;
	}
}
