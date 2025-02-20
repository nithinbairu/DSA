public class Third {
    public int minimuminsertionrequired(String s){
        int opening=0;
        int closing=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                opening++;
            }else{
                if(opening>0){
                    opening--;
                }else closing++;
            }
        }
        return opening+closing;
    }
}
