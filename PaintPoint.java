package project4;

import java.awt.Color;
import java.awt.Graphics;

public class PaintPoint {
	public static final int CIRCLE_SHAPE = 0;
 	public static final int SQUARE_SHAPE = 1;
	private final int _size;
	private final int _shape;
	private final int _x;
	private final int _y;
	private final Color _color;

	
	public PaintPoint(int x, int y, int shape, Color color, int size) {
		_x = x;
		_y = y;
		_shape = shape;
		_size = size;
		_color = color;
	}
	
	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}

	public int getShape() {
		return _shape;
	}
	
	public Color getColor(){
		return _color;
	}
	
	public int getSize(){
		return _size; 
	}
	
	public void draw(Graphics g) {
		switch (_shape) {
		case CIRCLE_SHAPE:
			g.fillOval(_x, _y, _size, _size);
			break;
		}
	}
}