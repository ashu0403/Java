package Song;

import java.util.Comparator;

public class ArtistnameComparator implements Comparator<Song>{
    public int compare(Song song1, Song song2) {
    return song1.artistname.compareTo(song2.artistname);
    }
    
}
