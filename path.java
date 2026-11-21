import java.util.*;
public class path{
    public static void findsub(int[]arr, int idx, ArrayList<integer> path){
        if(idx==arr.length){
            if(path.size()>0){
                System.out.println(path);
            }
            else{
                findsub(arr, idx+1, path);
                path.add(arr[idx]);
                findsub(arr, idx+1, path);
                path.remove(path.size()-1);
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1, 2, 3};
        ArrayList<Integer> path=new ArrayList<>();
        findsub(arr, 0, path);
    }
}