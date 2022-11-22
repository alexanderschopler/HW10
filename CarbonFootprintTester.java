//Alex Schopler
//Write an application that creates objects of each of the three classes,
//places references to those objects in ArrayList<CarbonFootprint>, then iterates through the
//ArrayList, polymorphically invoking each object’s getCarbonFootprint method. For each object,
//print some identifying information and the object’s carbon footprint.
import java.util.ArrayList;
import java.awt.Scrollbar;
import java.util.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CarbonFootprintTester {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Carbon Footprint");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300, 300);
	    JPanel panel = new JPanel();
	    JButton b = new JButton("Done");  
	    b.setBounds(50,200,100,20); 
	    frame.add(b);
	    Scrollbar s = new Scrollbar();
	    s.setBounds(700, 30, 20, 100);
	    frame.add(s);
	      
	    BoxLayout boxl = new BoxLayout(panel, BoxLayout.Y_AXIS);
	    panel.setLayout(boxl);
	       
	    
	    Building BU = new Building(7000);
		Car CA = new Car(1500, 30);
		Bicycle BI = new Bicycle(8000.00);
	    
	    ArrayList<CarbonFootprint> CFP = new ArrayList<CarbonFootprint>();
	    
	    CFP.add(BU);
		CFP.add(CA);
		CFP.add(BI);
	    
	    for(CarbonFootprint displayObj : CFP){
	    	String str = String.valueOf(displayObj.getCarbonFootprint());
	    	String str1 = String.valueOf(displayObj.toString());
	    	panel.add(new JLabel(str1));
	    	panel.add(new JLabel("The total carbon foot print emmision is: " + str + " pounds per year"));
	    	panel.add(new JLabel(" "));
		}

	    
	    
	    frame.add(panel);
	    frame.pack();
	    frame.setVisible(true);
	}
}