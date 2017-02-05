/**
 * Created by John on 2017-01-10.
 */
public class W17Jan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int counter = 100; counter >= 1; counter -= 5)
        {
            System.out.println(counter);
        }
        int snowDepth = 31;
        System.out.printf("With %d cm of snow, we should ski (not board): %b%n",
                snowDepth,timeToSki(snowDepth));
        snowDepth = 30;
        System.out.printf("With %d cm of snow, we should ski (not board): %b%n",
                snowDepth,timeToSki(snowDepth));

        patternGen(5);
        patternGen(50);

        Card myFirstCard = new Card("Ace","Spades",14); //valid card
        //Card mySecondCard = new Card("Ace","spades",1); //invalid card

        System.out.printf("The first card is: %s%n", myFirstCard.toString());

        DeckOfCards theGameDeck = new DeckOfCards();

        for (int i=1; i<= 52; i++)
        {
            System.out.println(theGameDeck.dealTopCard());
        }

        theGameDeck = new DeckOfCards();
        theGameDeck.shuffle();

        System.out.println("\nAfter shuffling the deck");

        for (int i=1; i<= 52; i++)
        {
            System.out.println(theGameDeck.dealTopCard());
        }


    }  // end of the main method


    public static boolean timeToSki(int snowDepth)
    {
        if (snowDepth > 30)
            return true;
        else
            return false;
    }

    public static void patternGen(int numOfStars)
    {
        for ( ; numOfStars >= 1 ; numOfStars--)
        {
            for (int i = numOfStars; i > 0; i--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}