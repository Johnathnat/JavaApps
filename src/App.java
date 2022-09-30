import helpers.ConsoleColours;
import helpers.InputReader;


public class App 
{
    //vars
    static  String myName;

    public static void main(String[] args) throws Exception
    {
        System.out.println(ConsoleColours.ANSI_BRIGHT_BG_PURPLE);
        System.out.println(ConsoleColours.ANSI_BRIGHT_BG_YELLOW);
        System.out.println(ConsoleColours.ANSI_BLACK);

        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();
        // New Name Input
        myName = InputReader.getString("Hello. What is your name?");
        System.out.println("Hello "+ myName);
    }
}
