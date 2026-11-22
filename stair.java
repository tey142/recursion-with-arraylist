import java.util.Scanner;
public class stair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of stairs: ");
        int n=sc.nextInt();
        printstairpaths(n, "");
        sc.close();
    }
    public static void printstairpaths(int n, String path) {
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(path);
            return;
        }
        printstairpaths(n-1, path+"1");
        printstairpaths(n-2, path+"2");
        printstairpaths(n-3, path+"3");
    }
}
