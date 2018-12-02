package Jeu;

public class Hero {
	String heroName;
	public int lifePoint = 30;
	int exhaust = 1;
	// int armure;
	
	public int takeDamage (int attaque) {
		int life = lifePoint;
		lifePoint = life - attaque;
		if (lifePoint <= 0) {
			lose();
			Main.endGame = true;
		}
		return life;
	}
	
	public void lose () {
		System.out.println("Sorry you lose this game.");
	}
}
