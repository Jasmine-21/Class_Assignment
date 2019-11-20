import java.util.*;
/*
public class FindKlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[] {4, 10, 3, 5, 1};
		 
        int k = 3;
        printMaxKElements(array, k);
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
	}
	public void printMaxKElements(int array[], int k) {
        if(k > array.length) {
            System.out.println("Invalid k size");
            return;
        }
        for (int i = k - 1; i >= 0; i--) {
            minHeapify(i, array, array.length);
        }
        for (int i = k; i < array.length; i++) {
            if(array[0] < array[i]) {
                //Found some data greater than arr[0], replace that with nex max.
                array[0] = array[i];
 
                //Call heapify process for firsst K elements and that will bring minimum among k elements back to arr[0]
                minHeapify(0, array, k);
            }
        }
	}
	private int leftChild(int i) {
        return 2 * i + 1;
    }
 
    private int rightChild(int i) {
        return 2 * i + 2;
    }
    private void minHeapify(int i, int[] data, int size) {
        int smallestElementIndex = i;
 
        int leftChildIndex = leftChild(i);
        if (leftChildIndex < size && data[leftChildIndex] < data[smallestElementIndex]) {
            smallestElementIndex = leftChildIndex;
        }
 
        int rightChildIndex = rightChild(i);
        if (rightChildIndex < size && data[rightChildIndex] < data[smallestElementIndex]) {
            smallestElementIndex = rightChildIndex;
        }
 
        if (smallestElementIndex != i) {
            int swap = data[i];
            data[i] = data[smallestElementIndex];
            data[smallestElementIndex] = swap;
 
            // Recursively heapify for the affected node
            minHeapify(smallestElementIndex, data, size);
        }
    }
}
*/
import java.util.Arrays; 
import java.util.Collections; 
  
class FindKlargestnumber { 
    public static void kLargest(Integer[] arr, int k) 
    { 
        Arrays.sort(arr, Collections.reverseOrder()); 
        for (int i = 0; i < k; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    public static void main(String[] args) 
    { 
        Integer arr[] = new Integer[] { 1, 23, 12, 9, 
                                        30, 2, 50 }; 
        int k = 3; 
        kLargest(arr, k); 
    } 
} 
