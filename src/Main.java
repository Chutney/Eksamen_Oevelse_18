import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        File mediaFile = new File("mediainfo.txt");

        try {
            mediaFile.createNewFile();
        } catch(IOException IOE) {
            System.out.println(IOE);
        }

        ArrayList<Media> mediaList = new ArrayList<>();

        mediaList.add(new Audio("My cool sound", 100, 10.4));
        mediaList.add(new Video("My very nice video",120,"18:6"));
        mediaList.add(new Audio("This sound very good",180,70));

        try {
            PrintStream out = new PrintStream(mediaFile);

            for (Media media : mediaList) {
                out.println(media.toString());
            }

        } catch(FileNotFoundException FNFE) {
            System.out.println(FNFE);
        }





    }

}
