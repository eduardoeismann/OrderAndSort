package Java.comboSort;

import java.io.*;

public class Run {
		public static void main(String[] args) {
				Run ob = new Run();
				int arr[] = {77, -33, 0, 7, -3, -7, -77, 33, 3};
				ob.sort(arr);

				System.out.println("Array - Sorted");

				for(int i = 0; i < arr.length; ++i) {
						System.out.print(arr[i] + " ");
				}
		}

    public int getNextGap(int gap) {
				return ( ( (gap * 10) / 13 ) < 1) ? 1 : gap;
    }

    public void sort(int arr[]) {
        int n = arr.length;
        int gap = n;
        boolean swapped = true;

        while(gap != 1 || swapped == true) {
            gap = getNextGap(gap);
            swapped = false;

            for(int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;

                    swapped = true;
                }
            }
        }
    }
}
