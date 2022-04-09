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
      
      default:
         System.out.println("Error, option no valid");
      
      }
   }


   /**
    * method to order the inputs of the wetland
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
    * method to order the inputs of the specie
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
            "(1) Fauna terrestre\n" +
            "(2) Fauna acuatica\n"+
            "(3) Flora terrestre\n"+
            "(4) Flora acuatica\n" 
            );
      sType=scan.nextInt(); 
         scan.nextLine();


      wetlandCall.addSpecie(sName, sScientificName, sMigratory, sType);
      System.out.println("Register successful");
   }


   public void registerSpecieInWetland(){
      String nameWetland,nameSpecie;

      wetlandCall.printTheWetlands();

      System.out.println("Insert the name of the wetland");
      nameWetland=scan.next();
         scan.nextLine();

      wetlandCall.printTheSpecies();
      
      System.out.println("Insert the name of the specie");
      nameSpecie=scan.next();
         scan.nextLine();   

         wetlandCall.addSpecieToWetland(nameSpecie,nameWetland);
         System.out.println("Register successful");

   }


   public void registerEvent(){

      String type, description,client,wetlandName;
      int day, month, year;
      

      System.out.println("Register a event");
      System.out.println("Insert the name of the wetland to add the event\n");

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


   public void consultNumMaintenanceInWetland(){

      String wetlandName;

      System.out.println("Consult the num of maintenance");
      wetlandCall.printTheWetlands();
      System.out.println("Insert the name of the wetland to consult");
      wetlandName=scan.next();
         scan.nextLine();

      wetlandCall.consultNumMaintenance(wetlandName);

   }


       public int showMenu() {
      int option=0;

      System.out.println(
            "Select a option to start\n" +
            "(1) to register a wetland\n" +
            "(2) to register a specie\n"+
            "(3) to register a specie in a wetland\n"+
            "(4) to register a event in a wetland\n"+
            "(5) to consult the num of maintenances in a wetland\n" +  
            "(0) Para salir"
            );
      option= scan.nextInt();
      scan.nextLine();
      return option;
      }
}