Person
    -getter methods to return all field of a Person

Car
    -getter methods to return all fields of a Car
    -move: changes position of car 1 station based on its direction
    -unloads all passengers if they are at their destination and returns them
    -add passengers: if the car has room, is moving in the same direction of the passenger, and the passeger wont be stuck in the car once the car reaches its destination, the car is added

Station
    -getter methods to return all fields of a station
    -stores people waiting in two different fields based on direction
    -returns and removes people from the waiting fields
    -add people if they are at the correct destination to arrived array list and returns its size

Road
    -puts each person into a random station with a random destination
    -creates a random destination and location for each car
    -for each car, unloads the car if possible then adds the people to arrived array for the certain station, then takes from all the people waiting and facilitates their addition to a correct car, moves each car.
    -calculates the number of people that have arrived


Percent Arrives
    -For both 20 cars and 40 cars with 50 people, I get around 35-48 percent of people arrive each time
    -the number would be higher if cars started at both ends and then ended at the other end, or if cars could turn around.
    -there are just not enough cars going to the correct destinations for the amount of people



    