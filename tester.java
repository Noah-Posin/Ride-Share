public class tester {
   public static void main(String[] args) {
// final variables for num cars, num staiosn, num passengers, createn new road with no params

final int NUMCARS = 20;
final int NUMSTATIONS=32;
final int NUMPASSENGERS = 5;
//call road. build cars and stations
road r = new road();
r.buildCars(NUMCARS);
r.buildStations(NUMPASSENGERS,NUMSTATIONS);

// loop trhough number of statsion and print r each time then call move
   for(int i = 1;i < NUMSTATIONS;i++){
System.out.println("RUN: " + i);
System.out.println("----------");
System.out.println(r);
r.moveCar();

   }


}
    

}
   
    
