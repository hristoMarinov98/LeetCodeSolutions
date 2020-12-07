
public class JewelsAndStones {
	 public int numJewelsInStones(String J, String S) {
	        char[] stringj = J.toCharArray();
	        char[] strings = S.toCharArray();
	        int jewel = 0;
	        for(int i=0;i<strings.length;i++){
	            for(int j=0;j<stringj.length;j++){
	                if(strings[i]==stringj[j]){
	                    jewel++;
	                }
	            }
	        }
	        return jewel;
	    }

}
