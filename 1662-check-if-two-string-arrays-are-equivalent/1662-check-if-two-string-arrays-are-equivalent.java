class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String S1 = makeString(word1);
        String S2 = makeString(word2);
        
            return S1.equals(S2);
        
    }
    
    public static String makeString(String[] word){
        StringBuilder sb = new StringBuilder();
        
        for(String str : word){
            sb.append(str);
        }
        return sb.toString();
    }
}