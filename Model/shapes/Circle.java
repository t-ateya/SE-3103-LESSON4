package Model.shapes;

import java.awt.Graphics2D;
import java.awt.Color;

public class Circle extends Shape implements IShapeDraw {
	private int radius;
	private Color color;
	private boolean filled;

	public Circle(int x, int y, int radius, Color color, boolean filled) {
		super(x, y);
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	public int getRadius() {
		return radius;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(color);
		if (filled) {
			g2.fillOval(getX() - radius, getY() - radius, radius * 2, radius * 2);
		} else {
			g2.drawOval(getX() - radius, getY() - radius, radius * 2, radius * 2);
		}

	}

}
