class StreamingSong  {
		
	String title;
	String artist;
	String album;
	int duration; 
	
	void play() {
		System.out.println(" playing song");
	}
	
	void printdetails() {
		System.out.println(" this is " + title + " by " + " artist " + "play some songs" + album );
		
	}
	}

class StreamingsongTestDrive{
	
	public static void main(String[] args) {
		StreamingSong song = new StreamingSong();
		song.artist = " Tom cruise";
		song.title = "come together";
		song.album = "my album";
		song.play();
		song.printdetails();
	System.out.println(" play songs ");
	}
	  
}