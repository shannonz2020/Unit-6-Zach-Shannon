public class Album {
    private String albumName;
    private String artistName;
    private int numSongs;
    private double numMinutes;

    public Album(String albumName, String artistName, int numSongs, double numMinutes){
        this.albumName = albumName;
        this.artistName = artistName;
        this.numSongs = numSongs;
        this.numMinutes = numMinutes;
    }

    public double getNumMinutes() {
        return numMinutes;
    }

    public int getNumSongs() {
        return numSongs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String toString(){
        return "Album name: " + albumName + "\nArtist name: "
                + artistName + "\n" + numSongs + " songs\n" + numMinutes + " mins";
        //return (albumName + " by " + artistName + " / " + numSongs + " songs / Playtime: " + numMinutes + " mins");
    }
}
