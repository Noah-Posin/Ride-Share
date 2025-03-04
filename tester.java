public class tester {
   public static void main(String[] args) {
    
   
    person a = new person(5,7);
    person b = new person(2,0);
    person c = new person(10,24);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    car n = new car(5,7);
    System.out.println(n);
    n.addPassenger(a);
    System.out.println(n);
    n.move();
    n.move();
    System.out.println(n.unload());
    System.out.println(n);
    station w = new station();
    station q= new station();
    station r = new station();
    station s = new station();
    station t = new station();
    station u = new station();
    station v = new station();
    v.addPerson(a);
    System.out.println(v);
}
}
