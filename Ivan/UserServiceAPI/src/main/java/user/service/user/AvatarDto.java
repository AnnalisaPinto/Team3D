package user.service.user;

public class AvatarDto {

	private int id;
	private String src;
	
	public AvatarDto() {
	
	}
	
	public AvatarDto(int id, String src) {
		super();
		this.id = id;
		this.src = src;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}
	
}
