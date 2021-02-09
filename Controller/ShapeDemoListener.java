package Controller;

import View.DrawingDemoPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import Model.shapes.Circle;
import Model.shapes.IShapeDraw;
import Model.shapes.Rectangle;
import Model.shapes.Triangle;

import java.awt.Color;

public class ShapeDemoListener implements MouseListener {
	public static final int SIZE_SMALL = 40;
	public static final int SIZE_MID = 40;
	public static final int SIZE_LARGE = 80;
	private DrawingDemoPanel panel;

	public ShapeDemoListener(DrawingDemoPanel panel) {
		this.panel = panel;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Color color = getColor();
		int size = getSize();
		boolean filled = getFilled();
		IShapeDraw shape = getShape(e.getX(), e.getY(), color, size, filled);
		panel.getCanvas().getShapes().add(shape);
		panel.getCanvas().repaint();
	}

	private boolean getFilled() {
		return panel.getFilledBox().isSelected();
	}

	private Color getColor() {
		if (panel.getWhiteColor().isSelected()) {
			return Color.white;
		} else if (panel.getRedColor().isSelected()) {
			return Color.red;
		} else if (panel.getYellowColor().isSelected()) {
			return Color.yellow;
		}
		return Color.white; // default color
	}

	private IShapeDraw getShape(int x, int y, Color color, int size, boolean filled) {
		if (panel.getCirButton().isSelected()) {
			return new Circle(x, y, size, color, filled);
		} else if (panel.getRecButton().isSelected()) {
			return new Rectangle(x, y, size, size, color, filled);
		} else if (panel.getTriButton().isSelected()) {
			return new Triangle(x, y, size, color, filled);
		}
		return new Circle(x, y, size, color, filled);
	}

	private int getSize() {
		if (panel.getSmallSize().isSelected()) {
			return SIZE_SMALL;
		} else if (panel.getMidSize().isSelected()) {
			return SIZE_MID;
		} else if (panel.getLargeSize().isSelected()) {
			return SIZE_LARGE;
		}
		return SIZE_SMALL;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
