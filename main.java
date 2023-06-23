
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter balance:");
        double b=sc.nextDouble();
            ATM B=new ATM(b);
        System.out.print("enter name:");
        String s=sc.next();
        B.setName(s);
        System.out.print("enter address:");
        String A=sc.next();
        B.setAddress(A);
        System.out.print("enter acc number:");
        String n=sc.next();
        B.setNumber(n);
		int x;
		do{
			System.out.println("choose your option:"+"\n"+"1.Transaction History");
			System.out.println("2.credit:"+"\n"+"3.debit"+"\n"+"4.Check Blance"+"\n"+"5.Transfer"+"\n"+"6.Exit");
			x=sc.nextInt();
			switch(x)
			{
				case 1:
						B.transactionHistory();
						break;
				case 2:
						System.out.print("enter amount to credit:");
						Double c=sc.nextDouble();
						B.credit(c);
						break;
				case 3:
						System.out.print("enter amount to debit:");
						Double d=sc.nextDouble();
						B.debit(d);
						break;
				case 4:
						System.out.println("Balance in your account="+B.getBalance());
						break;
				case 5:
						System.out.print("enter receiver acc_number:");
						int rec_acc_number= sc.nextInt();
						System.out.print("enter amount");
						double amount=sc.nextDouble();
						B.transfer(rec_acc_number,amount);
						break;
				case 6:
						System.exit(0);
				default:
						System.out.print("enter valid option");
						
			}
		}while(x!=6);
	}
}