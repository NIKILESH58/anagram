import java.io.*;
import java.util.*;

public class anagram {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String A=in.nextLine();
        int c=0,d=0;
        char a1[]= new char[A.length()];
        String B=in.next();
                char B1[]= new char[B.length()];

        for(int i=0;i<A.length();i++)
        {
       
             c=c+(int)A.charAt(i);
             d=d+(int)B.charAt(i);
            }
        if(c==d)
        System.out.println("anagram");
        else
                System.out.println("not anagram");

    }
}