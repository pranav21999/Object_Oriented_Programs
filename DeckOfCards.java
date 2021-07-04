package com.deck;
import java.util.*;

public class DeckOfCards {
    int ROWS=4;
    int COLS= 13;
    String deck[][] =new String[ROWS][COLS];
    String[] suit = {"clubs","diamond", "hearts","spades"};
    String[] face = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};

	//Initialize game
  	 public void deck(){
            for (int row =0 ; row<ROWS;row++){
                for (int col=0;col<COLS; col++) {
                    deck[row][col] = suit[row]+" "+face[col];
                  System.out.println(" " +deck[row][col]);
                }
            }
    }

    	 	//Display card to each player
    	    public void displayCards() {
    	    	Scanner scanner=  new Scanner(System.in);
    	    	System.out.println("with how many player you have to play");
    	    	int no=scanner.nextInt();
    	        for (int i = 0; i < no; i++) {
    	            System.out.println("Cards for Person " + (i + 1) +":");
    	            System.out.println("**********");
    	            for (int j = 0; j < 9; j++) {
    	                System.out.println(deck[i][j]);
    	            }
    	            System.out.println("**********");
    	        }
    	        }

    	    }
	//msthod for shuffle card
    	public void shuffleDeck(String[] suit, String[] face) {
            deck();
            for (int row =0 ; row<ROWS;row++){
                for (int col=0;col<COLS; col++){
                        int faceRandom= (int) (Math.random()*(COLS-1));
                        int suitRandom= (int) (Math.random()*(ROWS-1));
                        String temp = deck[suitRandom][faceRandom];
                        deck[suitRandom][faceRandom]=deck[row][col];
                        deck[row][col]=temp;
                        System.out.println(" " +deck[row][col]);
                }
            }
    }

