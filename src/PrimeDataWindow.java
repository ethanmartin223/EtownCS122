import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Graphics2D;

public class PrimeDataWindow extends JFrame{
    private int start, end;
    private int[] data;
    JTextArea dataDisplay;

    public PrimeDataWindow(String windowTitle) {
        //win settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 800);
        setTitle(windowTitle);
        setLocationRelativeTo(null);

        //win content
        dataDisplay = new JTextArea(30,11);
        this.add(dataDisplay);

        //set main to visible
        setVisible(true);
        addNumberToList(135);
        addNumberToList(145);
        addNumberToList(199);


    }

    public void addNumberToList(int n) {
        dataDisplay.append(n+"\n");
    }



    public static void main(String[] args) {
        PrimeDataWindow win = new PrimeDataWindow("Prime Number Calculator");
    }

}
