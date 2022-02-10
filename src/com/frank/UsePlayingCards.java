package com.frank;

import java.util.ArrayList;
import java.util.List;

public class UsePlayingCards {
// This is our application program which will instantiate object and use thier methods to manipulate them
// We know this is the application program because it has the main() method
	public static void main(String[] args) {
		

		AmericanPlayingCard aUSACard = new AmericanPlayingCard(AmericanPlayingCard.CardValue.ONE, AmericanPlayingCard.CardSuit.HEART);
		System.out.println("aUSACard is :");
		aUSACard.showCard();  // runs the AmericanPlayingCard showCard()

		AmericanPlayingCard aUSACard2 = new AmericanPlayingCard(AmericanPlayingCard.CardValue.KING, AmericanPlayingCard.CardSuit.SPADE);
		System.out.println("aUSACard2 is :");
		aUSACard2.showCard();  // runs the AmericanPlayingCard showCard()

		ItalianPlayingCard anItalianCard1 = new ItalianPlayingCard(ItalianPlayingCard.CardValue.CAVALLO, ItalianPlayingCard.CardSuit.COINS);
		System.out.println("anItalianCard1 is : ");
		anItalianCard1.showCard();

		SwissPlayingCard aSwissCard1 = new SwissPlayingCard(SwissPlayingCard.CardValue.KOENIG, SwissPlayingCard.CardSuit.ROSES);
		System.out.println("anSwissCard 1: ");
		aSwissCard1.showCard();

		System.out.println("-".repeat(50) + "\n Polymorphism examples start here \n" + "-".repeat(50));

		PlayingCard aCard;

		System.out.println("Assigned an ItalianPlayingCard to PlayingCard reference");
		aCard = anItalianCard1;

		aCard.showCard();

		System.out.println("Assigned an AmericanPlayingCard to PlayingCard reference");
		aCard = aUSACard;
		aCard.showCard();

		System.out.println("Assigned an SwissPlayingCard to PlayingCard reference");
		aCard = aSwissCard1;

		aCard.showCard();

		System.out.println("-".repeat(50) + "\n Process an ArrayList of subclass objects using Polymorphism \n" + "-".repeat(50));

		List<PlayingCard> someCards = new ArrayList<PlayingCard>();

		someCards.add(aSwissCard1);
		someCards.add(aUSACard);
		someCards.add(anItalianCard1);

		for (PlayingCard theCard : someCards) {
			theCard.showCard();
		}


	}  // End of main()

}  // End of class that holds main()
