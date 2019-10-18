package sim.chem.display;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel implements UserInterface {

	private static final long serialVersionUID = 1L;
	
	private int width;
	
	private int height;
	
	private PeriodicTablePanel periodicTablePanel;
	
	public MainPanel(Display display, int width, int height) {
				
		this.width = width;
		
		this.height = height;
		
		periodicTablePanel = new PeriodicTablePanel(display, width, height);
		
	}
	
	@Override
	public void createAndShowGUI() {
		
		GridBagConstraints c = new GridBagConstraints();
		
		this.setLayout(new GridBagLayout());
		
		this.setPreferredSize(new Dimension(width, height));
		
		periodicTablePanel.createAndShowGUI();
		
		c.fill = GridBagConstraints.BOTH;
				
		this.add(periodicTablePanel, c);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.LIGHT_GRAY);
		
		g.fillRect(0, 0, width, height);
		
	}
	
}
