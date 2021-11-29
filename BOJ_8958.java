import java.util.Scanner;

public class BOJ_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int plus = 1;
        char o = 'O';
        String[] arr = new String[n+1];
        int[] sumArr = new int[n];
        for (int i = 1; i < n+1; i++){
            arr[i] = sc.nextLine();
        }
        for (int j = 1; j < n+1; j++){
            for (int k = 0; k < arr[j].length(); k++){
                if (arr[j].charAt(k) != o){
                    sum += plus;
                    sumArr[j-1] = sum;
                    for (int kk = 0; k < arr[j].length() - 1; kk++){
                        if(arr[j].charAt(kk) == arr[j].charAt(kk+1)){
                            plus += 1;
                            sum += plus;
                            sumArr[j-1] = sum;
                        } else {
                            plus = 1;
                        }
                    }
                }
            }
        }
        for (int l : sumArr){
            System.out.println(l);
        }
    }
}
