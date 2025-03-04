import java.util.*;
public class station {
    
private ArrayList<person> waitingleft;
private ArrayList<person> waitingright;

private ArrayList<person> arrived;
private int stationnum;
private int numgen = 1;

public station(){
    stationnum = numgen;
        numgen++;
        waitingleft = new ArrayList<person>();
        waitingright = new ArrayList<person>();
        arrived=  new ArrayList<person>();
    
}
public void addPerson(person p){
    if(p.getDestination()==stationnum){
        arrived.add(p);
    }
    else if(p.getDirection()){
        waitingright.add(p);
    }else{
        waitingleft.add(p);
    }
}
public String toString(){
    return super.toString() + " Station num: "+ stationnum+" Arrived: "+arrived+" Passengers going right: "+waitingright+ " Passnger waiting left: "+waitingleft;
}
}


