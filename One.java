public class One {

    public static void main(String[] args) {
       
            int[] n=new int[3];
            n[0]=1;
            for(int i=0;i<n.length;i++){System.out.println(n[i]);}
        }
    
    public static String reverse(String rev){
       
        String ans="";
        for (int i=rev.length()-1;i>=0;i--){
            ans+=rev.charAt(i);
        }
       
        return ans;
    }
}