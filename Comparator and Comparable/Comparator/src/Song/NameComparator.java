package Song;

import java.util.Comparator;

public class NameComparator implements Comparator<Song> {
    public int compare(Song song1, Song song2){
        return song1.songname.compareTo(song2.songname);
    }
}
