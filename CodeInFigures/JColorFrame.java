import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JColorFrame extends JFrame implements ActionListener
{
    Button colorButton = new Button("Change");
    JPanel centerArea = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel westPanel = new JPanel();
    int count = 0;
    public JColorFrame()
    {
        super("JColorFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        centerArea.add(colorButton);
        con.add(northPanel, BorderLayout.NORTH);
        con.add(southPanel, BorderLayout.SOUTH);
        con.add(eastPanel, BorderLayout.EAST);
        con.add(westPanel, BorderLayout.WEST);
        con.add(centerArea, BorderLayout.CENTER);
        colorButton.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JColorFrame cFrame = new JColorFrame();
        cFrame.setSize(350,250);
        cFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(count%5 == 0)
            northPanel.setBackground(Color.GREEN);
        else if(count%5==1)
            eastPanel.setBackground(Color.YELLOW);
        else if(count%5==2)
            westPanel.setBackground(Color.ORANGE);
        else if(count%5==3)
            southPanel.setBackground(Color.RED);
        else
        {
            eastPanel.setBackground(Color.WHITE);
            southPanel.setBackground(Color.WHITE);
            northPanel.setBackground(Color.WHITE);
            westPanel.setBackground(Color.WHITE);
        }
        ++count;
    }
}