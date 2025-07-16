// 13. Print All Elements of an Array using Recursion

public class PrintArray {
    public static void printArr(int[] arr, int index) {
        if (index == arr.length) return;
        System.out.println(arr[index]);
        printArr(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        printArr(arr, 0);
    }
}