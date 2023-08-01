package YoutubePeictise;

import java.util.Arrays;
import java.util.Collections;

public class SortingElement {

	public static void main(String[] args) {
		int a[]= {30,50,10,60,40,20};
		int aa[]= {30,50,10,60,40,20};
		System.out.println("before Sort= "+Arrays.toString(a));
		//Approch 1
		System.out.println("========Using parallel sort=======");
		Arrays.parallelSort(aa);
		System.out.println("After parallel Sort"+Arrays.toString(aa));
		//approch 2
		System.out.println("========Using sort method from array=======");
		Arrays.sort(a);
		System.out.println("After Sort"+Arrays.toString(a));
		//Approch 3 in reversing order
		System.out.println("========Using Collections.reverseOrder=======");
		Integer arr[]= {30,50,10,60,40,20};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("After Sort"+Arrays.toString(arr));
	}

}
