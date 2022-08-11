
import javax.swing.JFrame;





public class test {
    public static void main(String[] args) {
        Smiley panel = new Smiley();
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(230, 250);
        app.setVisible(true);
        
    }
}
