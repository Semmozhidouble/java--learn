package polymorphism;

public class MultipleMethod {
    static int add(int a ,int b){
    return a+b;
    }
    static int add(int a,int b,int c){
        return a*b*c;
    }
    public static void main(String[] args){
        int a=10;int b=20;int c=3;
        System.out.println(add(a,b));
        System.out.println(add(a,b,c));
    }
    
}
