public class Main {
    public static void main(String[] args) {
        int n = args.length;
        int mn = Integer.parseInt(args[0]);
        int mx = Integer.parseInt(args[0]);
        for(int i = 0; i < n; i++) {
            if(Integer.parseInt(args[i]) > mx){
                mx = Integer.parseInt(args[i]);
            }
            if(Integer.parseInt(args[i]) < mn){
                mn = Integer.parseInt(args[i]);
            }
        }
        System.out.println("The maximum is " + mx + " and the minimum is " + mn);
    }
}