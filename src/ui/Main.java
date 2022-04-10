package ui;
import model.Dagma;
import java.util.Scanner;

/** Main Class - Development of the problem
 * @author BrayanOrtega
 * 
 * */

public class Main{


   private Dagma wetlandCall;
   private Scanner scan;
   
   /**
    * Description: The constructor of the class
    * */
   public Main() {
      wetlandCall= new Dagma("ajja");
      scan= new Scanner(System.in);
   }

    public static void main (String [] args) {


      System.out.println("Iniciando la aplicación");
      
      Main principal= new Main();
      
      int option=0;
      
      do{
         option= principal.showMenu();
         principal.executeOperation(option);
         
      }while (option!=0);
      
   }


   
   /**
    * Description: Method to do a instruction of the user
    * @param operation <int>
    * */
   public void executeOperation(int operation) {
      
      switch(operation) {
      case 0:
         System.out.println("Bye!");
         break;
      case 1:
      createWetland();
         break;
      case 2:
         createSpecie();

         break;
   
      case 3:
         registerSpecieInWetland();

         break;

      case 4:
         registerEvent();

         break;
      case 5:
         consultNumMaintenanceInWetland();


         break;

      case 6: 
         wetlandWithLessFloraConsult();

         break;

      case 7:

         wetlandsSpecies();

         break;
      case 8:

         printAllWetland();

      break;
   case 9:

      wetlandMoreFauna();

      break;
      
      default:
         System.out.println("Error, option no valid");
      
      }
   }


   /**
    * Description: method to order the inputs of the wetland
    * */

   public void createWetland(){
      String wName, wUbication, wUrlPic, wProtectedArea, zoneNameW, descriptionW;
      double  wArea, percentageW;
      int wType;
      System.out.println("Create a wetland");
      System.out.println("Insert the name of the wetland");
      wName=scan.next();
         scan.nextLine();

      System.out.println("");
      System.out.println("Insert the ubication of the wetland");
      wUbication=scan.next();
         scan.nextLine();

      System.out.println("");
      System.out.println("Insert the type of the wetland\n"+"(1)Public\n"+"(2)Private");
      wType=scan.nextInt();
         scan.nextLine();   

      System.out.println("");
      System.out.println("Insert the area of the wetland");
      wArea=scan.nextDouble(); 
         scan.nextLine();

      System.out.println("");
      System.out.println("Insert the pic");
      wUrlPic=scan.next();
         scan.nextLine();

      System.out.println("");
      System.out.println("The wetland is a protected area?");
      wProtectedArea=scan.next();
         scan.nextLine();


      System.out.println("");
      System.out.println("Insert the name of the zone of the wetland");
      zoneNameW=scan.next();
         scan.nextLine();

      System.out.println("");
      System.out.println("Write the percentage of the enviromental management plan");
      percentageW=scan.nextDouble();
         scan.nextLine();

      System.out.println("");
      System.out.println("Write the description of the enviromental management plan");
      descriptionW=scan.next();
         scan.nextLine();

      wetlandCall.addWetland(wName, wUbication, wType, wArea, wUrlPic, wProtectedArea, zoneNameW, descriptionW, percentageW);
      System.out.println("Register successful");
   }


   /**
    * Description: method to order the inputs of the specie
    * */

   public void createSpecie(){
      String sName, sScientificName;
      boolean sMigratory;
      int check, sType;


      System.out.println("Register a specie");
      System.out.println("Insert the name of the specie");
      sName=scan.next();
         scan.nextLine();

      System.out.println("");
      System.out.println("Insert the Scientific name of the specie");
      sScientificName=scan.next();
         scan.nextLine();

      System.out.println("");
      System.out.println("The specie its migratory, Yes(1) No(0)");
      check=scan.nextInt();
         scan.nextLine();   

      if (check==1){
         sMigratory=true;
      }else{
         sMigratory=false;
      }

      System.out.println("");
      System.out.println("Insert the type of the specie");
      System.out.println(
            "Select a option\n" +
            "(1) BIRD\n" +
            "(2) AQUATIC\n"+
            "(3) AQUATIC FLORA\n"+
            "(4) TERRESTIAL FLORA\n" +
            "(5) MAMMAL"
            );
      sType=scan.nextInt(); 
         scan.nextLine();


      wetlandCall.addSpecie(sName, sScientificName, sMigratory, sType);
      System.out.println("Register successful");
   }

   /**
    * Description: Method to register a specie in a wetland 
    * */
   public void registerSpecieInWetland(){
      String nameWetland,nameSpecie;

      wetlandCall.printTheWetlands();

      System.out.println("Insert the name of the wetland (the name not the number)");
      nameWetland=scan.next();
         scan.nextLine();

      wetlandCall.printTheSpecies();
      
      System.out.println("Insert the name of the specie (the name not the number)");
      nameSpecie=scan.next();
         scan.nextLine();   

         wetlandCall.addSpecieToWetland(nameSpecie,nameWetland);
         System.out.println("Register successful");

   }

   /**
    * Description: Method to order the inputs of the event an register in a wetland
    * */
   public void registerEvent(){

      String type, description,client,wetlandName;
      int day, month, year;
      

      System.out.println("Register a event");
      System.out.println("Insert the name of the wetland to add the event (the name not the number)\n");

      wetlandCall.printTheWetlands();

      wetlandName=scan.next();
         scan.nextLine();

      System.out.println("Insert the type of event  (Without spaces): \n"+"- maintenance\n"+"- school_visits \n"+"- improvement activities\n"+"- celebration");
      type=scan.next();
         scan.nextLine();

      System.out.println("Insert the description of the event");
      description=scan.next();
         scan.nextLine();

      System.out.println("Insert the client name");
      client=scan.next();
         scan.nextLine();

      System.out.println("Insert the day of the the even");
      day=scan.nextInt();
         scan.nextLine();

      System.out.println("Insert the month of the the even");
      month=scan.nextInt();
         scan.nextLine();

      System.out.println("Insert the year of the the even");
      year=scan.nextInt();
         scan.nextLine();


      wetlandCall.addEvent( type,  description,  client,  day,  month,  year,  wetlandName);

   }

   /**
    * Description: Method to ask for the name of the wetland to consult the num of maintenances
    * */
   public void consultNumMaintenanceInWetland(){

      String wetlandName;

      System.out.println("Consult the num of maintenance");
      wetlandCall.printTheWetlands();
      System.out.println("Insert the name of the wetland to consult");
      wetlandName=scan.next();
         scan.nextLine();

      wetlandCall.consultNumMaintenance(wetlandName);

   }

   /**
    * Description: Method to call the method to print the wetland with the less num of flora
    * */

   public void wetlandWithLessFloraConsult(){

      wetlandCall.wetlandWithLessFlora();
   }

   /**
    * Description: Method to order the name of the specie and the wetland to consult the wetlands where is that specie
    * */
   public void wetlandsSpecies(){

      String nameSpecie;
      System.out.println("Consult the wetland for the specie");

      wetlandCall.printTheSpecies();

      System.out.println("Insert the name of the specie");
      nameSpecie=scan.next();
         scan.nextLine();

      wetlandCall.wetlandsOfSpecie(nameSpecie);
   }



   /**
    * Description: Call the method to print wetlands information
    * */
   public void printAllWetland(){
      wetlandCall.printAllTheWetland();
   }


   /**
    * Description: Call the method to print and calculated the wetland with more fauna 
    * */

   public void wetlandMoreFauna(){
      wetlandCall.wetlandWithMoreFauna();
   }


   /**
    * Description: Method of the menu option
    * */
       public int showMenu() {
      int option=0;

      System.out.println(
            "\n"+
            "Select a option to start\n" +
            "(1) to register a wetland\n" +
            "(2) to register a specie\n"+
            "(3) to register a specie in a wetland\n"+
            "(4) to register a event in a wetland\n"+
            "(5) to consult the num of maintenances in a wetland\n" +
            "(6) wetland with less num of flora\n"+  
            "(7) Wetlands of species\n"+
            "(8) Print all the wetlands\n"+
            "(9) wetland with more num of fauna\n"+
            "(0) Para salir"
            );
      option= scan.nextInt();
      scan.nextLine();
      return option;
      }
}