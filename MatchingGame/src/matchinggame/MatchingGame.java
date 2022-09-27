/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchinggame;

import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class MatchingGame {

private int val;
	private boolean revVal;

	public MatchingGame(int value) 
	{
		val = value;
		revVal = false;
	}

	public int getValue() 
	{
		return val;
	}

	public boolean isrevVal() 
	{
		return revVal;
	}

	public void setrevVal(boolean bool) 
	{
		revVal = bool;
	}

	public static void displayBoard(MatchingGame[][] cards)
	{


		System.out.println("\t\t1\t2\t3\t4");
		System.out.println("\t-----------------------------------");
		for (int i = 0; i < cards.length; i++) {

			System.out.print((i + 1) + "\t|\t");
			for (int j = 0; j < cards[0].length; j++) {

				if (cards[i][j].isrevVal())
					System.out.print(cards[i][j].getValue() + "\t");
				else
					System.out.print("*\t");
			}
			System.out.println();
		}
	}

	public static MatchingGame[][] createBoard()
	{
		MatchingGame[][] b = new MatchingGame[4][4];
		for (int i = 1; i <= 8; i++) 
		{

			for (int j = 1; j <= 2; j++)
			{
				boolean selectedLocation = false;
				while (!selectedLocation)
				{

					int row = (int) (Math.random() * 4);
					int col = (int) (Math.random() * 4);
					if (b[row][col] == null) {

						selectedLocation = true;
						b[row][col] = new MatchingGame(i);

					}
				}
			}
		}


		return b;
	}

	public static boolean wonGame(MatchingGame[][] b1) 
	{
	for (int i = 0; i < b1.length; i++) {
			for (int j = 0; j < b1[0].length; j++) {

				if (!b1[i][j].isrevVal())
					return false;
			}
		}

		return true;
	}

	public static void main(String[] args)
	{

		MatchingGame[][] board = createBoard();
		Scanner input = new Scanner(System.in);
		while (!wonGame(board)) {
			displayBoard(board);


			System.out.print("Enter first x-coordinate value: ");
			int col1 = input.nextInt();
			System.out.print("Enter first y-coordinate value: ");
			int row1 = input.nextInt();

			System.out.print("Enter second x-coordinate value: ");
			int col2 = input.nextInt();
			System.out.print("Enter second y-coordinate value: ");
			int row2 = input.nextInt();

			MatchingGame card1 = board[row1 - 1][col1 - 1];
			MatchingGame card2 = board[row2 - 1][col2 - 1];

	if (card1.getValue() == card2.getValue() && !(row1 == row2 && col1 == col2)) {
				card1.setrevVal(true);
				card2.setrevVal(true);
			} else if (row1 == row2 && col1 == col2) {
				System.out.println("Select the same point is not acceptable.");
			}

			else {
System.out.println("Sorry, " + card1.getValue() + " and " + card2.getValue() 
+ " do not match.");
			}

			System.out.println("-----");

		}
		displayBoard(board);
	}
}