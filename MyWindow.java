import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title){
        super(title);
        setSize(400, 150);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.ITALIC, 12);
        g.setFont(sansSerifLarge);
        g.drawString("My first window", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("By Johnny Morgan", 60, 100);
    }

    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow("My Window");
        myWindow.setVisible(true);
    }
}
