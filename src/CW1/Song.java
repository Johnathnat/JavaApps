package CW1;
// Creating a Songs class with
// id and songName as attributes
class Song {
    public int numberOfPlays;
    public String songName;
    public String artistName;

    // Songs class constructor
    Song(int numberOfPlays, String songName, String artistName)
    {
        this.numberOfPlays = numberOfPlays;
        this.artistName = artistName;
        this.songName = songName;
    }

    public void display()
    {

        System.out.println("Song name: " + songName + "\n" + "By: "+ artistName +"\nAmount of times played: " + numberOfPlays);
        System.out.println();

    }

     public String getSongName()
    {
        return songName;
    }
    public void setSongName(String name) {
        this.songName = name;
    }
//    public static int getNumberOfPlays() {
//        return numberOfPlays;
//    }
//
//    public void getNumberOfPlays(int numberOfPlays) {
//        this.numberOfPlays = numberOfPlays;
//    }

    // display() method to display
    // the Songs data




}
/**In the friday practical sessing David helped me with some of the problems I was having with my code but it then turned out there was alot more wrong with it but in trying to fix it it was then unusable by me so I found a early verstion of my code on my home compluter.
This was a preivous working vertion of my code that I used to do the testing but I ran out of time to fully compleate it */
