package ForLoop;

public class ReverseNumberFor {
    public static void main(String[] args){
        int reverse=0;
        int n=231;
        for(;n!=0;n=n/10){
            int digit=n%10;
            reverse=reverse*10+digit;
        }
        System.out.println(reverse);
    }
    
}
