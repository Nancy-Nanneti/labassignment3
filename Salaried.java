package day3exerciseswithsir;

	public class Salaried extends EmployeeRecord implements IncreaseSalary{
		private int salary;
		public Salaried(int salary) {
			this.salary = salary;
		}
		@Override
		public int getSalary() {
			System.out.println("Salaried employee: ");
			return salary;
		}
		@Override
		public int increasedSalary() {
			return 5;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Salaried:");
			builder.append(salary);
			return builder.toString();
		}
		@Override
		public double getPayment() {
			System.out.println(this.toString());
			return salary;
		}
}
