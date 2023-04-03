import java.util.*;
public class MajorityElement {

    public static void main(String args[]){
        int nums[]={1,3,2,5,1,3,1,5,1};
        int n = nums.length;

        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int i=0;i<nums.length;i++){
       if(frequency.containsKey(nums[i])){
        frequency.put(nums[i],frequency.get(nums[i])+1);
        }
        else{
            frequency.put(nums[i],1);
         }
        }
        for(Integer k : frequency.keySet()){
     if(frequency.get(k)>n/3){
        System.out.println(k);
     }
        }
    }
    
}
