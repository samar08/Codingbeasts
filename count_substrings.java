class Solution {
    public int countBinarySubstrings(String s) {
        int n=s.length(),count=0,i=0;
        boolean flag=true;
        ArrayList<Character> st=new ArrayList<Character>();
        st.add(s.charAt(0));
        i+=1;
        while(i<n){
    
            if(s.charAt(i)==st.get(0)){
                st.add(s.charAt(i));
                i+=1;
            }
            else{
             
                int start=i;
                while(st.size()>0 && ((i<n) &&(s.charAt(i)!=st.get(0)))){
                    st.remove(0);
                  
                    i+=1;
                    count+=1;
                }
                if(st.size()>0){
                    while(st.size()>0){
                        st.remove(0);
                    }
                }
                for(int k=start;k<i;k++){
                    st.add(s.charAt(k));
                }
                
              
                
                
            }
        }
        return (count);
        /*
   
       
        int i,j,size=2;
        while(size<=n){
         Queue<Character> q=new LinkedList<Character>();
                 HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(i=0;i<size;i++){
            if(s.charAt(i)=='1'){
                map.put('1',map.getOrDefault('1',0)+1);
            }
            else{
                 map.put('0',map.getOrDefault('0',0)+1);
            }
            q.add(s.charAt(i));   
        }
            if(map.get('1')==map.get('0')){
                //System.out.println(map);
                int diff=0;
                for(j=1;j<size;j++){
                    if(s.charAt(j)!=s.charAt(j-1)){
                        diff+=1;
                    }
                }
                if(diff==1){
                count+=1;
                   // System.out.println(0+" "+i);
                    //System.out.println(map);
                }
            }
            for(i=size;i<n;i++){
                if(s.charAt(i)=='1'){
                    map.put('1',map.getOrDefault('1',0)+1);
                   q.add(s.charAt(i)); 
                }
                else{
                     map.put('0',map.getOrDefault('0',0)+1);
                       q.add(s.charAt(i)); 
                }
                if(q.poll()=='1'){
                      map.put('1',map.getOrDefault('1',0)-1);
                }
                else{
                       map.put('0',map.getOrDefault('0',0)-1);
                }
            if(map.get('1')==map.get('0')){
                // System.out.println(map);
             int diff=0;
                for(j=i-size+2;j<=i;j++){
                    if(s.charAt(j)!=s.charAt(j-1)){
                        diff+=1;
                    }
                }
                if(diff==1){
                count+=1;
                     //System.out.println((i-size+1)+" "+i);
                    //System.out.println(map);
                }
            }
                
            }
           size+=2; 
            }
        return count;
        */
        
    }
}
