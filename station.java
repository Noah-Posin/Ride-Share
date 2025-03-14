import java.util.*;
public class station {
    
    private ArrayList<person> waitingleft;
    private ArrayList<person> waitingright;
    private ArrayList<person> arrived;
    private int stationnum;
    private static int numgen = 1;

    public station(){
        stationnum = numgen;
        numgen++;
        waitingleft = new ArrayList<person>();
        waitingright = new ArrayList<person>();
        arrived =  new ArrayList<person>();
    }

    public person nextRight(){
        if(waitingright.size()>0){
            return waitingright.remove(0);
        }
        else{
            return null;
        }
    }
    public person nextLeft(){
        if(waitingleft.size()>0){
            return waitingleft.remove(0);
        }
        else{
            return null;
        }
    }
    public int getNum(){
        return stationnum;
    }

    public void addArrived(person p){
        if(p.getDestination()==stationnum){
            arrived.add(p);
        }
    }

    public int getArrived(){
        return arrived.size();
    }

    public void addPerson(person p){
        if(p.getDirection()){
            waitingright.add(p);
        }else{
            waitingleft.add(p);
        }
    }

    public String toString(){
        return super.toString() + " Station num: "+ stationnum+" Arrived: "+arrived+" Passengers going right: "+waitingright+ " Passnger waiting left: "+waitingleft+"\n\n";
        
    }
}


