package Point;
import java.util.Scanner;
public class TestPoint {

 

	public static void main(String[] args) {
	     int x;
	     int y;
	     boolean b;
	     double distance;
	     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1 and y1 coordinates");
		x=sc.nextInt();
		y=sc.nextInt();
		Point2D obj1=new Point2D(x,y);
		
		System.out.println("Enter x2 and y2 coordinates");
		x=sc.nextInt();
		y=sc.nextInt();
		Point2D obj2=new Point2D(x,y);
		
		System.out.println("----obj1 details----");
		obj1.displayCoord();
		System.out.println("----obj2 details----");
		obj2.displayCoord();
		
		b=obj1.isEqual(obj2);
		if(b)
		{
			System.out.println("Point1 and Point2 are located at same position");
		}
		else
		{
			System.out.println("Point1 and Point2 are located at different position");
		}
		
		distance=obj1.calculateDistance(obj2);
		System.out.println("Distance between x and y: "+distance);
		
		System.out.println("Enter x3 and y3 coordinates");
		x=sc.nextInt();
		y=sc.nextInt();
		Point2D obj3=new Point2D(x,y);
		
		System.out.println("Enter x4 and y4 coordinates");
		x=sc.nextInt();
		y=sc.nextInt();
		Point2D obj4=new Point2D(x,y);
		
		System.out.println("Enter x5 and y5 coordinates");
		x=sc.nextInt();
		y=sc.nextInt();
		Point2D obj5=new Point2D(x,y);
		
		Point2D[] parr= new Point2D[5];
		parr[0]=obj1;
		parr[1]=obj2;
		parr[2]=obj3;
		parr[3]=obj4;
		parr[4]=obj5;
		
		System.out.println("----All objs details----");
		for(Point2D pobj: parr) {
			System.out.println(pobj);
		}
	}

}
