package pakages;

public class Box {
    int l;
    int b;
    int w;
    Box(){
        this.l=-1;
        this.w=-1;
        this.b=-1;
    } 
    Box(int l,int b, int w){
        this.l=l;
        this.w=w;
        this.b=b;
    } 
    Box(int side){
        this.l=side;
        this.b=side;
        this.w=side;
    }
    Box(Box old){
        this.l=old.l;
        this.b=old.b;
        this.w=old.w;
    }
    public void information(){
        System.out.println("I am from Box");
    }
    private static int fun(int x){
        return x;
    }
    protected static int funpro(){
        int n=fun(122);
        return n;
    }
}
