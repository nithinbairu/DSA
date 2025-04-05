public class Gradious {
    public static void main(String[] args) {
        int[] arr={8,5,7,1};
        int p=0;
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int day=arr[j]-arr[i];
                if(p<day){
                    p=day;
                }
            }
        }
        System.out.println(p);
    }
}
