
package assignment3.primeAndOdd;

class CustomException extends Exception{
    CustomException(String messege){
        super(messege);
    }
}

public class primeAndOdd {
    private int number;
    
    public void setNumber(int number){
        this.number=number;
    }
    
    public void checkNumber() throws Exception{
        if(number%2!=0)
        {
            //odd
            // now check for prime number
            int check=0;
            for(int i=2;i<number;i++)
            {
                if(number%i==0){
                    check=1;
                }
            }
            
            if(check==0){
                // number is prime and odd
                throw new CustomException("##### Number is invalid #####");
            }
            else{
                // number is odd but not prime
                System.out.println("***** Your number is valid ********* ");
            }
        }
        else
        {
            //even
            System.out.println("***** Your number is valid ********* ");
        }
    }
}
