package Controller;

import View.IDemoPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class IDemoEventListener implements MouseListener {
	private IDemoPanel panel;
	public IDemoEventListener(IDemoPanel panel){
		this.panel = panel;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
