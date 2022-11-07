package CW1;

import helpers.InputReader;

import java.util.List;




public class PlayList
{
    /** Declaring an array of Songs*/
    private CW1.Song[] arr;

    public void run()
    {


        /**
         * Allocating memory for 11 type of Songs
         * It should be more but for some reason It won't work*/
        arr = new CW1.Song[11];

        stockSongs();
        menuSelection();

        //amount of songs

        System.out.println(arr.length);

        //boolean wantToRemoveSong = removeSong();
    }
//print list
    public void printList()
    {
        stockSongs();
        System.out.println(arr.length);
        int songNumber = 0;
        int fixedNumberOfSong = numberOfRemovedSong()+1;
        while (songNumber<arr.length) {
            songNumber = songNumber + 1;

            if(songNumber == fixedNumberOfSong) continue;

            //System.out.print(songNumber +" ");
            System.out.println("Song " + songNumber+":");
            arr[songNumber-1].display();

    }
//Sort List
        // https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
    }

    private void sortSongs()
    {
        int numberofPlays=7;
        //int numberofPlays = Song.getNumberOfPlays();
        int wantedRange = InputReader.getInt("Enter the number of play you want the songs to be above");
        if (numberofPlays<=wantedRange)
        {
            int songNumber = 0;

            while (songNumber<arr.length) {
                songNumber = songNumber + 1;

                if (songNumber == wantedRange) continue;

                //System.out.print(songNumber +" ");
                System.out.println("Song " + songNumber + ":");
                arr[songNumber-1].display();
            }
        }

    }


    private void stockSongs()
    {
        // Initializing the first element
        // of the array
        List<CW1.Song> songs = List.of(
                arr[0] = new Song(59966519, "Bushes of love", "Bad Lip Reading"),
                arr[1] = new Song(9856635, "Hostiles on the hill", "Bad Lip Reading"),
                arr[2] = new Song(2462358, "Chocolate Lagoon", "Bad Lip Reading"),
                arr[3] = new Song(27123148, "Not the Future", "Bad Lip Reading"),
                arr[4] = new Song(138342537, "Seagulls", "Bad Lip Reading"),
                arr[5] = new Song(29837715, "Not my stick", "Bad Lip Reading"),
                arr[6] = new Song(32165042, "Carl Poppa", "Bad Lip Reading"),
                arr[7] = new Song(8522785, "Sample of my pasta", "Bad Lip Reading"),
                arr[8] = new Song(13413787, "Kicked your monkey", "Bad Lip Reading"),
                arr[9] = new Song(1849229, "Don't stare at the sun", "Bad Lip Reading"));
    }




    public  boolean removeSong()
    {
//Removing a song

        int songNumber = arr.length +1;
        while (songNumber< arr.length) {

            System.out.println("Song " + songNumber+":");
            songNumber = songNumber - 1;
            arr[songNumber].display();
        }
        boolean NOSInputCheck = false;
        int numberOfSong = InputReader.getInt("What song number do you want to remove?");
        while(!NOSInputCheck) {

            if (numberOfSong < 0) {
                System.out.println("\n Invalid choice try again!\n");

            } 
            else NOSInputCheck = true;
            int fixedNumberOfSong = numberOfRemovedSong();
            arr[fixedNumberOfSong] = null;
        }
    

        return false;
    }

    public boolean addSong()
    {
        String newSongName = InputReader.getString("Enter song name: ");
        String newArtistName = InputReader.getString("Enter artist name: ");

        boolean NOPInputCheck = false;

        int newNumberOfPlays = InputReader.getInt("Enter Number of Plays: ");
        while(!NOPInputCheck)
        {

            if(newNumberOfPlays < 0)
            {
                System.out.println("\n Invalid choice try again!\n");

            }
            else NOPInputCheck = true;
                arr[arr.length-1] = new Song(newNumberOfPlays, newSongName, newArtistName);
                printList();
    
        }


        return NOPInputCheck;
    }
    public static int numberOfRemovedSong()
    {
        int numberOfSong = InputReader.getInt("What song number do you want to remove?");
        int fixedSongNumber = numberOfSong-1;
        return fixedSongNumber;
    }



    /**Menu*/

    private void menuSelection()
    {
        boolean programRunning = true;

        while(programRunning == true)
        {
            int choice = menuInput();

            switch(choice)
            {
                case 1: printList(); break;
                case 2: addSong(); break;
                case 3: removeSong(); break;
                case 4: sortSongs(); break;
                case 5: programRunning = false; break;
            }
        }
    }

    //Menu checker
    private static int menuInput()
    {
        System.out.println(" \nMy song List\n");

        int menuChoice = 0;
        boolean menuInputCheck = false;

        while(!menuInputCheck)
        {
            //The Menu
            System.out.println("Menu:\n 1: Print song list");
            System.out.println("2: Add song");
            System.out.println("3: Remove song");
            System.out.println("4: Filter List");
            System.out.println("5: End Program");

            menuChoice = InputReader.getInt("\n Please enter your choice (1 to 5) > ");

            if(menuChoice < 1 || menuChoice > 5)
            {
                System.out.println("\n Invalid choice try again!\n");
            }
            else menuInputCheck = true;
        }

        return menuChoice;
    }


}




