
public class FlameSpirit {
	//The flame spirit is going to the flame the person lights up.
	//Each color will be a different personality.

	private FlameColor fColor;
	
	public FlameSpirit(){
		this.fColor=fColor.NONE;
	}
	
	//setter getter for FlameColor
	public void setFlameColor(){
		switch(this.fColor){
		case NONE:
			System.out.println("The Flame is out!");
			break;
		default:
			System.out.println("The Flame is glowing "+ this.fColor );
		}
	}
}
