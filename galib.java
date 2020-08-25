 public class galib{
 int id;
  public galib (int i){
  id=i;}
 public static void main(String[]args){
galib obj1=new galib(20);
System.out.println("my id is:"+obj1.id);
 int row=20;
 for(int i=row; i>=0; i--){
 for(int j=i; j>0; j--){
  System.out.print(" "+i);
 }
 System.out.println();
 }
  }
 }



//comment by sakif



public class Account{
    private double balance = 0;
    public Account(){

    }
    public Account(double b){
        balance = b;
    }
    public double add(double money){
        balance += money;
        return balance;
    }
    public double withdraw(double money){
        if(balance < money){
            balance -= 5;
            return balance;
        }else{
            balance -=money;
            return balance;
        }
    }
    public double inquire(){
        return balance;
    }
    public double interest(double inrt, int duration){
        return (inquire()+((inquire()*inrt*duration)/100));
    }
}










public class Bank{
    private Account checkings = new Account();
    private Account savings = new Account();

    public void deposit(double amount, String account){
        if(account == "c"){
            checkings.add(amount);
        }else{
            savings.add(amount);
        }
    }
    public void withdraw(double amount, String account){
        if(account == "c"){
            checkings.withdraw(amount);
        }else{
            savings.withdraw(amount);
        }
    }  
    public void transfer(double amount, String account){
        if(account == "c"){
            checkings.withdraw(amount);
            savings.add(amount);
        }else{
            savings.withdraw(amount);
            checkings.add(amount);
        }
    }     
    public void printBalances(){
        System.out.println("Checking balance: "+checkings.inquire());
        System.out.println("Checking banalace with interest: "+checkings.interest(5, 1));
        System.out.println("Savings balance: "+savings.inquire());
        System.out.println("Savings banalace with interest: "+savings.interest(5, 1));
    }
    public static void main(String[] args){
        Bank b1 = new Bank();
        b1.deposit(1000, "c"); 
        b1.withdraw(200, "c"); 
        b1.transfer(60, "c"); 
        b1.printBalances(); 
        System.out.println("------------------------------------");
        Bank b2 = new Bank();
        b2.deposit(1000, "s"); 
        b2.withdraw(260, "s"); 
        b2.transfer(50, "s"); 
        b2.printBalances(); 
    } 
}
