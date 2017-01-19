import java.util.Scanner;

public class line{
	public static void main(String[] args){
		double x1, x2, x3, y1, y2, y3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three points in format x1 y1 x2 y2 x3 y3\n");
	  
    //there has got to be a better way to handle this
		x1 = input.nextDouble();
		y1 = input.nextDouble();  
    x2 = input.nextDouble(); 
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();

		if ((x3 - x2) * (y2 - y1)/(x2 - x1) + y2 == y3){//this statement takes the position and slope from p1 to p2 and extends it to x3. if it matches y3, then they're all colinear
			System.out.print("\nPoint three is colinear with points one and two\n");
		}
		else {
			System.out.print("\nPoint three is not colinear with points one and two\n");
		}
	}
}




