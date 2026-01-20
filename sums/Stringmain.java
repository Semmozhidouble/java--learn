package sums;

public class Stringmain {
    public static void main(String[] args){
        String str="Hello";
        System.out.println(str);
        String reversedString="";
        str.length();
        for(int i=str.length();i>0;i--){
            reversedString=reversedString+str.charAt(i-1);
        }
        System.out.println(reversedString);

    }
    
}
