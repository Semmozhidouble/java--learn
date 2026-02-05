package polymorphism;

public class argument {
    public static void main(String[] args){
        int a=45;
        int b=5; 
        System.out.println(add(a,b));
        System.out.println(difference(a,b));
        System.out.println(mul(a,b));
    }
    public static int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static int difference(int a,int b){
        int d=a-b;
        return d;
    }
    public static int mul(int c,int d){
        int e= c*d;
        return e;
    }
}
