/*
PROGRAM: Rotate array of length n, to the Right by k (In-Place).
PSEUDOCODE: First reverse from  0 to n-k. Then reverse from 0 to n. Finally, reverse first k elements. 
*/

// VERSION 1.0

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {7, 4 , 55, 77, 2, 654, 1};
        printer(arr, "Primary array: ");

        int k = 3;
        if (k >= arr.length) k = k % arr.length;

        if (k == 0 || arr.length == 1) {
            printer(arr, "Final array: ");
            return;
        }

        arr = reverser(arr, 0, arr.length - k); // Reverse till n-k
        arr = reverser(arr, 0, arr.length); // Reverse till n
        arr = reverser(arr, 0, k); // Reverse till k
        printer(arr, "Final array: ");
    }

    public static int[] reverser(int[] arr, int lo, int hi){
        int temp;
        for(int i = lo; i < hi; i++){
            if (hi-1-i <= i) break;
            else{
                temp = arr[i];
                arr[i] = arr[hi-1-i];
                arr[hi-1-i] = temp;
            }
        }
        return arr;
    }

    public static  void printer(int[] arr, String status){
        System.out.println();
        System.out.print(status);
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}