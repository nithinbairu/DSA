package Inheritence;

public class Main {
    int i;
    Main(){
        this.i=123;
    }
    
    public static void main(String[] args) {
        Box n=new Box(5);
        Box box=new Box(n);
        Main x=new Main();
        BoxWeight weight=new BoxWeight();
        System.out.println(x);
        System.out.println(box.l+" "+box.w+" "+box.b);
        System.out.println(box.l);
        BoxWeight box1=new BoxWeight(1,2,3,5);
        System.out.println(box1.l);
        System.out.println(box1.weight);
        int j=weight.newmethod();
        System.out.println(j);
        BoxWeight box3=new BoxWeight(12,15,16,20);
        System.out.println(box3.l+" "+box3.b+" "+box3.w+" "+box3.weight);
        Box box4=new BoxWeight(11,12,13,14);
        System.out.println(box4.l+" "+box4.b+" "+box3.w+" ");
    }
    
}
