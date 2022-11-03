import helpers.InputReader;

class GFG
{

    public static void main(String args[])
    {

        // Declaring an array of Songs
        Songs[] arr;

        // Allocating memory for 11 objects
        // of type Songs
        arr = new Songs[11];

        // Initializing the first element
        // of the array
        arr[0] = new Songs(59966519, "Bushes of love");
        arr[1] = new Songs(9856635, "Hostiles on the hill");
        arr[2] = new Songs(2462358, "Chocolate Lagoon");
        arr[3] = new Songs(27123148, "Not the Future");
        arr[4] = new Songs(138342537, "Seagulls");
        arr[5] = new Songs(29837715, "Not my stick");
        arr[6] = new Songs(32165042, "Carl Poppa");
        arr[7] = new Songs(8522785, "Sample of my pasta");
        arr[8] = new Songs(13413787, "Kicked your monkey");
        arr[9] = new Songs(1849229, "Don't stare at the sun");

        //amount of songs
        int NoOfSongs = arr.length;
        System.out.println(NoOfSongs);

        //User added song
        if (addSong() == false) {
            String newSongName = InputReader.getString("Enter song name: ");
            int newNumberOfPlays = InputReader.getInt("Enter Number of Plays: ");
            arr[NoOfSongs-1] = new Songs(newNumberOfPlays, newSongName);
        }
        else {
            arr= new Songs[10];
            arr[0] = new Songs(59966519, "Bushes of love");
            arr[1] = new Songs(9856635, "Hostiles on the hill");
            arr[2] = new Songs(2462358, "Chocolate Lagoon");
            arr[3] = new Songs(27123148, "Not the Future");
            arr[4] = new Songs(138342537, "Seagulls");
            arr[5] = new Songs(29837715, "Not my stick");
            arr[6] = new Songs(32165042, "Carl Poppa");
            arr[7] = new Songs(8522785, "Sample of my pasta");
            arr[8] = new Songs(13413787, "Kicked your monkey");
            arr[9] = new Songs(1849229, "Don't stare at the sun");
            NoOfSongs= NoOfSongs-1;
        }

        //boolean wantToRemoveSong = removeSong();
    //Removing a song
        if (removeSong() == false){
            int songNumber = NoOfSongs +1;
            while (songNumber< NoOfSongs) {

                System.out.println("Song " + songNumber+":");
                songNumber = songNumber - 1;
                arr[songNumber].display();
            }
            //int numberOfSong = InputReader.getInt("What song number do you want to remove?");
            int fixedNumberOfSong= numberOfRemovedSong();
            arr[fixedNumberOfSong] = null;

        }
        else {

        }
//print list
        System.out.println(NoOfSongs);
        int songNumber = 0;
        while (songNumber<NoOfSongs) {
            songNumber = songNumber + 1;
            int fixedNumberOfSong = 5;

            if(songNumber == fixedNumberOfSong) continue;
                System.out.print(songNumber +" ");
            System.out.println("Song " + songNumber+":");
            arr[songNumber-1].display();
        }
//Sort List
       // https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/


    }
    public static boolean removeSong(){
        System.out.println("Do you want to remove a song?");
        int choice = InputReader.getInt("Yes=1 No=2");
        boolean wantToRemoveSong = Boolean.parseBoolean(null);
        switch(choice)
        {
            case 1: wantToRemoveSong = false; break;
            case 2: wantToRemoveSong = true; break;
        }


        return wantToRemoveSong;
    }

    public static boolean addSong(){
        System.out.println("Do you want to add a song?");
        int choice = InputReader.getInt("Yes=1 No=2");
        boolean wantToAddSong = Boolean.parseBoolean(null);
        switch(choice)
        {
            case 1: wantToAddSong = false; break;
            case 2: wantToAddSong = true; break;
        }


        return wantToAddSong;
    }
    public static int numberOfRemovedSong()
    {
        int numberOfSong = InputReader.getInt("What song number do you want to remove?");
        int fixedSongNumber = numberOfSong-1;
        return fixedSongNumber;
    }
}



// Creating a Songs class with
// id and songName as a attributes
class Songs {

    public int numberOfPlays;
    public String songName;

    // Songs class constructor
    Songs(int numberOfPlays, String songName)
    {
        this.numberOfPlays = numberOfPlays;
        this.songName = songName;

    }

    // display() method to display
    // the Songs data
    public void display()
    {

        System.out.println("Song name: " + songName + "\n" + "Amount of times played: " + numberOfPlays);
        System.out.println();

    }
}