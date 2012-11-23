/*
 * class View : Main window of GUI view 
 */
import javax.swing.*;

public class View
{
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("simEvo - Prototype");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("simEvo test");
        frame.getContentPane().add(label);

        // Display the window
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
