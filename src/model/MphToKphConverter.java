/**
 * @author Daniel De Lima - dcdelima
 * CIS 175 - Spring 2021
 * Feb 18, 2021
 */
package model;


public class MphToKphConverter {

	//represents the user input for MPH
	private double userInputMph;
	
	//represents the KPH data the user will get after conversion
	private double kilometers;



	public MphToKphConverter() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MphToKphConverter(double userInputKm) {
		super();
		this.userInputMph = userInputKm;
		convertMphToKph(userInputKm);
	}


	//Getters and Setters
	public double getUserInputMph() {
		return userInputMph;
	}



	public void setUserInputMph(double userInputKm) {
		this.userInputMph = userInputKm;
	}



	public double getKilometers() {
		return kilometers;
	}



	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}


	@Override
	public String toString() {
		return "MphToKphConverter [userInputMph=" + userInputMph + ", kilometers=" + kilometers + "]";
	}


	/**
	 * This method converts Miles per hour to Kilometers per hour
	 * @param userInputKph represents the user input
	 */
	private void convertMphToKph(double userInputMph) {
		final double TO_KPH_UNIT = 1.609344;
		this.kilometers = userInputMph * TO_KPH_UNIT;
	}

}
