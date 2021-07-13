package model;

public abstract class Video {
	private String title;
	private String category;

	public Video() {
		super();
		
	}
	
	public Video(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	
	

}
