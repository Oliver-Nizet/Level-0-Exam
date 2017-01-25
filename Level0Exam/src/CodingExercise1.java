import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot r = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
    	String color = JOptionPane.showInputDialog("Would you like the square to be red, green, or blue?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if (color.equals("red")) {
			r.setPenColor(255,0,0);
		}
    	if (color.equals("green")) {
			r.setPenColor(0,255,0);
		}
    	if (color.equals("blue")) {
			r.setPenColor(0,0,255);
		}
   	 // 2. set the pen width to 10
    	r.setPenWidth(10);
    	r.setSpeed(10);
    	r.hide();
    	r.sparkle();
   	 // 1. make the Robot draw a shape
   		for (int i = 0; i < 4; i++) {
   			r.penDown();
   			r.move(100);
   			r.turn(90);
   		}
	}
}

