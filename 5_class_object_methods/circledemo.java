import java.util.*;

class cricle {
	double raddi;

	double areaofcricle() {
		return 3.14 * raddi * raddi;
	}
}

class cricledemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter raddi : ");
		cricle c1 = new cricle();
		c1.raddi = sc.nextDouble();

		System.out.println(c1.areaofcricle());
	}
}
