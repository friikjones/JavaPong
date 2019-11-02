package Engine;

import java.awt.geom.Ellipse2D;

public class Ball {
	public Vector2 position;
	public Vector2 speed;
	private int[] size = {20,20};
	private Ellipse2D shape;
	
	public Ball() {
		position = new Vector2(0,0);
		speed = new Vector2();
		setSize(size);
		shape = new Ellipse2D.Double(position.x, position.y, size[0], size[1]);
	}

	public int[] getSize() {
		return size;
	}

	public void setSize(int[] size) {
		this.size = size;
	}

	public Ellipse2D getShape() {
		return shape;
	}

	public void setShape(Ellipse2D shape) {
		this.shape = shape;
	}
	
	public void updateShape() {
		shape = new Ellipse2D.Double(position.x, position.y, size[0], size[1]);
	}
	
	
	
}
