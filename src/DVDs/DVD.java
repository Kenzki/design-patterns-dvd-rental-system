package DVDs;

public class DVD {
    private String title;
    private String description;
    private String genre;
    private int releaseYear;

    public DVD (String title, String description,String genre, int releaseYear){
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.releaseYear = releaseYear;

    }

    public void setTitle(String title){ this.title = title;}
    public String getTitle(){return title;}

    public void setDescription(String description){ this.description = description;}
    public String getDescription(){return description;}

    public void setGenre(String genre){ this.genre = genre;}
    public String getGenre(){return genre;}

    public void setReleaseYear(int releaseYear){ this.releaseYear = releaseYear;}
    public int getReleaseYear(){return releaseYear;}
}
