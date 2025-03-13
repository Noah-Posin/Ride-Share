public class tester {
   public static void main(String[] args) {
// final variables for num cars, num staiosn, num passengers, createn new road with no params

final int NUMCARS = 20;
final int NUMSTATIONS=32;
final int NUMPASSENGERS =50;
//call road. build cars and stations
road r = new road();
r.buildCars(NUMCARS, NUMSTATIONS);
r.buildStations(NUMPASSENGERS,NUMSTATIONS);

// loop trhough number of statsion and print r each time then call move
   for(int i = 0;i < NUMSTATIONS+1;i++){
System.out.println("RUN: " + i);
System.out.println("----------");
System.out.println(r);
r.moveCar();

   }

System.out.println("Percentage of people arrived out of 50: " + r.percentarrived());
}
    

}
   
    
