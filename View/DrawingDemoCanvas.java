package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import Model.shapes.Circle;
import Model.shapes.IShapeDraw;
import Model.shapes.Rectangle;
import Model.shapes.Triangle;

public class DrawingDemoCanvas extends JPanel {
	private DrawingDemoPanel panel;
	ArrayList <IShapeDraw> shapes = new ArrayList<>();

	public DrawingDemoCanvas(DrawingDemoPanel panel) {
		this.panel = panel;
		setBackground(Color.black);
		setPreferredSize(new Dimension(500, 400));

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		for (var s: shapes){
			s.render(g2);
		}
	}

	public ArrayList<IShapeDraw> getShapes() {
		return shapes;
	}


}
