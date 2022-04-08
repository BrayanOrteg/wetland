package model;
public class Dagma {
	private String name;
	public static final int MAXNUM = 20;
	private Wetland [] wetland;

	/**
    * Description: This method print the species of the wetland
    */

	public void wetlandsOfSpecies() {

	}

	/**
    * Description: This method calculed and print the wetland with the less flora
    */
	public void lessFloraSpeciesWetland() {

	}


	/**
    * Description: This method calculed and print the wetland with more animales in there
    */
	public void WetlandWithMoreAnimals() {

	}

	/**
    * Description: This method print all the information of the wetland
    */

	public void DisplayWetlandInformation() {

	}

	public int firstNullSpace(){
	 	boolean emptyPosition= false;
	 	int position= -1;
	 	for(int i=0; i<MAXNUM && !emptyPosition; i++){
	 		if(wetland[i]==null){
	 			emptyPosition= true;
	 			position= i;
	 		}

	 	}
	 	return position;
	 }

	public boolean hasSpace(){

	 	boolean emptyPosition= false;
	 	for (int i=0; i<MAXNUM && !emptyPosition; i++){

	 		if(wetland[i] ==null){
	 			emptyPosition= true;
	 		}
	 	}
	 	return emptyPosition;
	}

	public void addWetland(String name, String ubication, String type, double area, String urlPic, String protectedArea, String neighborhoodName, String villegeName){
		int emptyPositions=firstNullSpace();
		wetland[emptyPositions]= new Wetland(name,ubication,type,area,urlPic,protectedArea,neighborhoodName,villegeName);
	}

	/**
    * Description: This method constructor of dagma 
    */
	public Dagma(String name) {
	this.name=name;
	wetland= new Wetland [MAXNUM];
	}

}