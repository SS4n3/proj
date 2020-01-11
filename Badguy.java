
public class Badguy extends Character {

	boolean moveRight;
	boolean moveLeft;
	boolean isVisible;
	
	public Badguy(int x,int y,int s) {
		super(x,y,s);
	
		moveLeft=false;
		moveRight=true;
		isVisible=true;
	
	}
}

