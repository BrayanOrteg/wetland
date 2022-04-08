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
	private String type;

	/**
	* Description: This is the method constructor for Species
	* @param name <String>, must be initialized
	* @param scientificName <String>, must be initialized
	* @param migratory <boolean>, must be initialized
	* @param type <String>, must be initialized
	*/

	public Species (String name, String scientificName, boolean migratory, String type ){

		this.name=name;
		this.scientificName=scientificName;
		this.migratory=migratory;
		this.type=type;

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



	public String getType() {
		return type;
	}

}