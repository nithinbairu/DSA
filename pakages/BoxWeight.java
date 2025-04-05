package pakages;

public class BoxWeight extends Box{
    int weight;
    BoxWeight(){
        this.weight=14;
    }
    BoxWeight(int l, int b, int w, int weight){
        this.weight=12;
    }
    // BoxWeight(BoxWeight other){
    //     super(other);
    //     this.weight=weight;
    // }
    public int newmethod(){
        int n=funpro();;
        return n;
    }
    
}
