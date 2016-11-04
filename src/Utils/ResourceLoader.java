package Utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Mocki on 02.11.2016.
 */

public class ResourceLoader {

    public static final String PATH = "res";

    public static BufferedImage loaderImage(String fileName) {

        BufferedImage image = null;

        try {

            image = ImageIO.read(new File(PATH +  "\\" + fileName));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }

}
