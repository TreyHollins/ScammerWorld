/*
 * Davd Hollins
 * 2/25/2020
 */
package people;

public class Victim implements Comparable<Victim> {
	private String name;
	private double amountScammed;
	
	public Victim (String name, double amountScammed) {
		this.name = name;
		this.amountScammed = amountScammed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmountScammed() {
		return amountScammed;
	}
	public void setAmountScammed(double amountScammed) {
		this.amountScammed = amountScammed;
	}
	
	public int compareTo(Victim v) {
		int result = 0;
		System.out.println("Comparing " + this.getName() + " and " + v.getName());
		if (this.getAmountScammed() < v.getAmountScammed()) {
			result = 1;
		} else {
			result = -1;
		}
		return result;
	}
}
