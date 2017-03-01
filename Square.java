package softspac_XO;

public class Square {
	
	 Square() {
		
	}
	public boolean check(Board b,int x ,int y) {
		if(b.getBoard()[x][y].equals("-"))return true;
		else return false;
	}
}
