
import java.util.*;

public class Project6 {

    public static void main(String[] args) {
        // Read input from System.in 
        Scanner sc = new Scanner(System.in);

        //fill array
        System.out.println("Enter postive integers: ");
        int numberOfTwigs = sc.nextInt();
        int twigsArray[] = new int[numberOfTwigs];
        for (int i = 0; i < numberOfTwigs; i++) {
            twigsArray[i] = sc.nextInt();
        }
        Arrays.sort(twigsArray);
        int a = 0;
        int b = 0;
        
        for(int i= twigsArray.length-1; i >= 0; i--){
            if(a<=b){
                a+=twigsArray[i];
            }
            else{
                b+=twigsArray[i];
            }
            
        }
        
        double area=.5*a*b;
        
        
        // Print output to System.out 
        System.out.println("The Largest triangle: " + area);
    }

}
