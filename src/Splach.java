import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;


public  class Splach extends JFrame implements Runnable {
    Thread t;
    Splach(){
        // ha kifach kanzido image f Jframe
        Image i1 = new ImageIcon(ClassLoader.getSystemResource("icon/images.jpg")).getImage().getScaledInstance(720, 480, Image.SCALE_DEFAULT); 
        JLabel image= new JLabel(new ImageIcon(i1));
        add(image);
        /*********************************/
        setSize(720,480);
        setLocation(550,250);
        t=new Thread(this);
        t.start();

        setVisible(true);
       
    }

    public void run(){
        try {
            Thread.sleep(7000);
            setVisible(false);

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void main (String [] args){
        new Splach();

    }
}
