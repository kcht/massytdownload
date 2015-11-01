package web_downloader;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by chack on 10/11/2015.
 */
public class WebDownload {

    public void downloadMp3FromYoutube(String filename, String videoId)
             throws MalformedURLException, IOException {
        String downloadUrl = createDownloadLinkFromYoutube(videoId);
        saveUrl(filename, downloadUrl);
    }

    private String createDownloadLinkFromYoutube(String videoId){
        String link = "http://youtubeinmp3.com/fetch/?video=http://www.youtube.com/watch?v="+videoId;
        System.out.println(link);

     //  link = "http://youtubeinmp3.com/fetch/?video=http://www.youtube.com/watch?v=i62Zjga8JOM";
        System.out.println(link);
        return link;
    }

    private void saveUrl(final String filename, final String urlString)
            throws MalformedURLException, IOException {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try {
            in = new BufferedInputStream(new URL(urlString).openStream());
            fout = new FileOutputStream(filename);

            final byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }
}
