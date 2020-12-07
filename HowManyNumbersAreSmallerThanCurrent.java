
public class HowManyNumbersAreSmallerThanCurrent {
	 public int[] smallerNumbersThanCurrent(int[] nums) {
	     ArrayList<Integer> arr = new ArrayList<Integer>();
	        for(int i=0;i<nums.length;i++){
	            int greater = 0 ;
	            for(int j=0;j<nums.length;j++){
	                if(nums[i]>nums[j]){
	                    greater++;
	                }
	                
	                
	            }
	        arr.add(greater);}
	        int[] answer = new int[arr.size()];
	        for(int k=0;k<arr.size();k++){
	            answer[k]= arr.get(k);
	        }
	        return answer;
	    }
}
