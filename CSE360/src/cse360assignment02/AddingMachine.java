package cse360assignment02;



public class AddingMachine {
	private int total;
	private StringBuffer calculate = new StringBuffer("0");
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		  total = total + value;
		  calculate.append(" + " + value); //adds and prints
	  }

	  public void subtract (int value) {
		  total = total - value;
		  calculate.append(" - " + value); //subtracts and prints
	  }

	  public String toString () {
	    return calculate.toString(); //returns the string
	  }

	  public void clear() {
	  }
	  public static void main(String[] args)  
	  { //to check if program works
	  	AddingMachine trial = new AddingMachine();
	  	trial.add(4);
	  	trial.subtract(2);
	  	trial.add(5); 
	  	System.out.println(trial.toString());
	}

}

 