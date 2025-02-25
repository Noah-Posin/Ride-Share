import java.util.*;
public class station {
    
private ArrayList<person> waitingleft;
private ArrayList<person> waitingright;

private ArrayList<person> arrived;
private int stationnum;
private int numgen = 0;

private station(){
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

}


