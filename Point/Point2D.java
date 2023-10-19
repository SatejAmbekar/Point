package Point;
import java.lang.Math;
public class Point2D {
	private int x;
	private int y;
	
	public Point2D(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void displayCoord()
	{
		System.out.println("x= "+x);
		System.out.println("y= "+y);

	}
	
	@Override
	public  String toString() 
	{
		return "x= "+x+"\ny= "+y;
	}
	
	public boolean isEqual(Point2D pobj)
	{
		if(this.x==pobj.x && this.y==pobj.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double calculateDistance(Point2D pobj)
	{
		double d;
		//d=√((x2 – x1)² + (y2 – y1)²);
		double u=pobj.x-this.x;
		double v=pobj.y-this.y;
		d=Math.sqrt(Math.pow(u,2)+Math.pow(v,2));
		return d;
	}

	private int pow(double u, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
