package sim.chem.display;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

import sim.chem.element.Element;

public class ElementPanel extends JPanel implements UserInterface {
	
	private static final long serialVersionUID = 1L;
	
	private int width;
	
	private int height;
	
	private ImagePanel image;
	
	private Element element;
	
	private JLabel[] infoLabel;
	
	public ElementPanel(int width, int height, ImagePanel image, Element element) {
		
		this.width = width;
		
		this.height = height;
		
		this.image = image;
		
		this.element = element;
		
		infoLabel = new JLabel[24];
		
	}
	
	@Override
	public void createAndShowGUI() {
		
		GridBagConstraints c = new GridBagConstraints();
		
		this.setLayout(new GridBagLayout());
		
		this.setPreferredSize(new Dimension(width, height));
				
		image.createAndShowGUI();
		
		c.fill = GridBagConstraints.BOTH;
		
		c.insets = new Insets(5, 5, 5, 5);
		
		c.gridy = 0;
		
		c.gridx = 0;
		
		c.gridheight = 4;
		
		this.add(image, c);
		
		infoLabel[0] = new JLabel();
		
		infoLabel[0].setFont(new Font("Arial", Font.PLAIN, 20));
		
		infoLabel[0].setText(element.getName());
		
		c.gridx = 1;
		
		c.gridwidth = 1;
		
		c.gridheight = 1;
		
		this.add(infoLabel[0], c);
		
		infoLabel[1] = new JLabel();
		
		infoLabel[1].setFont(new Font("Arial", Font.PLAIN, 48));
		
		infoLabel[1].setText(element.getLetter());
		
		c.gridy = 1;
								
		this.add(infoLabel[1], c);
		
		infoLabel[2] = new JLabel();
		
		infoLabel[2].setFont(new Font("Arial", Font.PLAIN, 12));
		
		infoLabel[2].setText("Atomic Number:");
		
		c.gridy = 2;
		
		c.gridx = 1;
		
		this.add(infoLabel[2], c);
		
		infoLabel[3] = new JLabel();
		
		infoLabel[3].setFont(new Font("Arial", Font.PLAIN, 16));
		
		infoLabel[3].setText(String.valueOf(element.getNumber()));
		
		c.gridx = 2;
		
		this.add(infoLabel[3], c);
		
		infoLabel[4] = new JLabel();
		
		infoLabel[4].setFont(new Font("Arial", Font.PLAIN, 12));
		
		infoLabel[4].setText("Atomic Weight:");
		
		c.gridy = 3;
		
		c.gridx = 1;
		
		this.add(infoLabel[4], c);
		
		infoLabel[5] = new JLabel();
		
		infoLabel[5].setFont(new Font("Arial", Font.PLAIN, 16));
		
		infoLabel[5].setText(String.valueOf(element.getWeight()));
		
		c.gridx = 2;
		
		this.add(infoLabel[5], c);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.LIGHT_GRAY);
		
		g.fillRect(0, 0, width, height);
		
	}

}
