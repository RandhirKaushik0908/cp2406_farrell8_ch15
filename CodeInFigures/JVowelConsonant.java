import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JVowelConsonant extends JFrame implements ActionListener
{
    Container con = getContentPane();
    final int MAX_LETTERS = 8;
    JButton[] buttons = new JButton[MAX_LETTERS];
    final String[] LETTERS = {"A", "B", "C", "D","E","F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] vowels = {"A", "E", "I", "O", "U"};
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel displayLabel = new JLabel("");
    boolean alreadyUsed;
    int x;
    int random_num;
    int[] random_nums = {-1, -1, -1, -1, -1, -1, -1, -1};

    public JVowelConsonant()
    {
        for(x = 0; x < MAX_LETTERS; ++x)
        {
            random_num = (int)(Math.random() * LETTERS.length);
            random_nums[x] = random_num;
        }
        setLayout(new GridLayout(2, 2));
        panel1.setLayout(new GridLayout(2, 2));
        panel2.setLayout(new GridLayout(2, 2));
        for(x = 0; x < MAX_LETTERS; ++x)
            buttons[x] = new JButton(LETTERS[random_nums[x]]);

        for(x = 0; x < 4; ++x)
            panel1.add(buttons[x]);

        for(; x < MAX_LETTERS; ++x)
            panel2.add(buttons[x]);

        panel3.add(displayLabel);
        add(panel1);
        add(panel2);
        add(panel3);
        for(x = 0; x < MAX_LETTERS; ++x)
            buttons[x].addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        for(x = 0; x < MAX_LETTERS; ++x)
            if (source == buttons[x])
            {
                if(Arrays.asList(vowels).contains(buttons[x].getText()))
                    displayLabel.setText(buttons[x].getText() + " is a vowel");
                else
                    displayLabel.setText(buttons[x].getText() + " is a consonant");
                random_num = (int)(Math.random() * LETTERS.length);
                buttons[x].setText(LETTERS[random_num]);
                x = MAX_LETTERS;
            }
    }
    public static void main(String[] ags)
    {
        JVowelConsonant f = new JVowelConsonant();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}