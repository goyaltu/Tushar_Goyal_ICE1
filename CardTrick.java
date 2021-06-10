package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
import java.util.Random;
public class CardTrick {

    private static Object input;
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomValue());
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] =c;
            Scanner input = new Scanner(System.in);
}
            for (Card magicHand1 : magicHand) 
            {
                System.out.println(magicHand1.getSuit() + " " + magicHand1.getValue());
        }
                System.out.println("Select a card of your choice");
                System.out.println("Select the card value");
                
                int cValue = input.nextInt();
                System.out.println("Select the suit of card");
                System.out.println("1 (Hearts), 2 = Diamonds, 3 = Spades, 4 = Clubs");
                
                int cSuit = input.nextInt();
                System.out.println("The card is" + cValue + "of" + cSuit);
                System.out.print("Now we will check if your card is in the magic hand");
                
                if(cValue== magicHand1.getValue() && cSuit == magicHand1())
                {
                    System.out.println("And we did it");
                }
                else
                {
                    System.out.println("Better luck next time!");
                }
    }
}