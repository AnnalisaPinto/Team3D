package admin.model;

public class Documento {
	private int id;
	private String titolo;
	private String data;
	private boolean amministratore;
	

	public Documento(int id, String titolo, String data, boolean amministratore) {
		this.id = id;
		this.titolo = titolo;
		this.data = data;
		this.amministratore = amministratore;
	}

	public Documento() {
	}
	
	

	public Documento(boolean amministratore) {
		this.amministratore = amministratore;
	}

	public Documento(int id, String titolo, String data) {
		this.id = id;
		this.titolo = titolo;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isAmministratore() {
		return amministratore;
	}

	public void setAmministratore(boolean amministratore) {
		this.amministratore = amministratore;
	}

}
