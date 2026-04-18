package Day6;

public class Rev {
    public static void main(String[] args) {
        int n=156;
        int Rev=0;
        for(;n!=0;n=n/10){
            int last=n%10;
            Rev=Rev*10 +last;
            
        }

        System.out.println(Rev);
    }
}
