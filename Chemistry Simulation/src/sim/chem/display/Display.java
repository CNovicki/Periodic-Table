package sim.chem.display;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Display extends JFrame implements UserInterface {

	private static final long serialVersionUID = 1L;

	private int width;
	
	private int height;
	
	private MainPanel mainPanel;
	
	public Display(int width, int height) {
		
		this.width = width;
		
		this.height = height;
		
		mainPanel = new MainPanel(this, width, height);
		
	}
	
	@Override
	public void createAndShowGUI() {
		
		this.setTitle("Chemistry Simulator");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMinimumSize(new Dimension(width, height));
		
		this.setResizable(false);
		
		mainPanel.createAndShowGUI();
		
		this.add(mainPanel);
		
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
		
	}
	
}
