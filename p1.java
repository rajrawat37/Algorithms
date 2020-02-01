import java.util.Scanner;
public class caps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, n = sc.nextInt();
        int arr[] = new int[n], tmp;
        while (i < n) arr[i++] = sc.nextInt();

        for (i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] >arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

        for ( i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
