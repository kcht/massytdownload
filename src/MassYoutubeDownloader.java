/**
 * Created by chack on 10/11/2015.
 */

import web_downloader.*;

import java.io.IOException;

public class MassYoutubeDownloader {
    public static void main(String [] args){
        //create list of youtube search result -> links
        //massively download
        //make exec
        //make graphic interface / go web
        try {
            SongList songList = new SongList();
            songList.loadSongTitlesFromFile("song_test.txt");
            songList.searchAndDownloadAllSongs();

//            System.out.println(videoId);
//
//           WebDownload webDownload = new WebDownload();
//           webDownload.downloadMp3FromYoutube("songo.mp3", videoId);
        }
        catch(Exception e){
            System.out.println("Exception in main!");
            e.printStackTrace();
        }
    System.out.println("This is a MassYoutubeDownloader");
    }

    //"AIzaSyCrFHo70zxdaTZ-Nhc0tKNXqWx9AkK0HAs";
}
