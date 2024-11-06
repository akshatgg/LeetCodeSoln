class Solution {
    public String makeFancyString(String s) {
          int count=1;
         StringBuilder sam = new StringBuilder(s);
        for(int i=1 ; i<sam.length() ;i++){
         if(sam.charAt(i-1) == sam.charAt(i)){
            count++;
 

         }
        else{
            count=1;
           

         }
        if(count>2){
            sam.deleteCharAt(i);
            count--;
          
            i--;
            }
        }
        return sam.toString();
    }
}