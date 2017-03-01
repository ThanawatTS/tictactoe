package softspac_XO;


public class Player {

	private String name;
	Symbol s;
	Player(){
	}

	Player(String name,String symValue)
	{
		this.name = name;
		this.s = new Symbol(symValue);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Symbol getsymValue(){
		return s;
	}

}