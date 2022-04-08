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

         break;
   
      case 3:

         break;

      case 4:
         System.out.println(wetlandCall);

         break;
      
      default:
         System.out.println("Error, opción no válida");
      
      }
   }


   public void createWetland(){
      String wName, wUbication, wType, wUrlPic, wProtectedArea, wNeighborhoodName, wVillegeName;
      double  wArea;
      System.out.println("Create a wetland");
      System.out.println("Insert the name of the wetland");
      wName=scan.next();
         scan.nextLine();

      System.out.println("");
      System.out.println("Insert the ubication of the wetland");
      wUbication=scan.next();
         scan.nextLine();

      System.out.println("");
      System.out.println("Insert the type of the wetland");
      wType=scan.next();
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
      System.out.println("Insert the name of the neighborhood for the wetland if its in a neighborhood");
      wNeighborhoodName=scan.next();
         scan.nextLine();

      System.out.println("");
      System.out.println("Insert the name of the neighborhood for the wetland if its in a village");
      wVillegeName=scan.next();
         scan.nextLine();

      wetlandCall.addWetland(wName, wUbication, wType, wArea, wUrlPic, wProtectedArea, wNeighborhoodName, wVillegeName);
   }

       public int showMenu() {
      int option=0;

      System.out.println(
            "Select a option to start\n" +
            "(1) to register a wetland\n" +
            "(2) to register a specie in a wetland\n"+
            "(3) to register a event in a wetland\n"+
            "(4) Para mostrar las figuras\n" +  
            "(0) Para salir"
            );
      option= scan.nextInt();
      scan.nextLine();
      return option;
      }
}