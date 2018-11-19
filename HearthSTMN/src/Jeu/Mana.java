package Jeu;

public class Mana {
	int currentMana;
	int overallMana = 0;

	public void increase() {
		if (overallMana < 10) {
			overallMana++;
			currentMana = overallMana;
		}
		else {
			overallMana = 10;
			currentMana = overallMana;
		}
	}
	
	public void decrease(int cost) {
        if (cost <= currentMana) {
        	currentMana = currentMana - cost;
        	System.out.println("Mana restant  : " + currentMana);
        }
        else {
        	System.out.println("Not enough mana");
        }   
	}
}