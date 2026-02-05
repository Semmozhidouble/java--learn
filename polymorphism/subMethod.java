package polymorphism;

public class subMethod {
    public static void main(String[] args){
        int a=10;
        int b=20;
        subMethod(a,b);
    }
    public static void subMethod(int a,int b){
        System.out.println(a+b);
        subMethod2(a-b);

    }
    public static void subMethod2(int a){
        System.out.println(a);
        subMethod3("hey");
    }
    public static String subMethod3(String a){
        System.out.println(a);
        return a;

    }

    
}
