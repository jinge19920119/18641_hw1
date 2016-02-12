/*
 * Name: Ge Jin . Andrew id: gjin.
 */

package coin;

public class Simulation {
	public static void main(String[] args){
		Coin coin= new Coin();
		int cnthead=0, cnttail=0;
		System.out.println("it is initially facing up: "+ coin.getSideUp());
		System.out.println();
		for(int i=0;i<20;i++)
		{
			coin.toss();
			if(coin.getSideUp().equals("heads")){
				cnthead++;
				System.out.println((i+1)+"th toss, it is facing up: "+coin.getSideUp());
			} else {
				cnttail++;
				System.out.println((i+1)+"th toss, it is facing up: "+coin.getSideUp());
			}
		}
		System.out.println("it has "+cnthead+" heads");
		System.out.println("it has "+cnttail+" tails");
	}

}
