package GenericCards;

import java.util.ArrayList;
import java.util.Collections;

public class Cards {
	private ArrayList<Card> pack;

	public Cards() {
		super();
		this.pack = new ArrayList<>();
		int count=0;
		do {
			Card card=new Card();
			if(!pack.contains(card)) {
				pack.add(card);
				count++;
			}
			
		} while (count<52);
	}
	public void shuffleCardPack() {
		Collections.shuffle(pack);
	}
	public void dealingCards(String name1, String name2, String name3, String name4) {
		String per1="";
		String per2="";
		String per3="";
		String per4="";
		for(int i=0;i<13;i++) {
			per1+=pack.get(4*i)+" ";
			per2+=pack.get(4*i+1)+" ";
			per3+=pack.get(4*i+2)+" ";
			per4+=pack.get(4*i+3)+" ";
		}
		System.out.println(name1+ " : "+per1+" ");
		System.out.println(name2+ " : "+per2+" ");
		System.out.println(name3+ " : "+per3+" ");
		System.out.println(name4+ " : "+per4+" ");
	}
	public void dealingCards(String name1, String name2, String name3) {
		String per1="";
		String per2="";
		String per3="";
		
		for(int i=0;i<13;i++) {
			per1+=pack.get(3*i)+" ";
			per2+=pack.get(3*i+1)+" ";
			per3+=pack.get(3*i+2)+" ";
			
		}
		System.out.println(name1+ " : "+per1+" ");
		System.out.println(name2+ " : "+per2+" ");
		System.out.println(name3+ " : "+per3+" ");
	
	}
	public void dealingCards(String name1, String name2) {
		String per1="";
		String per2="";
	
		for(int i=0;i<13;i++) {
			per1+=pack.get(2*i)+" ";
			per2+=pack.get(2*i+1)+" ";
		
		}
		System.out.println(name1+ " : "+per1+" ");
		System.out.println(name2+ " : "+per2+" ");
		
	}
}
