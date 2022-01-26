package progetto3D.model;

public class Documento {
	private int id;
	private String titolo;
	private String descrizione;
	private String iframe;

	public Documento(int id,String titolo, String descrizione, String iframe) {
		this.id = id;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.iframe = iframe;
	}

	public Documento() {
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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getIframe() {
		return iframe;
	}

	public void setIframe(String iframe) {
		this.iframe = iframe;
	}

}
