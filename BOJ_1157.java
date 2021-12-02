import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int[] arr= new int[26];
        for (int i = 0; i < st.length(); i++){
            if ('A' <= st.charAt(i) && st.charAt(i) <= 'Z'){
                arr[st.charAt(i) - 'A']++;
            } else {
                arr[st.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++){
            if (arr[i] > max){
                max = arr[i];
                ch = (char)(i + 'A');
            } else if (arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
