package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import Model.Images.ImageStore;

;

public class IDemoCanvas extends JPanel {
	private IDemoPanel panel;

	public IDemoCanvas (IDemoPanel panel){
		this.panel = panel;
		setPreferredSize(new Dimension (500, 500));
		setBackground(Color.black);
	}

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);

		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(ImageStore.airplane, null, 50, 50);




	}

}
