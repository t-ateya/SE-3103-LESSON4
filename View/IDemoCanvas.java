package View;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

;

public class IDemoCanvas extends JPanel {
	private IDemoPanel panel;

	public IDemoCanvas (IDemoPanel panel){
		this.panel = panel;
		setPreferredSize(new Dimension (500, 500));
	}

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
	}

}