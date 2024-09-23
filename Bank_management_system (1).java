import java.util.Scanner;
class Bank {
    String name;
    String acc_type;
    private int acc_no;
    private double balance;


    public Bank(String n, String at, int acc, double b) {
        this.name = n;
        this.acc_type = at;
        this.acc_no = acc;
        this.balance = b;
    }
    public void setAcc_no(int ac) {
        this.acc_no = ac;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setBalance(double bal){
        this.balance=bal;

    }
    public double getBalance(){
        return balance;
    }
    public void display(){
        System.out.println("The name is:" + name);
        System.out.println("The account type is:" + acc_type);
        System.out.println("The account number is:"+ getAcc_no());
        System.out.println("The balance is:"+ getBalance());

    }
    public void deposit(double d){
        balance+=d;
        System.out.println("The deposited amount is:" +d);
        System.out.println("Total balance after deposit is:" + balance);

    }
    public void withdraw(double w){
        if(balance >= w){
            balance-=w;
            System.out.println("The withdrawn amount is:" + w);
            System.out.println("The total balance after withdrawal" + balance);
        }
        else{
            System.out.println("Insufficient Bank balance!");
        }
    }
}
public class Bank_management_system{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of accounts:");
        int n=s.nextInt();
        Bank [] bank=new Bank[n];

        for (int i=0; i<n; i++){
            System.out.println("Enter details of customers:");

            System.out.println("Enter the name:");
            String w=s.next();

            System.out.println("Enter the account type:");
            String a=s.next();

            System.out.println("Enter account number:");
            int an=s.nextInt();

            System.out.println("Enter the balance:");
            double b= s.nextDouble();

            bank[i]=new Bank(w,a,an,b);
            bank[i].display();

            System.out.println("Enter the amount you want to deposit:");
            double depositAmt = s.nextDouble();
            bank[i].deposit(depositAmt);

            System.out.println("Enter the amount you want to withdraw:");
            double withdrawAmt = s.nextDouble();
            bank[i].withdraw(withdrawAmt);


        }


    }
}


