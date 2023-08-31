public class Main {
    public static void main(String[] args) {
        //Song song = new Song("Love", 2.35);

        Album album = new Album("Always Love");

        album.addSongToAlbum("Love", 2.35);

        album.printAlbumList();
    }


}