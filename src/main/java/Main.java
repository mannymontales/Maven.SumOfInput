/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        //getInputNumber because it was a non-static method, made it a static method so the Class Main can call it. Non static are methods of an instance of a class,
        // since there was no object created the old method did not exist. A static method always exist.
        int number =  getInputNumber();


        int sum = sumOfNumbers(number);

        System.out.println(sum);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    public static int sumOfNumbers(int n) {

        int sum = 0;

        for (int i = 0; 0 < n; i++){

            // add N to the total sum of the number
            sum += n;//3
            n -= 1;
        //have total increment with i till its less than n
        }
        return sum;
    }
    
    
    public static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();

        return num;
    }
    
    
    
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
