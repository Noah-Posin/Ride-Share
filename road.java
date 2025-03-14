import java.util.ArrayList;

public class road {
private station[] stations;
private ArrayList<car> cars;

public road(int numStations){

    cars=new ArrayList<car>();
    stations = new station[numStations];
    for(int i = 0;i<stations.length; i++){
        stations[i]= new station();
    }

}
public void buildStations(int numppl, int numstations){

    for(int i = 0; i<numppl; i++){
        int start = (int)(Math.random()*numstations);
        int stop = (int)(Math.random()*numstations);
        while(start==stop){
            stop = (int)(Math.random() * numstations);
        }
        person p = new person(stop,start);
        stations[start].addPerson(p);
        
    }
}
public void buildCars(int numcars, int numstations){
    for(int i = 0; i<numcars; i++){
        int start = (int)(Math.random()*numstations);
        int stop = (int)(Math.random()*numstations);
        while(start==stop){
            stop = (int)(Math.random()*numcars);
        }
        car c = new car(stop,start);
        
        cars.add(c);
    }
}

public int getStationIndex(int num){
    for(int i = 0;i<stations.length; i++){
        if(stations[i].getNum() == num){
            return i;
        }
    }
        return 0;
    }
    public void moveCars(){ 
        for (car c : cars) {
            person p = null; 
            if (c.room() > 0) {
                p = c.unload(); 
            }
            
            station x = stations[getStationIndex(c.getLocation())];
            if (p != null) {
                x.addArrived(p);
                
            }
                
                if(c.getDirection()==true){
                    if(c.hasRoom()==true){
                        person t = x.nextRight();
                        if(t!= null){
                            c.addPassenger(t);
                        }
                    }
                }
                else{
                    if(c.hasRoom()==true){
                        person s = x.nextLeft();
                        if(s != null){
                            c.addPassenger(s);
                        }
                    }
                }
            
            c.move();
        }
    }
        
public String toString(){

    String s ="";
    for(station st : stations){
        s += st.toString();
    }
    s+="Cars:\n\n";
    for( car c : cars){
        s+= c.toString();
        s+="\n\n";
    }
    return s;
}
public double percentarrived(){
    int total = 0;
    for( station sc : stations){
        total+=sc.getArrived();
    }
    return((total/50.0)*100.0);
}
}



