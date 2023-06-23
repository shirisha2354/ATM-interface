class ATM{
    private double Acc_balance;
    private String Acc_name;
    private  String Acc_add;
    private String Acc_number;
	private int i=0;
	private int j=0;
	private double arr[] = new double[20];
	private String[] array =new  String[20];   
	public ATM(double bal)
    {
        if(bal>0)
        Acc_balance=bal;
    }
    public void setName(String name)
    {
        Acc_name=name;
    }
    public void setAddress(String add)
    {
        Acc_add=add;
    }
    public void setNumber(String number)
    {
        Acc_number=number;
    }
    void credit(double bal)
    {

        Acc_balance=Acc_balance+bal;
		System.out.println("your amount credited successfully");
		array[i]="credited amount:";
		arr[j]=bal;
		this.i++;
		this.j++;
    }
    void debit(double bal)
    {
        if(bal>Acc_balance)
        System.out.println("Debit amount exceeded account balance");
        else
        Acc_balance=Acc_balance-bal;
		System.out.println("amount debited succesfully");
		array[i]="debited amount:";
		arr[j]=bal;
		this.i++;
		this.j++;
    }
     double getBalance()
    {
        return Acc_balance;
    }
	void transactionHistory()
	{
		System.out.println("Transaction History:");
		int k=0;
		for(k=0;k<i;k++)
		{
			System.out.println(array[k]+arr[k]);
		}
	}
	void transfer(int a,double b)
	{
		this.debit(b);
		System.out.println("transaction successfull");
	}
}