import java.util.*;
public class CountSubArrays_withSum_K {
    
    public static int countKsubArrays(int arr[],int k){
        int sum=0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
map.put(0, 1);
        for(int i=0;i<arr.length;i++){
               sum+=arr[i];
          if(map.containsKey(sum-k)){
            count+=map.get(sum-k);
          }
          else{
            map.put(sum,map.getOrDefault(sum,0)+1);
          }
        }
return count;
    }
    public static void main(String args[]){
int arr[]={3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
int k=5;
System.out.println(countKsubArrays(arr, k));
    }
}
