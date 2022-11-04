package CW1;

public class Song
{
    private int numberofSongs = 0;

    int id;
    public int numberOfPlays;
    public String songName;

    public String artist;

    // Songs class constructor
    public Song(int numberOfPlays, String songName)
    {
        numberofSongs++;
        id = numberofSongs;

        this.numberOfPlays = numberOfPlays;
        this.songName = songName;

    }

    // display() method to display
    // the Songs data
    public void display() {

        System.out.println("Song name: " + songName + "\n" + "Amount of times played: " + numberOfPlays);
        System.out.println();

    }

//    public int getNumberofSongs()
//    {
//        return;
//    }
}
