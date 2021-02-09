package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import Model.idemo.IRender;

public class IDemoCanvas extends JPanel {

	private static final long serialVersionUID = 1L;
	private IDemoPanel panel;
	private ArrayList<IRender> pictures = new ArrayList<>();

	public IDemoCanvas(IDemoPanel panel) {
		this.setPanel(panel);
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.black);
	}

	public IDemoPanel getPanel() {
		return panel;
	}

	public void setPanel(IDemoPanel panel) {
		this.panel = panel;
	}

	public ArrayList<IRender> getPictures() {
		return pictures;
	}

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);

		Graphics2D g2 = (Graphics2D) g;
		for (var p : pictures) {
			p.render(g2);
		}

	}

}
