import java.util.EnumSet;

public enum Sports {
	VESLANJE, FUDBAL, KOSARKA, RUKOMET;
	
	public int weight(int s) {
		switch(this) {
		case FUDBAL:  return 3*s;
		case KOSARKA: return 5*s;
		case VESLANJE: return 10*s;
		case RUKOMET: return 32*s;
		}
		throw new AssertionError("Unknown " + this);
	}
	
	
}
