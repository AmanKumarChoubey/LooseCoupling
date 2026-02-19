import java.util.*;

class InvalidCustomerException extends Exception{
    
}
class Atm {
    private final int accNum=1234;
    private final int accPass=5678;
    
    private int inpNum;
    private int inpPass;
   
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        inpNum=sc.nextInt();
        System.out.println("Enter Password: ");
        inpPass=sc.nextInt();
        
    }
    public void verify() throws InvalidCustomerException{
        if(inpNum==accNum && inpPass==accPass){
            System.out.println("Proceed for Payment");
        }
        else{
            // InvalidCustomerException ex=new InvalidCustomerException();
            // throw ex;
            //Directly Throw an Exception
            throw new InvalidCustomerException();
        }
    }
}
class Bank{
    public void initiate(){
        Atm a=new Atm();
        try{
          a.input();
          a.verify();  
        }
        catch(InvalidCustomerException ex1){
            try{   
                a.input();
                a.verify();  
            }
            catch(InvalidCustomerException ex2){
               try{
                  a.input();
                  a.verify();  
                }
               catch(InvalidCustomerException ex3){
                  System.out.println("Sorry Try it Tommorow Now");
                } 
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.initiate();
    }
}
