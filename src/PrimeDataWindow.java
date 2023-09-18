import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeDataWindow extends JFrame{
    private int start, end;
    private int[] data;

    private JLabel startLabel, endLabel, totalPrimesLabel;
    private JTextField startText, endText, totalPrimesFound;
    private JTextArea dataDisplay;
    private JScrollPane scrollPane;
    private JButton calculateButton;

    private JPanel statusPanel;

    public PrimeDataWindow(String windowTitle) {
        //win settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setTitle(windowTitle);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        //win content
        dataDisplay = new JTextArea(23,46);
        dataDisplay.setEditable(false);

        statusPanel = new JPanel();
        statusPanel.setLayout(new FlowLayout());

        startLabel = new JLabel("Start: ");
        endLabel = new JLabel("End: ");

        startText = new JTextField(10);
        endText = new JTextField(10);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonCallback();
            }
        });

        totalPrimesLabel = new JLabel("Count");
        totalPrimesFound = new JTextField(10);
        totalPrimesFound.setEditable(false);

        statusPanel.add(startLabel);
        statusPanel.add(startText);
        startText.setText("0");
        statusPanel.add(endLabel);
        statusPanel.add(endText);
        endText.setText("1000000");

        add(statusPanel, BorderLayout.NORTH);

        add(calculateButton);

        //scrollbar
        scrollPane = new JScrollPane(dataDisplay);
        add(scrollPane, BorderLayout.CENTER);

        add(totalPrimesLabel);
        add(totalPrimesFound, BorderLayout.SOUTH);

        //set main to visible
        setVisible(true);
    }

    public void addNumberToList(int n) {
        dataDisplay.append(n+"\n");
    }

    public void buttonCallback() {
        int startValue = Integer.parseInt(startText.getText());
        int endValue = Integer.parseInt(endText.getText());
        boolean[] primes = new boolean[endValue];
        int count = 0;
        primes[0] = true;
        primes[1] = true;
        for (int i = 0; i < primes.length; i++) {
            if (!primes[i]) {
                if (i>=startValue) {
                    addNumberToList(i);
                    count++;
                }
                for (int j = i+i; j < primes.length; j+=i) primes[j] = true;
            }
        }
        totalPrimesFound.setText(""+count);


    }

    public static void main(String[] args) {
        PrimeDataWindow win = new PrimeDataWindow("Prime Number Calculator");
    }

}
