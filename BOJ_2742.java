import java.util.Scanner;

public class BOJ_2742 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = n; i > 0; i--){
            int nn = n - i;
            arr[nn] = i;
            System.out.println(arr[nn]);
        }
    }
}
