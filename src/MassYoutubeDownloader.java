/**
 * Created by chack on 10/11/2015.
 */

import web_downloader.*;

public class MassYoutubeDownloader {
    public static void main(String [] args){
        //create list of youtube search result -> links
        //massively download
        //make exec
        //make graphic interface / go web
        try {
            WebDownload webDownload = new WebDownload();
            String url = "http://youtubeinmp3.com/fetch/?video=https://www.youtube.com/watch?v=mW1dbiD_zDk";
            webDownload.downloadMp3FromYoutube("new_file.mp3", url);
        }
        catch(Exception e){
            System.out.println("Exception!");
        }
    System.out.println("This is a MassYoutubeDownloader");
    }

    //"AIzaSyCrFHo70zxdaTZ-Nhc0tKNXqWx9AkK0HAs";
}
