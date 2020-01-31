import java.util.Scanner;

abstract class Item{
	private int Identification;
	private int NumberOfCopies;
	private String Title;
	public int getIdentification(){
		return Identification;
	}
	public int getNumberOfCopies(){
		return NumberOfCopies;
	}
	public String getTitle(){
		return Title;
	}
	public void setIdentification(int a){
		this.Identification = a;
	}
	
	public void setNumberOfCopies(int a){
		this.NumberOfCopies = a;
	}
	
	public void setTitle(String a){
		this.Title = a;
	}
}

abstract class WrittenItem extends Item{
	private String Author;
	public String getAuthor(){
		return Author;
	}
	public void setAuthor(String a){
		this.Author = a;
	}

}

abstract class MediaItem extends Item{
	private int RunTime;
	public int getRunTime(){
		return RunTime;
	}
	public void setRunTime(int a){
		this.RunTime = a;
	}

}

class Book extends WrittenItem{

}

class JournalPaper extends WrittenItem{
	private int YearPublished;
	public int getYearPublished(){
		return YearPublished;
	}
	public void setYearPublished(int a){
		this.YearPublished = a;
	}
}

class Video extends MediaItem{
	private String Director;
	private String Genre;
	private int YearPublished;
	public String getDirector(){
		return Director;
	}
	public String getGenre(){
		return Genre;
	}
	public int getYearPublished(){
		return YearPublished;
	}
	public void setYearPublished(int a){
		this.YearPublished = a;
	}
	public void setDirector(String a){
		this.Director = a;
	}
	public void setGenre(String a){
		this.Genre = a;
	}
}

class CD extends MediaItem{
	private String Genre;
	private String Artist;
	public String getGenre(){
		return Genre;
	}
	public String getArtist(){
		return Artist;
	}
	public void setGenre(String a){
		this.Genre = a;
	}
	public void setArtist(String a){
		this.Artist = a;
	}
}

public class Library{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Video a = new Video();
		System.out.println("Enter the year of Published'");
		int pub = sc.nextInt();
		System.out.println("Enter the Director name ");
		String dic = sc.nextLine(); 
		String gen1 = sc.nextLine();
		//System.out.println("sbvxhsdbcdse ");
		System.out.println("Enter the generic");
		String gen = sc.nextLine();
		System.out.println("Enter the time");
		int time = sc.nextInt();
		System.out.println("Enter the Identification");
		int ident = sc.nextInt();
		System.out.println("Enter the no of copies");
		int cop = sc.nextInt();
		System.out.println("Enter the title");
		String gen3 = sc.nextLine();
		String t = sc.nextLine();
		a.setYearPublished(pub);
		a.setDirector(gen1);
		a.setGenre(gen);
		a.setRunTime(time);
		a.setIdentification(ident);
		a.setNumberOfCopies(cop);
		a.setTitle(gen3);
		System.out.println("Identification:" + a.getIdentification());
		System.out.println("Title: " + a.getTitle());
		System.out.println("Number of copies: " + a.getNumberOfCopies());
		System.out.println("Genre: " + a.getGenre());
		System.out.println("Director: " + a.getDirector());
		if(a.getNumberOfCopies() > 0){
			System.out.println("Copies are avaliable");
		}
		else{
			System.out.println("Copies are not avaliable");
		}
	}
}