package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.awt.BasicStroke;

import javax.swing.JPanel;

import Model.idemo.IRender;

public class IDemoCanvas extends JPanel {

	private static final long serialVersionUID = 1L;
	private IDemoPanel panel;
	private ArrayList<IRender> pictures = new ArrayList<>();
	private int selectIndex = -1;

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
		for (int i = 0; i < pictures.size(); i++) {
			IRender pic = pictures.get(i);
			pic.render(g2);
			if (i == selectIndex) {
				g2.setStroke(new BasicStroke(5));
				g2.setColor(Color.red);
				g2.draw(pic.getBoundingBox());
			}
		}

	}

	public int getSelectIndex() {
		return selectIndex;
	}

	public void setSelectIndex(int selectIndex) {
		this.selectIndex = selectIndex;
	}

}
