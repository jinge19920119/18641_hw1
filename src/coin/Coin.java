/*
 * Name: Ge Jin . Andrew id: gjin.
 */
package coin;

import java.util.*;

public class Coin {
	private String sideUp;
	private Random x= new Random();
	Coin() {
		
		if(x.nextBoolean())
			sideUp= "heads";
		else 
			sideUp= "tails";
	}
	
	void toss() {
		if(x.nextBoolean())
			sideUp= "heads";
		else
			sideUp= "tails";
	}
	
	String getSideUp() {
		return sideUp;
	}
	

}
