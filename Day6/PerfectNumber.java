package Day6;

public class PerfectNumber {
    public static void main(String[] args) {
        int num =282;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num %i ==0){
                sum+=i;
            }
        }
        if (sum==num) {
            System.out.println("perfectNumber");
            
        }
        else{
            System.out.println("Not perfectNumber");
        }
    }
}
