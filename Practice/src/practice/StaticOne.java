package practice;

class Rays {
	static int range = 2;
	
	void display() {
		System.out.println(range);
	}
}
class Alpha extends Rays {
	
	void display() {
		System.out.println(range + 8);
	}
}
public class StaticOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a = new Alpha();
		a.display();
	}

}
