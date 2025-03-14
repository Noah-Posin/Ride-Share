public class tester {
   
public static void main(String[] args) {
   final int NUMCARS = 20;
   final int NUMSTATIONS=32;
   final int NUMPASSENGERS =50;
   road r = new road(NUMSTATIONS);
   r.buildCars(NUMCARS, NUMSTATIONS);
   r.buildStations(NUMPASSENGERS,NUMSTATIONS);

   for(int i = 0; i < 30; i++){
      System.out.println("RUN: " + i);
      System.out.println("----------");
      System.out.println(r);
      r.moveCars();
   }

   System.out.println("Percentage of people arrived out of 50: " + r.percentarrived());
   }    
}

   
    
