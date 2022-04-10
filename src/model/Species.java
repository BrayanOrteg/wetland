package model;
public class Species {


	/**
    *  this var saves the name of the animal
    * */
	private String name;

	/**
    *  this var saves the scientific name of the animal
    * */
	private String scientificName;
	/**
    *  this var saves if the animal is migratory or no 
    * */
	private boolean migratory;
	/**
    *  this var saves the type of animal
    * */
	private TYPESPECIE type;

	/**
	 * this var save the wetland of the specie 
	 * */

	private Wetland [] wetlanSpecie;

	 /**
	  * Var for the size of the array
	  * */

	private static final int MAXWET = 80;

	/**
	* Description: This is the method constructor for Species
	* @param name <String>, must be initialized
	* @param scientificName <String>, must be initialized
	* @param migratory <boolean>, must be initialized
	* @param type <typeSpecie>, must be initialized
	*/

	public Species (String name, String scientificName, boolean migratory, TYPESPECIE type){

		this.name=name;
		this.scientificName=scientificName;
		this.migratory=migratory;
		this.type=type;

		wetlanSpecie=new Wetland[MAXWET];
	}


	/**
    * Description: This method is the toString of the class for print the values
    * @return <String>, 
    */

	public String toString(){
		return(name+"\n"+scientificName+"\n"+migratory+"\n"+type);
	}



	public String getName() {
		return name;
	}

	public String getScientificName() {
		return scientificName;
	}

	public Boolean getMigratory() {
		return migratory;
	}


	/**
	 * 
	 * @param migratory
	 */
	public void setMigratory(Boolean migratory) {
		this.migratory = migratory;
	}



	public TYPESPECIE getType() {
		return type;
	}


	public int firstNullSpace(){
	 	boolean emptyPosition= false;
	 	int position= -1;
	 	for(int i=0; i<MAXWET && !emptyPosition; i++){
	 		if(wetlanSpecie[i]==null){
	 			emptyPosition= true;
	 			position= i;
	 		}

	 	}
	 	return position;
	 }


	public void addWetlandToSpecie(String name, String ubication, TYPEWETLAND type, double area, String urlPic, String protectedArea, String zoneName, String description, double percentage){
		int positionEmpty=firstNullSpace();
		wetlanSpecie[positionEmpty]= new Wetland (name, ubication, type, area, urlPic, protectedArea, zoneName, description, percentage);

	}


	public void printWetlandsSpecie(){
		String printer="";
		for (int i=0; i<MAXWET; i++){
			if(wetlanSpecie[i]!=null){
				printer+=wetlanSpecie[i].getName();

			}
		}
		System.out.println("The wetlands to the specie are: \n"+printer);
	}




}