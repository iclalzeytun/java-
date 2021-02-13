package circle;

public class Circle {

	public int circleXlocation;
	public int circleYlocation;
    public int circleRadius;
    public int x;
    public int x2;
    public int y;
    public int y2;
    public int r;
    public int r2;
    
    boolean doIntersect (Circle c, Circle c2) {
    	x = c.circleXlocation;
    	x2 = c2.circleXlocation;
    	y = c.circleXlocation;
    	y2 = c2.circleXlocation;
    	r = c.circleRadius;
    	r = c2.circleRadius;
    	
    	int distance2 = (x-x2)*(x-2)+(y-y2)*(y-y2); //distance karesi
    	
    	int radSum = r+r2;
    	
    	if(distance2==radSum) {
    		return true;
    	}
    	else if (distance2 > radSum) {
    		return false;
    	}
    	else if (distance2 < radSum) {
    		return false;
    	}
    		
        return false;
    }

	public int getCircleXlocation() {
		return circleXlocation;
	}

	public void setCircleXlocation(int circleXlocation) {
		this.circleXlocation = circleXlocation;
	}

	public int getCircleYlocation() {
		return circleYlocation;
	}

	public void setCircleYlocation(int circleYlocation) {
		this.circleYlocation = circleYlocation;
	}

	public int getCircleRadius() {
		return circleRadius;
	}

	public void setCircleRadius(int circleRadius) {
		this.circleRadius = circleRadius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getR2() {
		return r2;
	}

	public void setR2(int r2) {
		this.r2 = r2;
	}
    
}
