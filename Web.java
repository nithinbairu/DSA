public class Web {
    public static String function(int n){
        String s="";
        char a='a';
        for(int i=0;i<n;i++){
            if(i%2!=0){
                s=a+i+s;
            }else{
                s=s+a+i;
            }
        }
        return s;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(function(n));
    }
}
