package web_downloader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by chack on 10/27/2015.
 */
public class SongList {
    private LinkedList<Song> songLinkedList = new LinkedList<Song>();

    public void searchAndDownloadAllSongs(){
        WebDownload webDownload = new WebDownload();
        Search search = new Search();
        for(Song song: songLinkedList){
            String searchTerm = song.getYoutubeQuery();

            try{
                String videoId = search.videoIdFromQueryTerm(searchTerm);
                webDownload.downloadMp3FromYoutube(song.formFilename(), videoId );
                System.out.println("Successful download for: "+song);
            }
            catch(Exception e){
                System.out.println("Exception for: "+song);
            }
        }
    }

    public void loadSongTitlesFromFile(String filename) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filename));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                addSongToSongList(line);
                line = br.readLine();
            }
        } finally {
            br.close();
        }

    }

    private void addSongToSongList(String line){
        String [] records = line.split(";");
        Song song = new Song(records[0], records [1]);
        songLinkedList.add(song);
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for(Song song: songLinkedList){
            sb.append(song+"\n");
        }
        return sb.toString();
    }
}
