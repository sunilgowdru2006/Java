
import java.awt.*;
import javax.swing.*;

public class PersonalInfo extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 18));

        g.drawString("PERSONAL INFORMATION", 50, 50);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 14));

        g.drawString("Name: Rahul Kumar", 50, 100);
        g.drawString("Age: 20", 50, 130);
        g.drawString("Course: BCA", 50, 160);
        g.drawString("College: SMDC", 50, 190);
    }

    public static void main(String args[])
    {
        JFrame frame = new JFrame("Personal Information");

        PersonalInfo panel = new PersonalInfo();

        frame.add(panel);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
