/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
	private int speed;
	
	public int getSpeed(){
	    return speed;
	}
	
	public void setSpeed(int s){
	    this.speed = s;
	}
	public static void main(String[] args) {
        Main c = new Main();
        c.setSpeed(140);
        System.out.println("The speed of the car is " + c.getSpeed());
    }
}