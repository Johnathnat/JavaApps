import helpers.ConsoleColours;
import helpers.InputReader;
import CW1.*;


public class App 
{
    //vars
    static  String myName;

    public static void main(String[] args) throws Exception
    {

        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by ");
        System.out.println();
        // New Name Input

        PlayList app = new PlayList();
        app.run();
    }
}
