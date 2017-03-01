package softspac_XO;

import java.util.Scanner;

public class Game {


	public static void main(String []args){
		Player player1 = new Player("1","X");
		Player player2 = new Player("2", "O");
		Player p= new Player();
		Board b = new Board();
		Square s = new Square();
		Scanner input = new Scanner(System.in);
		int row ,column,turn = 0;

		while(b.finishGame(p)){	
			if(turn%2==0) p = player1;
			else p = player2;
			System.out.println("Player's "+p.getName());
			System.out.print("Input row: ");
			row = input.nextInt();
			System.out.print("Input coloum: ");
			column = input.nextInt();
			System.out.println();
			
			if(row > 9 || row <= 0 || column > 9 || column <=0) {
				System.out.println("Please choose new input .");
				System.out.println();
				continue;
			}
			if(s.check(b, row-1, column-1) ) {
				b.placeSymbo(p.getsymValue(), row-1, column-1);
				b.print();
				turn++;
			}else{
				System.out.println("Please choose new input .");
				System.out.println();
			}
		}



	}

}



