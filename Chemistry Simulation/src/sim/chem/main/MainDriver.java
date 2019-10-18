package sim.chem.main;

import javax.swing.SwingUtilities;

import sim.chem.display.Display;

public class MainDriver {
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			
			Display display = new Display(950, 700);
			
			display.createAndShowGUI();
			
		}); 
		
	}
		
}
