package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class JasonLima_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> blackbearTracks = new ArrayList<Song>();
    Blackbear blackbearBand = new Blackbear();
	
	blackbearTracks = blackbearBand.getBlackbearSongs();
	
	playlist.add(blackbearTracks.get(0));
	playlist.add(blackbearTracks.get(1));
	playlist.add(blackbearTracks.get(2));
	
	
	ArrayList<Song> tokyoPoliceClubTracks = new ArrayList<Song>();
	TokyoPoliceClub toykoPoliceClubBand = new TokyoPoliceClub();
	
	tokyoPoliceClubTracks = toykoPoliceClubBand.getTokyoPoliceClubSongs();
	
	playlist.add(tokyoPoliceClubTracks.get(0));
	playlist.add(tokyoPoliceClubTracks.get(1));
	playlist.add(tokyoPoliceClubTracks.get(2));
	
    return playlist;
	}
}
