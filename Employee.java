package day3exerciseswithsir;

abstract public class EmployeeRecord {
	abstract class Employee implements Payable {
		private int rate;
		public Employee()
		{
		}
		public abstract int getSalary();
		public void setRate(int rate)
		{
			this.rate=rate;
		}
		public int getRate()
		{
			return rate;
		}
	}

}
