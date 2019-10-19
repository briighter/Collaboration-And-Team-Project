package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class TokyoPoliceClub {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TokyoPoliceClub() {
    }
    
    public ArrayList<Song> getTokyoPoliceClubSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Bambi", "Tokyo Police Club");             		//Create a song
         Song track2 = new Song("Hands Reversed", "Tokyo Police Club");         //Create another song
         Song track3 = new Song("Break", "Tokyo Police Club");         			//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Tokyo Police Club
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Tokyo Police Club
         this.albumTracks.add(track3);                                          //Add the third song to song list for the Tokyo Police Club 
         return albumTracks;                                                    //Return the songs for the Tokyo Police Club in the form of an ArrayList
    }
}
