package Controller;

import View.IDemoPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.Rectangle;

import Model.idemo.IRender;

public class IDemoEventListener implements MouseListener {
	private IDemoPanel panel;
	public IDemoEventListener(IDemoPanel panel){
		this.panel = panel;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//System.out.println("Mouse Pressed");
		ArrayList<IRender>pictures = panel.getCanvas().getPictures();
		for (int i =0; i<pictures.size(); i++){
			Rectangle r = pictures.get(i).getBoundingBox();
			if (r.contains(e.getX(), e.getY())){
				//System.out.println("selected index = " + i);
				panel.getCanvas().setSelectIndex(i);
				return;
			}
		}
		System.out.println("Not Selected");
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
