package sim.chem.display;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;

import sim.chem.element.Element;

public class ElementFrame extends JDialog implements UserInterface {
	
	private static final long serialVersionUID = 1L;

	private Display display;
	
	private int width;
	
	private int height;
	
	private String title;
	
	private ElementPanel elementPanel;
		
	public ElementFrame(Display display, int width, int height, String title, ImagePanel imagePanel, Element element) {
		
		this.display = display;
		
		this.width = width;
		
		this.height = height;
		
		this.title = title;
				
		elementPanel = new ElementPanel(width, height, imagePanel, element);
		
	}

	@Override
	public void createAndShowGUI() {
		
		this.setTitle(title);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.setMinimumSize(new Dimension(width, height));
		
		this.setResizable(false);
		
		elementPanel.createAndShowGUI();
		
		this.add(elementPanel);
		
		this.setAlwaysOnTop(true);
		
		this.setLocationRelativeTo(display);
		
		this.setVisible(true);
		
	}
	
}
