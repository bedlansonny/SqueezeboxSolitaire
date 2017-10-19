import java.io.*;
import java.util.*;
public class Game
{
    String[] cards;
    int cardIndex;
    ArrayList<ArrayDeque> piles;


    public Game(String[] cards)
    {
        this.cards = cards;
        cardIndex = 0;
        piles = new ArrayList<>();
    }

    public void check()
    {
        //go through to move if possible
        for(int pileIndex = 0; pileIndex < piles.size(); pileIndex++)
        {
            if(move(pileIndex))
                check();
        }

        if(cardIndex < 52)
        {
            flip();
            check();
        }
    }

    public void flip()
    {
        ArrayDeque newArrayDeque = new ArrayDeque();
        newArrayDeque.add(cards[cardIndex]);
        cardIndex++;
        piles.add(newArrayDeque);
    }

    public boolean move(int pileIndex)
    {
        if(pileIndex == 0)
            return false;
        else if(pileIndex < 3)
        {
            if(piles.get(pileIndex-1).getFirst().equals(piles.get(pileIndex).getFirst()))
            {
                //move top card to pile over!!!!!!!!!!!!!!!!!

                return true;
            }
        }
    }

    public String output()
    {
        String output = "";
        for(ArrayDeque arrDeq : piles)
        {
            output += arrDeq.size() + " ";
        }
        return output;
    }
}
