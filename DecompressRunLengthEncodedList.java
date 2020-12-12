
public class DecompressRunLengthEncodedList {
	 public int[] decompressRLElist(int[] nums) {
	        ArrayList<Integer> ans = new ArrayList<Integer>();
	        
	        for(int i=0;i<nums.length;i+=2){
	            for(int j=i+1;j<nums.length;j++){
	                while(nums[i]!=0){
	                    ans.add(nums[j]);
	                    nums[i]--;
	                }
	            }
	        }
	        int[] answer = new int[ans.size()];
	        for(int k=0;k<ans.size();k++){
	            answer[k]=ans.get(k);
	        }
	        return answer;
	    }
}
