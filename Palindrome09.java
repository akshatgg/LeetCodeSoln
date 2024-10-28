class Solution {
    public boolean check(int x){
    
  return isPalindrome(x);
    }
    public boolean isPalindrome(int x) {
        int y=x;
        ArrayList<Object> mixedList =new ArrayList<>();
        
        String str= String.valueOf(y);

        for(char c : str.toCharArray()){
            mixedList.add(c);
        }

        Collections.reverse(mixedList);

          StringBuilder sb = new StringBuilder();
        for (Object element : mixedList) {
            sb.append(element);
        }


         String resultStr = sb.toString();
         
        return resultStr.equals(str);
       
    }
    

}
