package _05_netflix;

public class MovieNetflix {
	public static void main(String[] args) {
		Movie shrek = new Movie ("Shrek", 4);
		Movie flash = new Movie ("The Flash", 5);
		Movie hungerGames = new Movie ("Hunger Games", 4);
		Movie frozen = new Movie ("Frozen", 2);
		Movie wonder = new Movie ("Wonder", 3);
		System.out.println(shrek.getTitle() + " " + shrek.getTicketPrice());
		System.out.println(flash.getTitle() + " " + flash.getTicketPrice());
		System.out.println(hungerGames.getTitle() + " " + hungerGames.getTicketPrice());
		System.out.println(frozen.getTitle() + " " + frozen.getTicketPrice());
		System.out.println(wonder.getTitle() + " " + wonder.getTicketPrice());
		NetflixQueue netflix = new NetflixQueue ();
		netflix.addMovie(shrek);
		netflix.addMovie(flash);
		netflix.addMovie(hungerGames);
		netflix.addMovie(frozen);
		netflix.addMovie(wonder);
		netflix.sortMoviesByRating();
		System.out.println("The best movie is " + netflix.getBestMovie());
		System.out.println("The second best movie is " + netflix.getMovie(1));
		netflix.printMovies();
	}
}
