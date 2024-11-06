class Solution {
    public boolean rotateString(String s, String goal) {
     ArrayList<Character> list=new ArrayList<>();
     for(char c: s.toCharArray()){
        list.add(c);
     }
     int i=0;
     while(i<goal.length()){
        list.add(list.get(0));
        list.remove(0);
        System.out.println(list);
        StringBuilder sample = new StringBuilder();
          for (char c : list) {
                sample.append(c);
            }
            System.out.println(sample);
        if(sample.toString().equals(goal)){
            return true; 
        }
        i++;
     }
     return false;
    }
}