
public enum BetterSports {
	KOSARKA {public int weight(int s) {return s*5;}},
	FUDBAL {public int weight(int s) {return 20*s;}},
	KRIKET {public int weight(int s) {return 3*4;}},
	SKVOSH {public int weight(int s) {return 34*s;}},
	VESLANJE {public int weight(int s) {return 32*s;}};
	
	public abstract int weight(int s);

}
