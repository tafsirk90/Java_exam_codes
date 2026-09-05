public class Main {
    public static void main(String[] args) {
        int a = minmax("min", 1,2,4,6);
        int b = minmax("max", 1,2,4,6);

        System.out.println(a);
        System.out.println(b);
    }
    public static int minmax(String mode, int... a){
        int result = a[0];
        if(mode.equals("min")){
            for(int i = 0; i < a.length; i++){
                if(a[i] < result){
                    result = a[i];
                }
            }
        }
        else{
            for(int i = 0; i < a.length; i++){
                if(a[i] > result){
                    result = a[i];
                }
            }
        }
        return result;
    }
}