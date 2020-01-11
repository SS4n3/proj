
public class Bullet {
	int x,y,speedx;
	boolean visible;

	public Bullet(int startx,int starty) {
		x=startx;
		y=starty;
		speedx=7;
		visible=true;
		
	}
	public void update() {
		y-=speedx/2;
		if(x>800) {
			visible=false;
		}
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSpeedx() {
		return speedx;
	}
	public void setSpeedx(int speedx) {
		this.speedx = speedx;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
