
import javax.swing.JFrame;

public class Runner extends JFrame {

 public Runner()
 {
     add(new Board());
     setTitle("Board");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setSize(500,500);
     setLocationRelativeTo(null);
     setVisible(true);
     setResizable(false);
 }

 public static void main(String[] args) {
     new Runner();
 }
}
