package colletions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jukebox {
ArrayList<Song> songList=new ArrayList<Song>();
	public static void main(String[] args) {
		new Jukebox().go();
	}
	public void go() {
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}
	public void getSongs() {
		try{
			File file=new File("song.txt");
		BufferedReader reader=new BufferedReader(new FileReader(file));
		String line=null;
		while((line=reader.readLine())!=null){
	//		addSong(line);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
/*	 public void addSong(String lineToParse) {
		String[] tokens=lineToParse.split("/");
		Song nextSong = new Song(tokens[0] , tokens[1], tokens [2] , tokens[3]);
		songList.add(nextSong);
 
	}*/
	}
}
