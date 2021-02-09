package Controller;

import View.DrawingDemoPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Model.shapes.Shape;

import java.awt.Color;

public class ShapeDemoListener implements MouseListener {
	private DrawingDemoPanel panel;

	public ShapeDemoListener(DrawingDemoPanel panel) {
		this.panel = panel;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Color color = getColor();
		int size = getSize();
		Shape shape = getSize(color, size);
	}

	private Color getColor(){
		if (panel.getWhiteColor().isSelected()){
			return Color.white;
		} else if (panel.getRedColor().isSelected()){
			return Color.red;
		} else if (panel.getYellowColor().isSelected()){
			return Color.yellow;
		}
		return Color.white; //default color
		
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
