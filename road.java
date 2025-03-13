import java.util.ArrayList;

public class road {
private station[] stations;
private ArrayList<car> cars;

public road(){

    cars=new ArrayList<car>();
    stations = new station[32];
    for(int i = 0;i<stations.length; i++){
        stations[i]= new station();
    }

}
public void buildStations(int numppl, int numstations){

    for( int i = 1;i<numppl; i++){
    int start = (int)(Math.random()*numstations);
    int stop = (int)(Math.random()*numstations);
    if(start==stop){
        stop = (int)(Math.random()*numstations);
    }
    stations[start].addPerson(new person(stop,start));
}
}
public void buildCars(int numcars, int numstations){
for( int i = 1;i<numcars; i++){
    int start = (int)(Math.random()*numstations);
    int stop = (int)(Math.random()*numstations);
    // if(start==stop){
    //     stop = (int)(Math.random()*numcars);
    // }
    cars.add(new car(stop,start));
    }
}
public 

public void moveCar(){
    for(car c : cars){ 
        person p = c.unload();
        
       
       
        int a =c.getLocation();
        for( station x : stations){
            
            int r=x.getNum();
            if(a==r){
                x.addPerson(p);
               if(c.getDirection()==true){
               if(c.hasRoom()==true){
                person t = x.nextRight();
                if(t!= null){
                c.addPassenger(t);
                }
               }
            }
               }else{
                if(c.hasRoom()==true){
                person s = x.nextLeft();
                if(s != null){
                c.addPassenger(s);
                             }

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
    for( car c : cars){
        total+=c.totalpeoplearrived();
    }
    return((total/50.0)*100.0);
}
}



