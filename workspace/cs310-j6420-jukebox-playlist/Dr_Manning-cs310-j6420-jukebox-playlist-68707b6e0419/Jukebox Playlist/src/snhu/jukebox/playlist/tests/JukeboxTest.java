package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}
	@Test
	public void testGetUshersAlbumSize() throws NoSuchFieldException, SecurityException { //by William Leischner
		 Usher usher = new Usher();
		 ArrayList<Song> ushersTracks = new ArrayList<Song>();
		 ushersTracks = usher.getUshersSongs();
		 assertEquals(3, ushersTracks.size());
	}
	
	@Test
	public void testGetKeithSweatsAlbumSize() throws NoSuchFieldException, SecurityException { //by William Leischner
		 KeithSweat keithSweat = new KeithSweat();
		 ArrayList<Song> keithSweatsTracks = new ArrayList<Song>();
		 keithSweatsTracks = keithSweat.getkeithSweatsSongs();
		 assertEquals(2, keithSweatsTracks.size());
	}

	
}
