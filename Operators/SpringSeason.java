package Operators;
import java.util.*;
public class SpringSeason {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int d=sc.nextInt();
        boolean isSpring =false;
        if((m>3 && d>20 ) ||(m==4)||(m==5)||(m==6 && d<=20)){
            isSpring = true;

        }
        System.out.println(isSpring);

    }

    
}
