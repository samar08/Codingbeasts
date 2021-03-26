class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i=0,j=0;
        int n=s.length(),m=t.length();
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                i+=1;
                j+=1;
            }
            else{
                j+=1;
            }
        }
        if(i==n){
            return true;
        }
        else{
          return false;  
        }
        
    }
}
