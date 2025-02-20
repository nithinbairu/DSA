public class Divisible {
    public static void main(String[] args) {
        int n=3;
        int[] arr={2,3,5};
        int k=0;
        int ans=arr[0];
        int main=0;
        while(true){
            if((ans%arr[0]==0)||(ans%arr[1]==0)||(ans%arr[2]==0)){
                main=ans;
                k++;
                if(k==n){
                    break;
                }

            }
            ans++;
        }
        System.out.println(main);
    }
}
