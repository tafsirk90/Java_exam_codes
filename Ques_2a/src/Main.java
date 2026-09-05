import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int res = findExtreme(type, a);
        System.out.println(type + " " + res);
    }
    public static int findExtreme(String type, int[] a){
        int ans = 0;
        if(type.equals("largest")){
            int result = Integer.MIN_VALUE;
            for(int i = 0; i < a.length; i++){
                if(a[i] >= result) result = a[i];
            }
            ans = result;
        }
        else {
            int result = Integer.MAX_VALUE;
            for(int i = 0; i < a.length; i++){
                if(a[i] <= result) result = a[i];
            }
            ans = result;
        }
        return ans;
    }
}