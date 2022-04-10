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
	private TYPEWETLAND type;
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
    *  this var saves the name of the zone for the wetland
    * */
	private String zoneName;

	/**
	 * This var save the enviromentalManagement plan
	 * */
	 private EnvironmentalManagementPlan plan;

	 private String description;

	 private double percentage;

	 public Species [] speciesWetland;

	 public Event [] eventWetland;

	 public final static int MAXSPECIES_WETLAND= 100;

	 private int counterMaintenance;






	/**
	* Description: This is the method constructor for Wetland
	* @param name <String>, must be initialized
	* @param ubication <String>, must be initialized
	* @param type <String>, must be initialized
	* @param area <double>, must be initialized and area>0
	* @param urlPic <String>, must be initialized
	* @param protectedArea <double>, must be initialized and protectedArea !=empty
	* @param zoneName <String>, must be initialized and zoneName !=empty
	*/

	public Wetland(String name, String ubication, TYPEWETLAND type, double area, String urlPic, String protectedArea, String zoneName, String description, double percentage){
		
	this.name=name;
	this.ubication=ubication;
	this.type=type;
	this.area=area;
	this.urlPic=urlPic;
	this.protectedArea=protectedArea;
	this.zoneName=zoneName;
	this.plan=plan;
	this.description=description;
	this.percentage=percentage;

	speciesWetland= new Species [MAXSPECIES_WETLAND];
	eventWetland= new Event[MAXSPECIES_WETLAND];
	counterMaintenance=0;

	}

	/**
    * Description: This method is the toString of the class for print the values
    * @return <String>, 
    */
	public String toString(){
		int numTotalFlora=countFlora();
		int numTotalFauna=counterFauna();

	return ("*** WETLAND INFORMATION ***\n"+"Name: "+name+"\n"+"ubication: "+ubication+"\n"+"Type: "+type+"\n"+"Area: "+area+"\n"+"Pic: "+urlPic+"\n"+"Protected area:"+protectedArea+"\n"+ 
		"Zone name: "+zoneName+"\n"+"Environmental Plan: "+plan+"\n"+"The num of the total flora Species is: "+ numTotalFlora+"\n"+"The num of the total fauna Species is: "+ numTotalFauna+"\n");

	}


	public String getName() {
		return name;
	}

	public String getUbication() {
		return ubication;
	}

	public TYPEWETLAND getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(TYPEWETLAND type) {
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

	public String getZoneName() {
		return zoneName;
	}

	public String getDescription(){
		return description;
	}

	public Double getPercentage(){
		return percentage;

	}

	public void setPlan(String description, double percentage){
		plan= new EnvironmentalManagementPlan (description, percentage);
	}



	/**
	 * Description: Method to find the null space
	 * @return <int>, its the null position
	 * */
	public int firstNullSpace(){
	 	boolean emptyPosition= false;
	 	int position= -1;
	 	for(int i=0; i<MAXSPECIES_WETLAND && !emptyPosition; i++){
	 		if(speciesWetland[i]==null){
	 			emptyPosition= true;
	 			position= i;
	 		}

	 	}
	 	return position;
	 }



	/**
	* Description: This is the method to add the species of the wetland
	* @param name <String>, must be initialized
	* @param scientificName <String>, must be initialized
	* @param migratory <boolean>, must be initialized
	* @param type <TYPESPECIE>, must be initialized
	*/
	public void addSpeciesWetland(String name, String scientificName, boolean migratory, TYPESPECIE typeS){
		int positionEmpty=firstNullSpace();
		speciesWetland[positionEmpty]= new Species (name, scientificName, migratory, typeS);

	}


	/**
	 * Description: Method to find the null space in the array
	 * @return <int>, its the null position
	 * */
	public int firstNullSpaceEvent(){
	 	boolean emptyPosition= false;
	 	int positionEvent= -1;
	 	for(int i=0; i<MAXSPECIES_WETLAND && !emptyPosition; i++){
	 		if(eventWetland[i]==null){
	 			emptyPosition= true;
	 			positionEvent= i;
	 		}

	 	}
	 	return positionEvent;
	 }


	/**
	* Description: This is the method to add a event in the wetland
	* @param type <String>, must be initialized
	* @param description <String>, must be initialized
	* @param price <double>, must be initialized and price !=null
	* @param client <String>, must be initialized
	* @param date <Date>, must be initialized and date !=empty
	*/

	public void addEventWetland(String type, String description, double price, String client, Date date){
		int positionEmpty=firstNullSpaceEvent();
		eventWetland[positionEmpty]= new Event (type, description, price, client, date);
	}


	/**
    * Description: This method calculed the amount of maintenances did it in the wetland
    */

	public void countMaintenance(int numMaintenance){
		counterMaintenance=numMaintenance;
	}

	public int getCounterMaintenance(){
		return counterMaintenance;
	}

	/**
    * Description: This method calculed the amount of flora in the wetland
    * @return <int>, its the num of the total flora in the wetland 
    */
	public int countFlora(){
		int floraNum=0;
		for (int i=0; i<MAXSPECIES_WETLAND; i++){
			if (speciesWetland[i]!=null){
				if(speciesWetland[i].getType().equals(TYPESPECIE.TERRESTIAL_FLORA) || speciesWetland[i].getType().equals(TYPESPECIE.AQUATIC_FLORA)){
					floraNum++;
				}

			}
		}
		return floraNum;
	}


	/**
    * Description: This method calculed the amount of fauna in the wetland
    * @return <int>, its the num of the total fauna in the wetland 
    */

	public int counterFauna(){
		int faunaNum=0;
		for (int i=0; i<MAXSPECIES_WETLAND; i++){
			if (speciesWetland[i]!=null){
				if(speciesWetland[i].getType().equals(TYPESPECIE.BIRD) || speciesWetland[i].getType().equals(TYPESPECIE.AQUATIC) || speciesWetland[i].getType().equals(TYPESPECIE.MAMMAL)){
					faunaNum++;
				}

			}
		}
		return faunaNum;
	}




}