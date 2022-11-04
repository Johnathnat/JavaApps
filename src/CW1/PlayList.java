package CW1;
import helpers.InputReader;
import java.io.*;
import java.lang.*;
import java.util.*;
public class PlayList
{
    // Declaring an array of Songs
    private Song[] songs;

    public void run()
    {
    /**
            Allocating memory for objects
            of type Songs
         */
        songs = new Song[100];

        stockSongs();

        //amount of songs
        //int NoOfSongs = songs.length;
        System.out.println(songs.length);

        addSongs();
        printList();
        removeSongs();
        printList();
    }
    // Function to add x in arr
//    public static int[] addX(int n, int songs[], int x)
//    {
//        int i;
//
//        // create a new array of size n+1
//        int newarr[] = new int[n + 1];
//
//        // insert the elements from
//        // the old array into the new array
//        // insert all elements till n
//        // then insert x at n+1
//        for (i = 0; i < n; i++)
//            newarr[i] = songs[i];
//
//        newarr[n] = x;
//
//        return newarr;
   // }
    private void addSongs() {
        /**
          User added song
          */
        String newSongName = InputReader.getString("Enter song name: ");
        int newNumberOfPlays = InputReader.getInt("Enter Number of Plays: ");


        
        int index = getLastSong()+1;
        songs[index] = new Song(newNumberOfPlays, newSongName);
        //var addedsong = new Song(newNumberOfPlays, newSongName);
        //songs = addX(addedsong);

    }

    private int getLastSong()
    {
        int count = 0;

        for(Song song : songs)
        {
            if(song == null)
                return count;
            else count++;
        }
        return count;
    }
    //boolean wantToRemoveSong = removeSong();
    /**
     * Removing a song
    */
    private void removeSongs() {
        int songNumber = songs.length;

        while (songNumber < songs.length) {

            System.out.println("Song " + songNumber + ":");
            songNumber = songNumber - 1;
            songs[songNumber].display();
        }
        //int numberOfSong = InputReader.getInt("What song number do you want to remove?");

        songs[numberOfRemovedSong()] = null;
    }

/**
 * print list
 * */
    private void printList() {
        System.out.println(songs.length);
        int songNumber = 0;
        //int fixedNumberOfSong = numberOfRemovedSong();
        while (songNumber < 100) {



           // if (songNumber == fixedNumberOfSong) continue;
            System.out.print(songNumber + " ");
            System.out.println("Song " + songNumber + ":");
            songs[songNumber].display();
            songNumber = songNumber + 1;
        }
    }
//Sort List
       // https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/




    private void stockSongs()
    {
        songs[0] = new Song(59966519, "Bushes of love");
        songs[1] = new Song(9856635, "Hostiles on the hill");
        songs[2] = new Song(2462358, "Chocolate Lagoon");
        songs[3] = new Song(27123148, "Not the Future");
        songs[4] = new Song(138342537, "Seagulls");
        songs[5] = new Song(29837715, "Not my stick");
        songs[6] = new Song(32165042, "Carl Poppa");
        songs[7] = new Song(8522785, "Sample of my pasta");
        songs[8] = new Song(13413787, "Kicked your monkey");
        songs[9] = new Song(1849229, "Don't stare at the sun");

    }

    /**
    public static boolean doRemoveSong(){
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
     */
    public static int numberOfRemovedSong()
    {
        int numberOfRemovedSong = InputReader.getInt("What song number do you want to remove?");

        return numberOfRemovedSong;
    }
}
