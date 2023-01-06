package practice;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i = 0; i < n;i++) {
			for(int j = n - 1; j >= i;j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2 * i) - 1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < n;i++) {
			for(int j = 0; j <= i;j++) {
				System.out.print(" ");
			}
			for(int k = n; k >= (2 * i) - 1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}