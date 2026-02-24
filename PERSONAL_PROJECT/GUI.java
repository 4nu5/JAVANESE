import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class GUI{
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("/Users/collinlaxman/Downloads/IMG_0633.jpeg");
        Image imgdata = image.getImage();
        Image scaleImage = imgdata.getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        ImageIcon finalIcon = new ImageIcon(scaleImage);
        ImageIcon rotatedimg  = rotateImageIcon(finalIcon, 90);
        JLabel label = new JLabel();
        label.setText("njdjadhadhahdahd");
        label.setIcon(rotatedimg);

        JFrame frame = new JFrame();
        frame.setTitle("Test");
        frame.setSize(1920,1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setVisible(true); 
    }


public static ImageIcon rotateImageIcon(ImageIcon icon, double degrees){
    Image img = icon.getImage();
        int w = img.getWidth(null);
        int h = img.getHeight(null);

        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bi.createGraphics();

        // Enable smooth edges
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.rotate(Math.toRadians(degrees), w / 2.0, h / 2.0);
        g2.drawImage(img, 0, 0, null);
        g2.dispose();

        return new ImageIcon(bi);
    }
}


    /*public static void main(String[] args) {
        JFrame frame = new JFrame("Image Test");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String path = "/Users/collinlaxman/Documents/Work/IMG_GEN/Dharshyan.jpeg";
        
        // Check if file exists first!
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("ERROR: File not found at " + path);
        }

        ImageIcon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);
        
        frame.add(label);
        frame.setVisible(true);
    }


    }   
*/
