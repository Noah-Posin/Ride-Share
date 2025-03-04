import java.util.*;
public class car {
    private int destination;
    private int location;
    private boolean direction;
    private ArrayList<person> passengers;

    public car(int mdestination, int mylocation){
        destination=mdestination;
        location=mylocation;
        direction = destination>location;
        passengers = new ArrayList<person>();
    }

    public String toString(){
        return super.toString() + "start: " + location + 
        ", Destination: " + destination + ", Going right? "+direction+ ", Passengers: "+passengers;
    }
    public void addPassenger(person p){
        if(passengers.size()>= 3){
            System.out.println("Error, car full");
         } else if(p.getDirection()!=direction){
            System.out.println("ERROR, trying to go the wrong direction");
        
        }else{
        passengers.add(p);  
        }  
    }
        public boolean hasRoom(){
        return passengers.size()< 3;
        }       
/** method for desciding if a person in the car is elligible to be dropped off*/
    public person unload(){
        for (int i = 0;i<passengers.size();i++){
            person a = passengers.get(i);
            if(a.getDestination()==location){
                return passengers.remove(i);
            }
        }
        return null;
    }
    public void move(){
        if(location==destination){
            return;
        }
        if(direction){
            location++;
        }else{
            location--;
        }
    }
    public int getLocation(){
        return location;
    }
    }


