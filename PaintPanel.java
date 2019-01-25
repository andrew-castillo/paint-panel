package project4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	private final ArrayList<PaintPoint> _points;
	
	private Color _globalColor;
	private int _currentShape;
	private int _globalSize;
	
	public PaintPanel() {
		_points = new ArrayList<>();
		_globalColor = Color.BLACK;
		_globalSize = 10;
		_currentShape = PaintPoint.CIRCLE_SHAPE;
		
		MouseAdapter adapter = new MouseAdapter() {
			@Override
		    public void mouseDragged(MouseEvent e) {
				PaintPoint point = new PaintPoint(e.getX(), e.getY(),
						_currentShape, _globalColor, _globalSize);
				_points.add(point);
				repaint();
			}
		};
		
		addMouseListener(adapter);
		addMouseMotionListener(adapter);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(_globalColor);
		for (PaintPoint point : _points) {
			g.setColor(point.getColor());
			point.draw(g);
		}
	} 
	
	public void setGlobalColor(Color color) {
		_globalColor = color;
		repaint();
	}
	
	public void setShape(int shape) {
		_currentShape = shape;
	}
	
	public void setSize(int size){
		_globalSize = size;
	}
	
	public void Clear(){
		_points.clear();
		repaint();
	}
}