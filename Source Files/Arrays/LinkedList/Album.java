import java.util.ArrayList;

public class Album {

    private ArrayList<Song> albumSongList;
    private String albumName;

    public Album(String albumName) {
        this.albumSongList = new ArrayList<Song>();
        this.albumName = albumName;
    }

    public void addSongToAlbum (String songName, double duration) {
        albumSongList.add(Song.createNewSong(songName, duration));
    }

    public void printAlbumList () {
        for (int i = 0; i < albumSongList.size(); i++) {
            System.out.println("Song: " + (i + 1) + " = " + albumSongList.get(i).getSongName());
        }
    }
}
