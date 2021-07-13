package model;

public class Movie extends Video {
	private String director;
	private int duration;
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, String category, String director, int duration) {
		super(title, category);
		this.director=director;
		this.duration=duration;
		// TODO Auto-generated constructor stub
	}
	
	

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie [director=" + director + ", duration=" + duration + ", getTitle()=" + getTitle()
				+ ", getCategory()=" + getCategory() + "]";
	}
	
	
	
	
	
}
