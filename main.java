package day3exerciseswithsir;

public class Main {
	public static void main(String[] args)
	{
      payvoice invoice  = new payvoice("1", "Laptop", 1, 1000000.0);
  //    payvoice invoice1  = new payvoice("2", "mobile", 5, 10000.0);
     // for( temp : payvoice){
         	String temp=invoice.toString();
           	System.out.println(temp);
	}
}
