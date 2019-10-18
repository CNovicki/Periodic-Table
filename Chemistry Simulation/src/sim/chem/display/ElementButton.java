package sim.chem.display;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;

import sim.chem.element.Actinide;
import sim.chem.element.AlkaliMetal;
import sim.chem.element.AlkalineEarthMetal;
import sim.chem.element.BasicMetal;
import sim.chem.element.Element;
import sim.chem.element.Halogen;
import sim.chem.element.Lanthanide;
import sim.chem.element.NobleGas;
import sim.chem.element.Nonmetal;
import sim.chem.element.SemiMetal;
import sim.chem.element.TransitionMetal;

public class ElementButton extends JButton implements UserInterface {

	private static final long serialVersionUID = 1L;

	private Display display;
	
	private int width;
	
	private int height;
	
	private Element element;
	
	public ElementButton(Display display, int width, int height, Element element) {
		
		this.display = display;
		
		this.width = width;
		
		this.height = height;
		
		this.element = element;
		
	}
	
	@Override
	public void createAndShowGUI() {
				
		this.setPreferredSize(new Dimension(width, height));
										
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ImagePanel imagePanel;
				
				try {
					
					imagePanel = new ImagePanel(150, 150, "res/img/element/" + element.getName() + ".jpg");
					
					ElementFrame frame = new ElementFrame(display, 400, 400, element.getNumber() + " " + element.getName(), imagePanel, element);

					frame.createAndShowGUI();
										
				}
				
				catch (IOException e) {
					
					e.printStackTrace();
				
				}
												
			}
			
		});
				
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		if(element instanceof Nonmetal) {
			
			g.setColor(new Color(128, 128, 0));
						
		}
		
		else if(element instanceof NobleGas) {
			
			g.setColor(Color.GREEN);
						
		}
		
		else if(element instanceof AlkaliMetal) {
			
			g.setColor(new Color(200, 0, 128));
						
		}
		
		else if(element instanceof AlkalineEarthMetal) {
			
			g.setColor(new Color(50, 0, 255));
			
		}
		
		else if(element instanceof SemiMetal) {
			
			g.setColor(Color.RED);
			
		}
		
		else if(element instanceof Halogen) {
			
			g.setColor(Color.DARK_GRAY);
			
		}
		
		else if(element instanceof BasicMetal) {
			
			g.setColor(Color.YELLOW);
			
		}
		
		else if(element instanceof TransitionMetal) {
			
			g.setColor(new Color(0, 128, 0));
			
		}
		
		else if(element instanceof Lanthanide) {
			
			g.setColor(new Color(1, 204, 163));
			
		}
		
		else if(element instanceof Actinide) {
			
			g.setColor(new Color(128, 0, 100));
			
		}
		
		else {
			
			g.setColor(Color.WHITE);
					
		}
		
		g.fillRect(0, 0, width, height);
						
	}
	
}
