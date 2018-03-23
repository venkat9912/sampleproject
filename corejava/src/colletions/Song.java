package colletions;

public class Song implements Comparable<Song> {
	String title;
	String artist;
	String rating;
	String bpm;
	public Song(String title, String artist, String rating, String bpm) {
		
		title = title;
		artist = artist;
		rating = rating;
		bpm = bpm;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getRating() {
		return rating;
	}
	
	public String getBpm() {
		return bpm;
	}
	
	@Override
	public String toString() {
		return title;
	}

	@Override
	public int compareTo(Song arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
