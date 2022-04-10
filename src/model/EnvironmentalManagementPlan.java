package model;
public class EnvironmentalManagementPlan {


	/**
    *  this var saves the percentage of the Environment plan
    * */
	private double percentage;

	/**
    *  this var saves the description of the Environment plan
    * */
	private String description;
	

	/**
	* Description: This is the method constructor for Wetland
	* @param percentage <double>, must be initialized and percentage>0
	* @param description <String>, must be initialized
	*/

	public EnvironmentalManagementPlan(String description, double percentage) {
		
		this.percentage=percentage;
		this.description=description;

	}


	/**
    * Description: This method is the toString of the class for print the values
    * @return <String>, 
    */

	public String toString(){
		return ("\n"+"Percentage: "+percentage+"\n"+"Description: "+description);

	}



	public Double getPercentage() {
		return percentage;
	}

	/**
	 * 
	 * @param percentage
	 */
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}