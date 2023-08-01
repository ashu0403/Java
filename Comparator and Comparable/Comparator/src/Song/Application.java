package Song;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Song song1 = new Song("Fire", "bts", 4, "fire fire");
        Song song2 = new Song("yellow", "coldplay", 5, "yelow green");
        Song song3 = new Song("Fire", "bts", 6, "fire fire");
        List<Song> list = new ArrayList<Song>();
        list.add(song1);
        list.add(song2);
        list.add(song3);
        NameComparator name = new NameComparator();
        Collections.sort(list, name);
        for (Song song : list) {
            System.out.println(song.songname + " " + song.artistname + " " + song.artistname + " " + song.length);
        }
        System.out.println("Enter the choice 1. display short musci 2. facourite artist");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {

            case 1:
                lengthComparartor lc = new lengthComparartor();
                Collections.sort(list, lc);
                for (Song song : list) {
                    System.out
                            .println(song.songname + " " + song.artistname + " " + song.artistname + " " + song.length);
                }
                break;
            case 2:
                ArtistnameComparator ac = new ArtistnameComparator();
                Collections.sort(list, ac);
                for (Song song : list) {
                    System.out
                            .println(song.songname + " " + song.artistname + " " + song.artistname + " " + song.length);
                }
                break;
            default:
                System.out.println("Entet the valid choice");
        }
    }
}
