package application.model;

public class Link {

	private Long id;
	private String link;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Link(Long id, String link) {
		super();
		this.id = id;
		this.link = link;
	}
	
	public Link() {
		super();
	}


}
