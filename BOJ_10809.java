import java.util.Scanner;

public class BOJ_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        for(int i = 0; i < st.length(); i++){
            if(arr[st.charAt(i) - 'a'] == -1) {
                arr[st.charAt(i) - 'a'] = i;
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
