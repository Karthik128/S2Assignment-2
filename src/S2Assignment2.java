
public class S2Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
        System.out.println("Prime numbers between 1 and 100");
       
        //loop through the numbers one by one
        for(int i=1; i < 100; i++){
               
                boolean PrimeNumber = true;
               
                //check to see if the number is prime
                for(int j=2; j < i ; j++){
                       
                        if(i % j == 0){
                                PrimeNumber = false;
                                break;
                        }
                }
                // print the number
                if(PrimeNumber)
                        System.out.print(i+" ");
        }
}
}

