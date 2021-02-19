package _01_intro_to_static;

public class Athlete {

	    static int nextBibNumber = 1;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        this.bibNumber = nextBibNumber;
	        nextBibNumber = nextBibNumber + 1;
	    }

	    public static void main(String[] args) {
	        Athlete bob = new Athlete ("Bob", 5);
	        Athlete jeff = new Athlete ("Jeff", 4);
	        //print their names, bibNumbers, and the location of their race. 
	        System.out.println("Bob's bib number is " + bob.bibNumber + " and he is going to " + bob.raceLocation + " to race.");
	        System.out.println("Jeff's bib number is " + jeff.bibNumber + " and he is going to " + jeff.raceLocation + " to race.");
	    }
	}

