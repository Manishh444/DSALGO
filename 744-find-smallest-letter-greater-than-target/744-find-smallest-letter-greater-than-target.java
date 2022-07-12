class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;

        while(start<= end){
            int mid = start + (end-start)/2;
            
        // if condition is very specific to this problem, in case if were to find the greatest element smaller than target elemnet then we would use this if condition for start paramenter and keep end paramenter in else conditiom    
             if( target < letters[mid]){
                // start = mid +1;
                   end = mid-1;
            }

            else {
                // end = mid-1;
                start = mid +1;
            }
        }
       // if target is greater than the greatest element in array than start will be equla to lenght of array and hence below logic will return reminder = 0; 
        //and arr(0) elemt is returned
        return letters[start % letters.length];
    }
}