package circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner value = new Scanner(System.in);
		
		Circle circle = new Circle ();
		Circle circle2 = new Circle();
		
		System.out.println("enter circle's x location");
        circle.x= value.nextInt();
        System.out.println("enter circle's x2 location");
        circle.x2= value.nextInt();
        
        System.out.println("enter circle's y location");
        circle.y= value.nextInt();
        System.out.println("enter circle's y2 location");
        circle.y2= value.nextInt();
        
        System.out.println("enter circle's radius");
        circle.r= value.nextInt();
        System.out.println("enter circle's y2 radius");
        circle.r2= value.nextInt();
        
        System.out.println(circle.doIntersect(circle, circle2));
	}

}
