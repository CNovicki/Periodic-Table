package sim.chem.display;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel implements UserInterface {
	
	private static final long serialVersionUID = 1L;
	
	private int width;
	
	private int height;
	
	private BufferedImage image;
	
	public ImagePanel(int width, int height, String path) throws IOException {
		
		this.width = width;
		
		this.height = height;
		
		image = ImageIO.read(new File(path));
		
	}
	
	@Override
	public void createAndShowGUI() {
		
		this.setPreferredSize(new Dimension(width, height));
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawImage(image, 0, 0, width, height, this);
		
	}

	public BufferedImage getImage() {
		
		return image;
		
	}

	public void setImage(BufferedImage image) {
		
		this.image = image;
		
	}

}
