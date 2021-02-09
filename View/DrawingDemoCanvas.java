package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import Model.shapes.IShapeDraw;

public class DrawingDemoCanvas extends JPanel {
	private DrawingDemoPanel panel;
	private ArrayList<IShapeDraw> shapes = new ArrayList<>();
	private int singleStepIndex = -1;

	public DrawingDemoCanvas(DrawingDemoPanel panel) {
		this.panel = panel;
		setBackground(Color.black);
		setPreferredSize(new Dimension(500, 400));

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		if (singleStepIndex >= 0) {
			for (int i = 0; i <= singleStepIndex; i++) {
				if (singleStepIndex < shapes.size()) {
					shapes.get(i).render(g2);
				}

			}
		} else {
			for (var s : shapes) {
				s.render(g2);
			}
		}

	}

	public ArrayList<IShapeDraw> getShapes() {
		return shapes;
	}

}
