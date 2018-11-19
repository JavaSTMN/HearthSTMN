package jeu;
import java.lang.Math;

public class Mana {
	int currentMana;
	int overallMana = 0;
	double rand; 
	
		
	public Mana() {
		rand = Math.random();
		currentMana = overallMana;
	}
	
	public void gainMana() {
		if (overallMana < 10) {
			overallMana++;
			currentMana = overallMana;
		}
		else {
			overallMana = 10;
			currentMana = overallMana;
		}
	}
	
	public void lossMana() {
		int max = 10; 
        int min = 1; 
        int range = max - min + 1; 
        
        //Genere un nombre random entre 1 et 10
        int rand = (int)(Math.random() * range) + min; 
        System.out.println("Co�t de la carte : " + rand);
        
        if(rand <= currentMana) {
        	currentMana = currentMana - rand;
        	System.out.println("Mana d�pens� : " + rand);
        }
        else {
        	System.out.println("Mana inf�rieur au Co�t de la carte -> Aucun mana d�pens� !");
        }   
	}
}