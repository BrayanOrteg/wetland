package model;
public class Dagma {
	private String name;
	public static final int MAXNUM = 80;
	public static final int MAXNUMSPECIES = 100;
	private Wetland [] wetland;
	private Species [] species;
	private Event [] event;
	private int counterFauna;
	private int counterFlora;

	/**
    * Description: This method print the species of the wetland
    */



	/**
    * Description: This method calculed and print the wetland with the less flora
    */



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

	/**
	 * Method to find a null space in the array of wetland
	 * */

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

	 /**
	  * Method to add a wetland to the system
	  * */

	public void addWetland(String name, String ubication, int typew, double area, String urlPic, String protectedArea, String zoneName, String description, double percentage){
		int emptyPositions=firstNullSpace();

		TYPEWETLAND type=null;

		switch(typew){
		case 1: 
			type= TYPEWETLAND.PUBLICO;

			break;

		case 2:
			type= TYPEWETLAND.PRIVADO;

			break;

		}

		wetland[emptyPositions]= new Wetland(name,ubication,type,area,urlPic,protectedArea,zoneName, description, percentage);
		wetland[emptyPositions].setPlan(description, percentage);


	}

	/**
	 * Method to find a null space in the array of specie 
	 * */

	public int firstNullSpaceSpecies(){
	 	boolean emptyPosition= false;
	 	int positionSpecie= -1;
	 	for(int i=0; i<MAXNUMSPECIES && !emptyPosition; i++){
	 		if(species[i]==null){
	 			emptyPosition= true;
	 			positionSpecie= i;
	 		}

	 	}
	 	return positionSpecie;
	 }


	/**
	 * Method to addSpecie to the system
	 * */
	public void addSpecie(String name, String scientificName, boolean migratory, int numType){
		

		TYPESPECIE type=null;

		switch(numType){
		case 1:
			type= TYPESPECIE.BIRD;
			break;

		case 2:
			type= TYPESPECIE.AQUATIC;
			break;

		case 3:
			type= TYPESPECIE.AQUATIC_FLORA;
			break;

		case 4:
			type= TYPESPECIE.TERRESTIAL_FLORA;
			break;
		case 5: 
			type= TYPESPECIE.MAMMAL;
		}


		int emptyPositions=firstNullSpaceSpecies();
		species[emptyPositions]= new Species(name,scientificName,migratory,type);

	}

	/**
	 * Method to add a specific specie to a specific wetland
	 * */
	public void addSpecieToWetland(String nameSpecie, String nameWetland){

		//inicalized variables
		int positionSpecie= -1;
		int positionWetland= -1;
		String name, scientificName, nameWet, ubicationWet, urlPicWet, protectedAreaWet, zoneName, description;
		double areaWet, percentage;
		boolean migratory;
		TYPESPECIE type;
	

		//for to find the name of the wetland in the array of the wetland in the system
		for(int i=0; i<MAXNUM; i++){
			if(wetland[i]!=null && wetland[i].getName().equals(nameWetland) ){
				positionWetland=i;
			}
		}

		if(positionWetland==-1){
				System.out.println("Wetland not found");
		}



		//Find the name of the specie in the array of specie in the system
		for (int i=0; i<MAXNUMSPECIES; i++){
			if(species[i]!=null && species[i].getName().equals(nameSpecie)){
				positionSpecie=i;
			}
		}

		if(positionSpecie==-1){
			System.out.println("Species not found");
		}

		//add the information
		if (positionSpecie!=-1 && positionWetland!=-1){

				//add specie to wetland
				name = species[positionSpecie].getName();
				scientificName = species [positionSpecie].getScientificName();
				migratory = species[positionSpecie].getMigratory();
				type = species[positionSpecie].getType();

				wetland[positionWetland].addSpeciesWetland(name,scientificName,migratory,type);

				//add wetland to specie

				TYPEWETLAND typeWet=null;

				nameWet= wetland[positionWetland].getName();
				ubicationWet= wetland[positionWetland].getUbication();
				typeWet=wetland[positionWetland].getType();
				areaWet=wetland[positionWetland].getArea();
				urlPicWet=wetland[positionWetland].getUrlPic();
				protectedAreaWet=wetland[positionWetland].getProtectedArea();
				zoneName=wetland[positionWetland].getZoneName();
				description=wetland[positionWetland].getDescription();
				percentage=wetland[positionWetland].getPercentage();

				species[positionSpecie].addWetlandToSpecie(nameWet, ubicationWet, typeWet, areaWet, urlPicWet, protectedAreaWet, zoneName, description, percentage);
		}
	}


	public void wetlandWithLessFlora(){
		String printer="";
		int wetlandNumber=-1;
		int numFlora=-1;

		for(int i=0; i<MAXNUM;i++){

			if (wetland [i]!=null){
				if(wetland[i].countFlora()<numFlora || numFlora==-1){
					numFlora= wetland[i].countFlora();
					wetlandNumber=i;
					printer="The wetland with less flora is "+ wetland[i].getName()+" with a number a flora: "+wetland[i].countFlora()+" Species";	
				}
			}
			
		}

		System.out.println(printer);
	}


	public void wetlandWithMoreFauna(){
		String printer="";
		int wetlandNumber=-1;
		int numFauna=-1;

		for(int i=0; i<MAXNUM;i++){

			if(wetland [i]!=null && wetland[i].counterFauna()>numFauna){
				numFauna= wetland[i].countFlora();
				wetlandNumber=i;
				printer="The wetland with more fauna is "+ wetland[i].getName()+" with a number a fauna: "+wetland[i].counterFauna()+" Species";
			}
			
		}

		System.out.println(printer);
	}

	/**
	 * Method to print all the wetlands
	 * */
	public void printTheWetlands(){
		System.out.println("The wetlands are: "+"\n");
		for (int i=0; i<MAXNUM;i++){
			if(wetland[i]!=null){
				System.out.println(i+"- "+wetland[i].getName());

			}
		}
	}

	/**
	 * Method to print all the species
	 * */ 
	public void printTheSpecies(){
		System.out.println("");
		System.out.println("The Species are: "+"\n");
		for (int i=0; i<MAXNUMSPECIES;i++){
			if(species[i]!=null){
				System.out.println(i+"- "+species[i].getName());

			}
		}
	}

	public int firstNullSpaceEvent(){
	 	boolean emptyPosition= false;
	 	int positionEvent= -1;
	 	for(int i=0; i<MAXNUM && !emptyPosition; i++){
	 		if(event[i]==null){
	 			emptyPosition= true;
	 			positionEvent= i;
	 		}

	 	}
	 	return positionEvent;
	 }

	public void addEvent(String type, String description, String client, int day, int month, int year, String wetlandName){
		
		int postitionEvent=firstNullSpaceEvent();
		int positionWetland=-1;
		int counter=0;
		double price=0;

		Date date=new Date(day,month,year);
		event[postitionEvent]= new Event(type,description, price, client, date);


		//for to find the name of the wetland in the array of the wetland in the system
		for(int i=0; i<MAXNUM; i++){
			if(wetland[i]!=null && wetland[i].getName().equals(wetlandName) ){
				positionWetland=i;
			}
		}

		if(positionWetland==-1){
				System.out.println("Wetland not found");
		}

		if (type.equals("maintenance")) {
			counter++;
		}


      if(type.equals("maintenance") || type.equals("school_visits") ){
         price=200;
      }else{
         price=300;
      }


		wetland[positionWetland].addEventWetland(type,description, price, client, date);
		wetland[positionWetland].countMaintenance(counter);
	}

	public void consultNumMaintenance(String nameWetland){
	
		int positionWetland=-1;
		int num=0;

		//for to find the name of the wetland in the array of the wetland in the system
		for(int i=0; i<MAXNUM; i++){
			if(wetland[i]!=null && wetland[i].getName().equals(nameWetland) ){
				positionWetland=i;
			}
		}

		if(positionWetland==-1){
				System.out.println("Wetland not found");
		}	


		num=wetland[positionWetland].getCounterMaintenance();

		System.out.println("The num of maintenances is: "+num);

	}


	public void wetlandsOfSpecie(String name){

	int positionSpecie=-1;
	for (int i=0; i<MAXNUMSPECIES; i++){
		if(species[i]!=null && species[i].getName().equals(name)){
			positionSpecie=i;
		}
	}

	if(positionSpecie==-1){
		System.out.println("Species not found");
	}

	species[positionSpecie].printWetlandsSpecie();
		

	}

	public void printAllTheWetland(){
		String printer="";
		for(int i=0; i<MAXNUM;i++){
			if (wetland[i]!=null) {
				printer+=wetland[i].toString();
				
			}

		}
		System.out.println("The wetlands are: \n"+printer);
	}





	/**
    * Description: This method constructor of dagma 
    */
	public Dagma(String name) {
	this.name=name;
	wetland= new Wetland [MAXNUM];
	species= new Species [MAXNUMSPECIES];
	event= new Event [MAXNUM];
	counterFauna=0;
	counterFlora=0;
	}

}