import java.util.Scanner;

public class BOJ_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        sc.close();
        one = Integer.parseInt(new StringBuilder().append(one).reverse().toString());
        two = Integer.parseInt(new StringBuilder().append(two).reverse().toString());
        System.out.println(one > two ? one : two);
    }
}
