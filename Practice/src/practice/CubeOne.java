package practice;

import java.util.Scanner;

public class CubeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0; i <= arr.length - 1; i++) {
//			arr[i] = scan.nextInt();
			if((i % 3) == 0) {
				
				arr[i] = i * i * i;
			}
			else {
				arr[i] = i;
			}
		}
		for(int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}

}
