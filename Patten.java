import java.util.Scanner;

public class Patten {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int n =k.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i==0 || i==n-1)&&i!=j) {
                    System.out.print("* ");
                }else if((j==0 || j==n-1)&&i!=j){
                    System.out.print("* ");
                }else if(i==j){
                    System.out.print("* ");
                }else if(i+j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            k.close();
        }
    }
}
