import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
    //     int arr1[] = new int[arr.length];
    //     TreeMap<Integer,Integer>map= new TreeMap<>();
    //     for(int i=0;i<arr.length;i++){
    //         map.put(arr[i],i+1);
    //     }
    // int j=0;
    //     // for(Integer num:map.keySet()){
    //     //     arr1[j]=(map.get(num)+1);
    //     //     j++;
    //     // }
    //     for(int i=0;i<arr.length;i++){
    //         arr1[j]=map.get(arr[i]);
    //     }

    //     return arr1;

    TreeSet<Integer>map1= new TreeSet<>();
    for(int i=0;i<arr.length;i++){
        map1.add(arr[i]);
    }
    int idx=1;
    HashMap<Integer,Integer>map2=new HashMap<>();
    for(Integer num:map1){
        map2.put(num,idx);
        idx=idx+1;
    }
    int res[]= new int[arr.length];
    //int j=0;
    for(int i=0;i<arr.length;i++){
        res[i]=map2.get(arr[i]);
        //j++;
    }
    return res;
    }
}