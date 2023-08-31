public class Song {

    private String songName;
    private double duration;

    public Song(String song, double duration) {
        this.songName = song;
        this.duration = duration;
    }


    public String getSongName() {
        return songName;
    }

    public double getDuration() {
        return duration;
    }

    public static Song createNewSong (String songName, double duration) {
        return new Song(songName, duration);
    }
}
