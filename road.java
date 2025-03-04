import java.util.ArrayList;

public class road {
private ArrayList<station> stations;
private ArrayList<car> cars;

public road(){

    cars=new ArrayList<car>();
    stations = new ArrayList<station>();
}
public void moveAll(){
    for(car a : cars){
        a.move();
    }
}



}


