package Inheritence;

public class BoxWeight extends Box{
    int weight;
    BoxWeight(){
        this.weight=14;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }
    BoxWeight(int l, int b, int w, int weight){
        super(l,b,w);
        this.weight=weight;
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
