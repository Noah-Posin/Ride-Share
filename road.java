import java.util.ArrayList;

public class road {
private station[] stations;
private ArrayList<car> cars;

public road(){

    cars=new ArrayList<car>();
    stations = new station[32];
    for(int i = 1;i<stations.length; i++){
        stations[i]= new station();
    }

}
public void buildStations(int numppl){
for( int i = 1;i<numppl; i++){
    int start = (int)(Math.random()*numppl);
    int stop = (int)(Math.random()*numppl);
    stations[start].addPerson(new person(stop,start));
}
}
public void buildCars(int numcars){
for( int i = 1;i<numcars; i++){
    int start = (int)(Math.random()*numcars);
    int stop = (int)(Math.random()*numcars);
    cars.add(new car(stop,start));

}
}

public void moveCar(){
    for(car c : cars){
        c.unload();
        int a =car.getLocation
    }
    

}


public String toString(){

    String s ="";
    for(station st : stations){
        s += st.toString();
    }
    s+="Cars:\n";
    for( car c : cars){
        s+= c.toString();
        s+="\n";
    }
    return s;
}
}



