import javax.swing.*;  // this method is needed for making a GUI
import java.awt.event.*; // This is for action and event in GUI
import java.awt.*; // Needed for Color class

public class testScore extends JFrame {
    private JPanel panel;
    private JLabel  score1, score2, score3;
    private JTextField  text1, text2, text3;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 100;
    private final int WINDOW_HEIGHT = 150;

    public testScore()
    {
        //Set the window title
        setTitle("Average Test Score");
        //set the size
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        JOptionPane.showMessageDialog(null,"Input the test score and Click on Calculate");

        //Specify what happens when the clos button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // BUILD THE PANEL AND ADD IT TO THE FRAME
        buildPanel();
        //add the panel to the frame's content pane
        add(panel);
        //display the window
        setVisible(true);

    }
    private void buildPanel()
    {
        // create  a label for the display instruction


        score1 = new JLabel("Score 1: ");
        text1 = new JTextField(10);
        score2 = new JLabel("Score 2: ");
        text2 = new JTextField(10);
        score3 = new JLabel("Score 3: ");
        text3 = new JTextField(10);
        // set the background color for the panel

        //create a text field 10 characters wide

        //create a button with the caption "calculate"
        calcButton= new JButton("Calculate");
        calcButton.setBackground(Color.pink);

//        add an action listener to the bottom.
        calcButton.addActionListener(new testScore.CalcButtonListener());
        //create a Jpanel object and let the panel field reference it
        panel = new JPanel();

        // set the backgrounf color for the panal
        panel.setBackground(Color.MAGENTA);
        // Add the label, text fiels and button


        panel.add(score1, BorderLayout.CENTER);
        panel.add(text1, BorderLayout.AFTER_LAST_LINE);
        panel.add(score2,BorderLayout.NORTH);
        panel.add(text2,BorderLayout.AFTER_LAST_LINE);
        panel.add(score3,BorderLayout.SOUTH);
        panel.add(text3, BorderLayout.AFTER_LAST_LINE);
        panel.add(calcButton,BorderLayout.CENTER);


    }
    //    calculating the action listener class for the calculate button
    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double input1; // to hold the user's input
            double input2;
            double input3;
            double sum;
            double average;

            double miles; // The number of miles
//        get the text entered by the user into the text file
            input1 = Double.parseDouble(text1.getText());
            input2 = Double.parseDouble(text2.getText());
            input3 = Double.parseDouble(text3.getText());

            sum = Double.parseDouble(String.valueOf(input1))+Double.parseDouble(String.valueOf(input2))+Double.parseDouble(String.valueOf(input3));
            average = sum / 3;
            // convert the input to miles
            //display the message
            JOptionPane.showMessageDialog(null ,String.format("Your average score of %.1f, %.1f and %.1f is %.2f",
                    input1, input2, input3, average));

        }
    }

    public static void main(String[] args) {
        new testScore();
    }
}

