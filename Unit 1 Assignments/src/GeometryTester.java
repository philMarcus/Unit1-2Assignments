/*
 * tester for Geometry Class. See Geometry.java for info.
 * Marcus
 */
import java.util.Scanner;

public class GeometryTester {

	public static void main(String[] args) {

		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter three integers X, Y, and Z: ");

		int x = kboard.nextInt();
		int y = kboard.nextInt();
		int z = kboard.nextInt();

		Geometry geo = new Geometry();

		geo.rectangleArea(x, y);
		geo.circleArea(x);
		geo.triangleArea(x, y);
		geo.rectangularPrismVolume(x,y,z);
		geo.cylinderVolume(x, y);
		geo.squarePyramidVolume(x, y);
		//geo.yourFirstFormula(x,y,z);
		//geo.yourSecondFormula(x,y,z);

		kboard.close();
	}

}
