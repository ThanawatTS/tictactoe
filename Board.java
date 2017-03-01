package softspac_XO;

public class Board {

	int SIZE = 9;
	String board[][];
	boolean endGame = true;
	Square sq;
	public Board(){
		board = new String[SIZE][SIZE];
		for(int i = 0 ; i < SIZE ; i++ ) {
			for(int j = 0 ; j < SIZE ;j++ ){
				board[i][j] = "-";
			}
		}
	}


	public void placeSymbo(Symbol s,int r , int c){
		board[r][c] = s.getValue();
		update(s,r,c);
	}

	public void update(Symbol s,int r , int c) {
		
		int x1,y1,x2,y2;
		int a = r;
		int b = c;

		for(int j = 0 ; j < 4 ; j++ ) {
			int counter = 0;
			
			if(j==0){
				x1=1;
				y1=1;
				x2=1;
				y2=-1;
			}else if(j==1){
				x1=-1;
				y1=-1;
				x2=-1;
				y2=1;
				
			}else if(j==2){
				x1=0;
				x2=0;
				y1=1;
				y2=-1;
			}else{
				x1 =1;
				x2=-1;
				y1=0;
				y2=0;
			}
			
			for(int i = 0 ; i < 2 ; i++ ){
				a=r;
				b=c;

				while(true){			
					if(a < 9 && b< 9 && a >=0 && b >=0){
						if(board[a][b].equals(s.getValue()) ) {
							counter++;
						}else{					
							break;
						}
					}else{
						break;
					}
					if(i==0){
						a+=x1;
						b+=y1;
					}else{
						a+=x2;
						b+=y2;
					}
				}

				if(counter > 5){
					endGame = false;
					return;
				}

			}
		}
		
		

	}


	public String [][]getBoard(){
		return board;
	}






	public boolean finishGame(Player p){
		if( endGame == false )System.out.println("Player's "+p.getName() + " WIN !!!");
		return endGame;
	}

	public void print(){
		System.out.println("0 1 2 3 4 5 6 7 8 9");
		for( int i = 0 ; i < 9 ; i++ ) {
			System.out.print(i+1 + " ");
			for( int j = 0 ; j < 9 ; j++ ) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
