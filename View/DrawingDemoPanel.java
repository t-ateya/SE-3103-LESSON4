package View;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.BorderLayout;
import java.awt.Container;

public class DrawingDemoPanel {
	private JFrame window;
	private DrawingDemoCanvas canvas;
	private JRadioButton cirButton = new JRadioButton("Circle");
	private JRadioButton recButton = new JRadioButton("Rectangle");
	private JRadioButton triButton = new JRadioButton("Triangle");

	private JRadioButton whiteColor = new JRadioButton("white");
	private JRadioButton yellowColor = new JRadioButton("yellow");
	private JRadioButton redColor = new JRadioButton("red");

	private JCheckBox filledBox = new JCheckBox("filled");
	private JRadioButton smallSize = new JRadioButton("small");
	private JRadioButton midSize = new JRadioButton("medium");
	private JRadioButton largeSize = new JRadioButton("large");

	private JButton sortXButton = new JButton("Sort by X");
	private JButton sortYButton = new JButton("Sort by Y");
	private JButton sortAllButton = new JButton("Sort All");
	private JButton showOrderButton = new JButton("Show order"); 
	private JButton clearButton = new JButton("Clear");
	private JButton exitButton = new JButton("Exit");

	DrawingDemoPanel(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();

		canvas = new DrawingDemoCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);

	}
	public JRadioButton getCirButton() {
		return cirButton;
	}
	public JRadioButton getRecButton() {
		return recButton;
	}
	public JButton getClearButton() {
		return clearButton;
	}
	public JButton getExitButton() {
		return exitButton;
	}
	public JCheckBox getFilledBox() {
		return filledBox;
	}
	public JRadioButton getLargeSize() {
		return largeSize;
	}
	public JRadioButton getMidSize() {
		return midSize;
	}
	public JRadioButton getRedColor() {
		return redColor;
	}
	public JButton getShowOrderButton() {
		return showOrderButton;
	}
	public JRadioButton getSmallSize() {
		return smallSize;
	}
	public JButton getSortAllButton() {
		return sortAllButton;
	}
	public JButton getSortXButton() {
		return sortXButton;
	}
	public JButton getSortYButton() {
		return sortYButton;
	}
	public JRadioButton getTriButton() {
		return triButton;
	}
	public JRadioButton getWhiteColor() {
		return whiteColor;
	}
	public JRadioButton getYellowColor() {
		return yellowColor;
	}
	
}
