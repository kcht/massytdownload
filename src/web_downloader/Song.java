package web_downloader;

/**
 * Created by chack on 10/27/2015.
 */
public class Song {
    private String title;
    private String author;

    public Song(String author, String title){
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYoutubeQuery(){
        return author+" - "+title;
    }

    public String formFilename(){
        return title+"_"+author;
    }

    public String toString(){
        return "; author: "+author+"title: "+title;
    }
}
