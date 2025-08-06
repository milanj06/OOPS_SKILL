package OOPS_SKILL;

class Circle1{
	public void area(double radius) {
		System.out.println(radius * radius * 3.14d);
	}
}
public class AreaofCircle {
public static void main(String[] args) {
	Circle1 c = new Circle1();
	c.area(3);
}
}
