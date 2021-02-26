package _05_netflix;

public class MovieNetflix {
	public static void main(String[] args) {
		Movie shrek = new Movie ("Shrek", 4);
		Movie flash = new Movie ("The Flash", 5);
		Movie hungerGames = new Movie ("Hunger Games", 4);
		Movie frozen = new Movie ("Frozen", 2);
		Movie wonder = new Movie ("Wonder", 3);
		shrek.getTicketPrice();
		flash.getTicketPrice();
		hungerGames.getTicketPrice();
		frozen.getTicketPrice();
		wonder.getTicketPrice();
		NetflixQueue netflix = new NetflixQueue ();
		netflix.addMovie(shrek);
		netflix.addMovie(flash);
		netflix.addMovie(hungerGames);
		netflix.addMovie(frozen);
		netflix.addMovie(wonder);
		netflix.printMovies();
	}
}
