import java.util.*;

class VideoTape {
    protected String title;
    protected double duration;
    
    public VideoTape(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " hrs");
    }
}

class Movie extends VideoTape {
    private double rating;
    
    public Movie(String title, double duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Director rating: " + rating);
    }
}

class MusicVideo extends VideoTape {
    private String category;
    
    public MusicVideo(String title, double duration, String category) {
        super(title, duration);
        this.category = category;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Artist category: " + category);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the MOVIE details: ");
	  System.out.print("Enter movie name: ");
	  String movieName = sc.nextLine();
	  System.out.print("Enter duration (in hr): ");
	  double movieDur = sc.nextDouble();
	  sc.nextLine();
	  System.out.print("Enter director rating: ");
	  double dirRating = sc.nextDouble();

        Movie movie = new Movie(movieName, movieDur, dirRating);
        movie.displayInfo();
        
        System.out.println();
	  sc.nextLine();

        System.out.println("Enter the SONG details: ");
	  System.out.print("Enter song name: ");
	  String songName = sc.nextLine();
	  System.out.print("Enter duration (in mins): ");
	  double songDur = sc.nextDouble();
	  sc.nextLine();
	  System.out.print("Enter category of the artist: ");
	  String category = sc.nextLine();

        MusicVideo musicVideo = new MusicVideo(songName, songDur, category);
        musicVideo.displayInfo();
    }
}
