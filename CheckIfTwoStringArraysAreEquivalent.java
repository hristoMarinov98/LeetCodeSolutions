
public class CheckIfTwoStringArraysAreEquivalent {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordOne = "";
        String wordTwo ="";
        for (int i =0;i<word1.length;i++)
        {
            wordOne = wordOne + word1[i];
        }
        for (int j =0;j<word2.length;j++)
        {
            wordTwo = wordTwo + word2[j];
        }
        if(wordOne.equals(wordTwo)){
            return true;
        }
        else{
            return false;
        }
    }
}
