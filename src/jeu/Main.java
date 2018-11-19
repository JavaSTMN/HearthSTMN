package jeu;

public class Main {
	public static void main(String[] args) {
		Mana mana = new Mana();
		int turn = 1;
		
		
		while(turn <= 20)
		{
			System.out.println("TOUR "+ turn);
			
			mana.gainMana();
			System.out.println("Mana début de tour : " + mana.currentMana);
			
			
			mana.lossMana();
			mana.lossMana();
			
			System.out.println("Mana fin de tour "+ mana.currentMana);
			System.out.println("");
			turn++;
		}
	}
	
	
}
