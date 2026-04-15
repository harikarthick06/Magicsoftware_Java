package WhileLoop;

public class ReverseNumberWhile {
    public static void main(String[] args){
        int n=231;
        int reverse=0;

        while(n!=0){
            int last=n%10;
            reverse=reverse*10+ last;
            n=n/10;
        }
        System.err.println(reverse);
    }
    
}
