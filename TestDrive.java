import java.util.EnumSet;
import java.util.Set;

public class TestDrive {

	public static void main(String[] args) {
		Set<Sports> eSet = EnumSet.of(Sports.FUDBAL, Sports.KOSARKA);
		
	 for (BetterSports sports:BetterSports.values()) {
		 System.out.println(sports.weight(5));
	 }
	 
	}

}
