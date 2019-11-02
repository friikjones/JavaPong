package Engine;

public class Vector2 {
	public float x, y;

	public Vector2() {

	}
	public Vector2(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void flipY() {
		this.y = -y;
	}
	public void flipX() {
		this.x = -x;
	}
	
	public float getMagnitude() {
		float output = 0;
		output = (float) Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		return output;
	}
	
	public void scale(int scale) {
		x = x * scale;
		y = y * scale;
	}
	
	public Vector2 normalized() {
		Vector2 outputVector = new Vector2();
		outputVector.x = x / this.getMagnitude();
		outputVector.y = y / this.getMagnitude();
		return outputVector;
	}
	
	public float angleDegrees() {
		float output = 0;
		output = (float) ((float) Math.atan2(x, y) * 180 / Math.PI);
		return output;
	}
	
	public float angleRadians() {
		float output = 0;
		output = (float) Math.atan2(x, y);
		return output;
	}
	
}
