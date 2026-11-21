// import java.util.*;
// public class path{
//     public static void findsub(int[]arr, int idx, ArrayList<integer> path){
//         if(idx==arr.length){
//             if(path.size()>0){
//                 System.out.println(path);
//             }
//             else{
//                 findsub(arr, idx+1, path);
//                 path.add(arr[idx]);
//                 findsub(arr, idx+1, path);
//                 path.remove(path.size()-1);
//             }
//         }
//     }
//     public static void main(String[] args){
//         int[] arr={1, 2, 3};
//         ArrayList<Integer> path=new ArrayList<>();
//         findsub(arr, 0, path);
//     }
// }

import java.util.k*;
public class getkpc{
    Static Character[][] numberToCharMap;
    private static List<String> printkpc(int[] numbers, int len, int idx, String s){
        if(len==idx){
            return new Arraylist<>(Collections.singleon(s));
        }
        List<String> stringList=new ArrayList<>();
        for(int i=0; i<numberToCharMap[numbers[idx]].length; i++){
            String scopy=String.copyValueOf(s.toCharArray());
            scopy=scopy.concat(numberToCharMap[numbers[idx]][i].toString());
            stringList.addAll(printkpc(numbers, leng, idx+1, scopy));
        }
        return stringList;
    }
    private static void printkpc(int[] numbers){
        generateNumberToCharMap();
        List<String> stringList=printkpc(numbers, numbers.length, 0, "");
        stringList.stream().forEach(System.out::println);
    }
    private static void generateNumbersToCharMap(){
        numberToCharMap=new Character[10][5];
        
    }
}