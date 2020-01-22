import java.util.Scanner;

public class SelectionSort {
    public static void main(String stgs[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0, n = sc.nextInt();
        int arr[] = new int[n], tmp, min_index;
        
        while (i < n) arr[i++] = sc.nextInt();   //taking array input
        
        for (i = 0; i < n - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] > arr[min_index])     //finding minimum element in the unsorted subarray
                    min_index = j;
            tmp = arr[min_index];                //swapping minimum element with the assumed sorted subarray
            arr[min_index] = arr[i];
            arr[i] = tmp;
        }
            for(i=0;i<n;i++) System.out.print(arr[i]+ " ");       //printing sorted array
                                                                  //decreasing ord
    }
}
