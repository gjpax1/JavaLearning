import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

    //ListIterator<Song> myPlayList = new ListIterator<Song>();
    LinkedList<String> myPlayList;


    public Playlist() {
        myPlayList = new LinkedList<String>();

    }



    public boolean addInOrder(LinkedList<String> playlist, Song songName) {
    ListIterator<String> stringListIterator = playlist.listIterator();

    while (stringListIterator.hasNext()) {
        int comparison = stringListIterator.next().compareTo(songName.getSongName());

        if (comparison == 0) {
            System.out.println(songName.getSongName() + " is already included in the playlist");
            return false;
        }
        else if (comparison > 0) {
            stringListIterator.previous();
            stringListIterator.add(songName.getSongName());
            return true;
        }
        else if (comparison < 0) {
        }
    }
    stringListIterator.add(songName.getSongName());
    return true;
    }
}
