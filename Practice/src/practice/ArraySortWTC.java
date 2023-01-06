package practice;

public class ArraySortWTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {4,3,3,6,4,3};
//		int arr[] = {4,3,4,3,6,3,4};
//		for(int i = 0; i < arr.length - 1;i++) {
//			int temp;
//			if(arr[i] > arr[i + 1]) {
//				temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//			}
//			else {
//				
//			}
//		}
//		
//		for(int i = 0; i < arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		int a[] = {4,3,3,6,4,3};
		int a[] = {4,3,4,3,6,3,4};
		int n = 7;
		Beta b = new Beta();
		b.insertionSort(a, n);
		
		Gamma g = new Gamma();
		g.display(a, n);
	}
		
}
	
	class Beta {
		void insertionSort(int a[], int n) {
			int i, j, item;
			for(i = 1; i <= n - 1;i++) {
				item = a[i];
				for(j = i - 1; j >= 0 && a[j] > item; j--) {
					a[j + 1] = a[j];
					
				}
				a[j + 1] = item;
			}
		}
		
	}

	class Gamma {
		void display(int a[], int n) {
			int i;
			for( i = 0; i <= n - 1; i++) {
				System.out.println(a[i] + " ");
			}
		}
	}

