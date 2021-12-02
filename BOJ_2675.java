import java.util.Scanner;

public class BOJ_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int s = sc.nextInt();
            String st = sc.next();
            for (int j = 0; j < st.length(); j++){
                for (int k = 0; k < s; k++){
                    System.out.print(st.charAt(j));
                }
            }
            System.out.println(); //여기서 이게 왜들어가야 정답인지 모르겠음
        }
    }
}
