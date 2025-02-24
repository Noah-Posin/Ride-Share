public class person{


    private int destination;
    private boolean direction;
    private int location;


public person(int mydestination, int mystart){
    destination=mydestination;
    location =mystart;
    if(location >location){
        direction=true;

    }else{
        direction = false;
    }


}
public int getDestination(){
    return destination;
}
public boolean getDirection(){
    return direction;
}
public int getLocation(){
    return location;
}

public String toString(){
    return super.toString() +"start: " + location + ", Destination: " + destination + ", Going right? "+direction;
}
}



