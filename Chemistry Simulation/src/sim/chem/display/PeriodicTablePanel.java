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

public class PeriodicTablePanel extends JPanel implements UserInterface {

	private static final long serialVersionUID = 1L;

	private int width;
	
	private int height;
	
	private JLabel periodicLabel;
	
	private Element[] element;
	
	private ElementButton[] elementButton;
	
	public PeriodicTablePanel(Display display, int width, int height) {
		
		this.width = width;
		
		this.height = height;
		
		periodicLabel = new JLabel("Periodic Table");
		
		element = new Element[120];
		
		element[0] = new Nonmetal("Hydrogen", "H", 1, 1.008, 1, 1, "Nonmetal", -434.5, -423.2, 120, 120, 1, "1766");
		
		element[1] = new NobleGas("Helium", "He", 2, 4.003);

		element[2] = new AlkaliMetal("Lithium", "Li", 3, 6.941);
		
		element[3] = new AlkalineEarthMetal("Beryllium", "Be", 4, 9.012);
		
		element[4] = new SemiMetal("Boron", "B", 5, 10.811);

		element[5] = new Nonmetal("Carbon", "C", 6, 12.011);

		element[6] = new Nonmetal("Nitrogen", "N", 7, 14.007);
		
		element[7] = new Nonmetal("Oxygen", "O", 8, 15.999);
		
		element[8] = new Halogen("Fluorine", "F", 9, 18.998);
		
		element[9] = new NobleGas("Neon", "Ne", 10, 20.180);
		
		element[10] = new AlkaliMetal("Sodium", "Na", 11, 22.990);

		element[11] = new AlkalineEarthMetal("Magnesium", "Mg", 12, 24.305);
		
		element[12] = new BasicMetal("Aluminum", "Al", 13, 26.982);

		element[13] = new SemiMetal("Silicon", "Si", 14, 28.086);
		
		element[14] = new Nonmetal("Phosphorus", "P", 15, 30.990);

		element[15] = new Nonmetal("Sulfur", "S", 16, 32.065);

		element[16] = new Halogen("Chlorine", "Cl", 17, 35.453);
		
		element[17] = new NobleGas("Argon", "Ar", 18, 39.948);

		element[18] = new AlkaliMetal("Potassium", "K", 19, 39.098);
		
		element[19] = new AlkalineEarthMetal("Calcium", "Ca", 20, 40.078);

		element[20] = new TransitionMetal("Scandium", "Sc", 21, 44.856);
		
		element[21] = new TransitionMetal("Titanium", "Ti", 22, 47.867);

		element[22] = new TransitionMetal("Vanadium", "V", 23, 50.942);

		element[23] = new TransitionMetal("Chromium", "Cr", 24, 51.996);
		
		element[24] = new TransitionMetal("Manganese", "Mn", 25, 54.938);
		
		element[25] = new TransitionMetal("Iron", "Fe", 26, 55.845);
		
		element[26] = new TransitionMetal("Cob5alt", "Co", 27, 58.933);

		element[27] = new TransitionMetal("Nickel", "Ni", 28, 58.693);
		
		element[28] = new TransitionMetal("Copper", "Cu", 29, 63.546);

		element[29] = new TransitionMetal("Zinc", "Zn", 30, 65.390);
		
		element[30] = new BasicMetal("Gallium", "Ga", 31, 69.723);

		element[31] = new SemiMetal("Germanium", "Ge", 32, 72.650);
		
		element[32] = new SemiMetal("Arsenic", "As", 33, 74.922);
		
		element[33] = new Nonmetal("Selenium", "Se", 34, 78.960);
		
		element[34] = new Halogen("Bromine", "Br", 35, 79.904);

		element[35] = new NobleGas("Krypton", "Kr", 36, 83.800);

		element[36] = new AlkaliMetal("Rubidium", "Rb", 37, 85.468);

		element[37] = new AlkalineEarthMetal("Strontium", "Sr", 38, 87.620);
		
		element[38] = new TransitionMetal("Yttrium", "Y", 39, 88.906);

		element[39] = new TransitionMetal("Zirconium", "Zr", 40, 91.224);

		element[40] = new TransitionMetal("Niobium", "Nb", 41, 92.906);

		element[41] = new TransitionMetal("Molybdenum", "Mo", 42, 95.940);

		element[42] = new TransitionMetal("Technetium", "Tc", 43, 98.000);

		element[43] = new TransitionMetal("Ruthenium", "Ru", 44, 101.070);

		element[44] = new TransitionMetal("Rhodium", "Rh", 45, 102.906);

		element[45] = new TransitionMetal("Palladium", "Pd", 46, 106.420);

		element[46] = new TransitionMetal("Silver", "Ag", 47, 107.868);

		element[47] = new TransitionMetal("Cadmium", "Cd", 48, 112.411);

		element[48] = new BasicMetal("Indium", "In", 49, 114.818);

		element[49] = new BasicMetal("Tin", "Sn", 50, 118.710);

		element[50] = new SemiMetal("Antimony", "Sb", 51, 121.760);

		element[51] = new SemiMetal("Tellurium", "Te", 52, 127.600);

		element[52] = new Halogen("Iodine", "I", 53, 44.856);

		element[53] = new NobleGas("Xenon", "Xe", 54, 131.293);

		element[54] = new AlkaliMetal("Cesium", "Cs", 55, 132.906);

		element[55] = new AlkalineEarthMetal("Barium", "Ba", 56, 137.327);

		element[56] = new Lanthanide("Lanthanum", "La", 57, 138.906);

		element[57] = new Lanthanide("Cerium", "Ce", 58, 140.116);

		element[58] = new Lanthanide("Praseodymium", "Pr", 59, 140.908);

		element[59] = new Lanthanide("Neodymium", "Nd", 60, 144.240);

		element[60] = new Lanthanide("Promethium", "Pm", 61, 145.000);

		element[61] = new Lanthanide("Samarium", "Sm", 62, 150.360);

		element[62] = new Lanthanide("Europium", "Eu", 63, 151.964);

		element[63] = new Lanthanide("Gadolinium", "Gd", 64, 157.250);

		element[64] = new Lanthanide("Terbium", "Tb", 65, 158.925);

		element[65] = new Lanthanide("Dysprosium", "Dy", 66, 162.500);

		element[66] = new Lanthanide("Holmium", "Ho", 67, 164.930);

		element[67] = new Lanthanide("Erbium", "Er", 68, 167.259);
		
		element[68] = new Lanthanide("Thulium", "Tm", 69, 168.934);
		
		element[69] = new Lanthanide("Ytterbium", "Yb", 70, 173.040);

		element[70] = new Lanthanide("Lutetium", "Lu", 71, 174.967);

		element[71] = new TransitionMetal("Hafnium", "Hf", 72, 178.490);

		element[72] = new TransitionMetal("Tantalum", "Ta", 73, 180.840);

		element[73] = new TransitionMetal("Tungsten", "W", 74, 183.840);

		element[74] = new TransitionMetal("Rhenium", "Re", 75, 186.207);

		element[75] = new TransitionMetal("Osmium", "Os", 76, 190.230);

		element[76] = new TransitionMetal("Iridium", "Ir", 77, 192.217);

		element[77] = new TransitionMetal("Platinum", "Pt", 78, 195.078);

		element[78] = new TransitionMetal("Gold", "Au", 79, 196.967);

		element[79] = new TransitionMetal("Mercury", "Hg", 80, 200.590);

		element[80] = new BasicMetal("Thallium", "Tl", 81, 204.383);

		element[81] = new BasicMetal("Lead", "Pb", 82, 207.200);

		element[82] = new BasicMetal("Bismuth", "Bi", 83, 208.980);

		element[83] = new SemiMetal("Polonium", "Po", 84, 209.000);

		element[84] = new Halogen("Astatine", "At", 85, 210.000);

		element[85] = new NobleGas("Radon", "Rn", 86, 222.000);

		element[86] = new AlkaliMetal("Francium", "Fr", 87, 223.000);

		element[87] = new AlkalineEarthMetal("Radium", "Ra", 88, 226.000);

		element[88] = new Actinide("Actinium", "Ac", 89, 227.000);

		element[89] = new Actinide("Thorium", "Th", 90, 232.038);

		element[90] = new Actinide("Protactinium", "Pa", 91, 231.036);

		element[91] = new Actinide("Uranium", "U", 92, 238.029);

		element[92] = new Actinide("Neptunium", "Np", 93, 237.000);

		element[93] = new Actinide("Plutonium", "Pu", 94, 244.000);

		element[94] = new Actinide("Americium", "Am", 95, 243.000);

		element[95] = new Actinide("Curium", "Cm", 96, 247.000);

		element[96] = new Actinide("Berkelium", "Bk", 97, 247.000);

		element[97] = new Actinide("Californium", "Cf", 98, 251.000);

		element[98] = new Actinide("Einsteinium", "Es", 99, 252.000);

		element[99] = new Actinide("Fermium", "Fm", 100, 257.000);

		element[100] = new Actinide("Mendelevium", "Md", 101, 258.000);

		element[101] = new Actinide("Nobelium", "No", 102, 259.000);

		element[102] = new Actinide("Lawrencium", "Lr", 103, 262.000);

		element[103] = new TransitionMetal("Rutherfordium", "Rf", 104, 261.000);

		element[104] = new TransitionMetal("Dubnium", "Db", 105, 2623.000);

		element[105] = new TransitionMetal("Seaborgium", "Sg", 106, 266.000);

		element[106] = new TransitionMetal("Bohrium", "Bh", 107, 264.000);

		element[107] = new TransitionMetal("Hassium", "Hs", 108, 277.000);
		
		element[108] = new TransitionMetal("Meitnerium", "Mt", 109, 268.000);

		element[109] = new TransitionMetal("Darmstadtium", "Ds", 110, 281.000);

		element[110] = new TransitionMetal("Roentgenium", "Rg", 111, 280.000);

		element[111] = new TransitionMetal("Copernicium", "Cn", 112, 285.000);

		element[112] = new BasicMetal("Nihonium", "Nh", 113, 284.000);

		element[113] = new BasicMetal("Flerovium", "Fl", 114, 289.000);

		element[114] = new BasicMetal("Moscovium", "Mc", 115, 288.000);

		element[115] = new BasicMetal("Livermorium", "Lv", 116, 293.000);

		element[116] = new Halogen("Tennessine", "Ts", 117, 282.000);

		element[117] = new NobleGas("Oganesson", "Og", 118, 294.000);
		
		elementButton = new ElementButton[120];
		
		for(int i = 0; i < elementButton.length; i++) {
			
			elementButton[i] = new ElementButton(display, 45, 45, element[i]);
			
		}
		
	}
	
	@Override
	public void createAndShowGUI() {
		
		GridBagConstraints c = new GridBagConstraints();
		
		this.setLayout(new GridBagLayout());
		
		this.setPreferredSize(new Dimension(width - 100, height - 100));
		
		for(int i = 0; i < elementButton.length; i++) {
			
			elementButton[i].createAndShowGUI();
						
		}
		
		periodicLabel.setFont(new Font("Arial", Font.PLAIN, 64));

		c.gridy = 0;
		
		c.gridx = 2;
		
		c.gridheight = 2;
		
		c.gridwidth = 10;
		
		this.add(periodicLabel, c);
		
		c.gridy = 2;
		
		c.gridx = 0;
		
		c.gridheight = 1;
		
		c.gridwidth = 1;
		
		this.add(elementButton[0], c);
		
		c.gridx = 17;
		
		this.add(elementButton[1], c);
		
		c.gridy = 3;
		
		for(int i = 0; i <= 1; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i + 2], c);
			
		}
		
		for(int i = 12; i <= 17; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i - 8], c);
			
		}
		
		c.gridy = 4;
		
		for(int i = 0; i <= 1; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i + 10], c);
			
		}
		
		for(int i = 12; i <= 17; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i], c);
			
		}
		
		c.gridy = 5;
		
		for(int i = 0; i <= 17; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i + 18], c);
			
		}
		
		c.gridy = 6;
		
		for(int i = 0; i <= 17; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i + 36], c);
			
		}
		
		c.gridy = 7;
		
		for(int i = 0; i <= 1; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i + 54], c);
			
		}
		
		for(int i = 3; i <= 17; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i + 68], c);
			
		}
		
		c.gridy = 8;
		
		for(int i = 0; i <= 1; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i + 86], c);
			
		}
		
		for(int i = 3; i <= 17; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i + 100], c);
			
		}
		
		c.gridy = 9;
		
		c.insets = new Insets(20, 0, 0, 0);
		
		for(int i = 2; i <= 16; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i + 54], c);
			
		}
		
		c.gridy = 10;
		
		c.insets = new Insets(0, 0, 0, 0);
		
		for(int i = 2; i <= 16; i++) {
			
			c.gridx = i;
			
			this.add(elementButton[i + 86], c);
			
		}
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.GRAY);
		
		g.fillRect(0, 0, width, height);
		
	}
	
}
