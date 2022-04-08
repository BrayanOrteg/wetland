package model;
public class Wetland {

/**
    *  this var saves the name of the wetland
    * */
	private String name;

	/**
    *  this var saves the ubication of the wetland
    * */
	private String ubication;
	/**
    *  this var saves the type of wetland
    * */
	private String type;
		/**
    *  this var saves the area of the wetland
    * */
	private double area;
		/**
    *  this var saves the url of pic of the wetland
    * */
	private String urlPic;
		/**
    *  this var saves the state of the wetland
    * */
	private String protectedArea;
		/**
    *  this var saves the name of the neighborhood for the wetland
    * */
	private String neighborhoodName;
		/**
    *  this var saves the name of the villege for the wetland
    * */
	private String villegeName;


	/**
	* Description: This is the method constructor for Wetland
	* @param name <String>, must be initialized
	* @param ubication <String>, must be initialized
	* @param type <String>, must be initialized
	* @param area <double>, must be initialized and area>0
	* @param urlPic <String>, must be initialized
	* @param protectedArea <double>, must be initialized and protectedArea !=empty
	* @param neighborhoodName <String>, must be initialized and neighborhoodName !=empty
	* @param villegeName <String>, must be initialized and villegeName !=empty
	*/

	public Wetland(String name, String ubication, String type, double area, String urlPic, String protectedArea, String neighborhoodName, String villegeName){
		
	this.name=name;
	this.ubication=ubication;
	this.type=type;
	this.area=area;
	this.urlPic=urlPic;
	this.protectedArea=protectedArea;
	this.neighborhoodName=neighborhoodName;
	this.villegeName=villegeName;

	}

	/**
    * Description: This method is the toString of the class for print the values
    * @return <String>, 
    */
	public String toString(){
	return (name+"\n"+ubication+"\n"+type+"\n"+area+"\n"+urlPic+"\n"+protectedArea+"\n"+neighborhoodName+"\n"+villegeName);
	}


	public String getName() {
		return name;
	}

	public String getUbication() {
		return ubication;
	}

	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	public double getArea() {
		return area;
	}

	public String getUrlPic() {
		return urlPic;
	}

	/**
	 * 
	 * @param urlPic
	 */
	public void setUrlPic(String urlPic) {
		this.urlPic = urlPic;
	}

	public String getProtectedArea() {
		return protectedArea;
	}

	/**
	 * 
	 * @param protectedArea
	 */
	public void setProtectedArea(String protectedArea) {
		this.protectedArea = protectedArea;
	}

	public String getNeighborhoodName() {
		return neighborhoodName;
	}

	public String getVillegeName() {
		return villegeName;
	}


	/**
    * Description: This method calculed the amount of maintenances did it in the wetland
    */

	public void calculedTheAmountOfMaintenance() {
		
	}

}