package model;

public class TvSeries extends Video {
	private int season;
	private int episode;
	public TvSeries() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TvSeries(String title, String category, int season, int episode) {
		super(title, category);
		this.episode=episode;
		this.season=season;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public int getEpisode() {
		return episode;
	}

	public void setEpisode(int episode) {
		this.episode = episode;
	}

	@Override
	public String toString() {
		return "TvSeries [season=" + season + ", episode=" + episode + ", getTitle()=" + getTitle() + ", getCategory()="
				+ getCategory() + "]";
	}
	
	
	
	
	
	
	
	
}
