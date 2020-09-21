import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class JFontSelector extends JFrame implements ActionListener
{
    private final int SIZE = 250, LARGE_SIZE = 24, FONT_SIZE = 20;
    private boolean isSmall = true;
    private Container con = getContentPane();
    JLabel display = new JLabel("Font shown here");
    Panel fontPanel = new Panel();
    private JButton button1 = new JButton("Monotype Corsiva");
    private JButton button2 = new JButton("Ariel");
    private JButton button3 = new JButton("Georgia");
    private JButton button4 = new JButton("Comic Sans MS");
    private JButton button5 = new JButton("Times New Roman");
    private JButton button6 = new JButton("Change Size");
    Font font1 = new Font("Monotype Corsiva",  Font.PLAIN, FONT_SIZE);
    Font font2 = new Font("Ariel",  Font.PLAIN, FONT_SIZE);
    Font font3 = new Font("Georgia",  Font.PLAIN, FONT_SIZE);
    Font font4 = new Font("Comic Sans MS",  Font.PLAIN, FONT_SIZE);
    Font font5 = new Font("Times New Roman",  Font.PLAIN, FONT_SIZE);
    Font currentFont = font1;
    public JFontSelector()
    {
        setTitle("Java Font Selector");
        setSize(SIZE, SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        con.setLayout(new FlowLayout());
        con.add(button1);
        con.add(button2);
        con.add(button3);
        con.add(button4);
        con.add(button5);
        con.add(button6);
        add(display);
        display.setFont(currentFont);
        add(fontPanel);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button1)
        {
            currentFont = font1;
        }
        else if(e.getSource() == button2)
        {
            currentFont = font2;
        }
        else if(e.getSource() == button3)
        {
            currentFont = font3;
        }
        else if(e.getSource() == button4)
        {
            currentFont = font4;
        }
        else if(e.getSource() == button5)
        {
            currentFont = font5;
        }
        else if(e.getSource() == button6)
        {
            if(isSmall)
            {
                currentFont = currentFont.deriveFont(Font.PLAIN, LARGE_SIZE);
                isSmall = false;
            }
            else
            {
                currentFont = currentFont.deriveFont(Font.PLAIN, FONT_SIZE);
                isSmall = true;
            }
        }
        display.setFont(currentFont);
    }
    public static void main(String[] args)
    {
        JFontSelector frame = new JFontSelector();
        frame.setVisible(true);
    }
}
