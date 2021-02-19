/**
 * @author Daniel De Lima - dcdelima
 * CIS 175 - Spring 2021
 * Feb 18, 2021
 */
package model;

/**
 * @author Daniel
 *
 */
public class KphToMphConverter {

	//represents the user input for MPH
	private double userInputKph;
	
	//represents the KPH data the user will get after conversion
	private double miles;

	public KphToMphConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KphToMphConverter(double userInputMph) {
		super();
		this.userInputKph = userInputMph;
		convertKphToMph(userInputMph);
	}

	
	//Getters and Setters
	public double getUserInputKph() {
		return userInputKph;
	}

	
	public void setUserInputKph(double userInputMph) {
		this.userInputKph = userInputMph;
	}

	
	public double getMiles() {
		return miles;
	}

	
	public void setMiles(double miles) {
		this.miles = miles;
	}

	
	@Override
	public String toString() {
		return "KphToMphConverter [userInputMph=" + userInputKph + ", miles=" + miles + "]";
	}
	
	
	/**
	 * This method converts Kilometers per hour to Miles per hour
	 * @param userInputKph represents the user input
	 */
	private void convertKphToMph(double userInputKph) {
		
		final double TO_MPH_UNIT = 1.609344;
		this.miles = userInputKph / TO_MPH_UNIT;
	}
	
}
