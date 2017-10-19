import java.util.*;
import java.io.*;
public class SqueezeSolitaire
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(new File("input.txt"));

        while(sc.hasNext())
        {
            String[] cards = new String[52];
            cards[0] = sc.next();
            if(cards[0].equals("#"))
                break;
            for(int i = 1; i < 52; i++)
                cards[i] = sc.next();



        }
    }
}
