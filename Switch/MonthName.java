package Switch;
import java.util.*;
public class MonthName 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n) 
        {
            case 1:
                System.out.println("Jan");
                break;
        
            default:
                System.out.println("not a valid number");
                break;
        }
    }
    
}
