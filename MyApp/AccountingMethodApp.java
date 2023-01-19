
public class AccountingMethodApp {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		
		valueOfSupply=10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		print();

	}

	private static void print() {
		System.out.println("Value of supply: "+valueOfSupply);
		System.out.println("VAT: "+getVAT());
		System.out.println("Total: "+getTotal());
		System.out.println("Expense: "+getExpense());
		System.out.println("Income: "+getIncome());
		System.out.println("Dividend 1: "+getDividend1());
		System.out.println("Dividend 2: "+getDividend2());
		System.out.println("Dividend 3: "+getDividend3());
	}

	private static double getDividend1() {
		double dividend1 = getIncome()*0.5;
		return dividend1;
	}
	
	private static double getDividend2() {
		double dividend1 = getIncome()*0.3;
		return dividend1;
	}
	
	private static double getDividend3() {
		double dividend1 = getIncome()*0.2;
		return dividend1;
	}

	private static double getIncome() {
		double income = valueOfSupply-getExpense();
		return income;
	}

	private static double getExpense() {
		double expense = valueOfSupply*expenseRate;
		return expense;
	}

	private static double getTotal() {
		double total = valueOfSupply+getVAT();
		return total;
	}

	private static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
