import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JavaJuniorCollege extends JFrame implements ActionListener
{
    JMenuBar mainBar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Campuses");
    JMenu menu3 = new JMenu("Degrees");
    JMenu menu4 = new JMenu("Some other menu");
    JMenuItem exit = new JMenuItem("Exit");
    JMenuItem east = new JMenuItem("East");
    JMenuItem south = new JMenuItem("South");
    JMenuItem accounting = new JMenuItem("Accounting");
    JMenuItem cis = new JMenuItem("Computer Information Systems");
    JMenuItem marketing = new JMenuItem("Marketing");
    JMenuItem baseball = new JMenuItem("Baseball team");
    JMenuItem debate = new JMenuItem("Debate club");
    JMenuItem politics = new JMenuItem("Politics");
    JLabel label1 = new JLabel("    Java Junior College    ");
    JLabel lineLabel = new JLabel("------------------------------");
    JLabel label2 = new JLabel();
    public JavaJuniorCollege()
    {
        setTitle("Brisbane Junior School");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);
        mainBar.add(menu3);
        mainBar.add(menu4);
        menu1.add(exit);
        menu2.add(east);
        menu2.add(south);
        menu3.add(accounting);
        menu3.add(cis);
        menu3.add(marketing);
        menu4.add(baseball);
        menu4.add(debate);
        menu4.add(politics);
        exit.addActionListener(this);
        east.addActionListener(this);
        south.addActionListener(this);
        accounting.addActionListener(this);
        cis.addActionListener(this);
        marketing.addActionListener(this);
        baseball.addActionListener(this);
        debate.addActionListener(this);
        politics.addActionListener(this);
        add(label1);
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        lineLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(lineLabel);
        add(label2);
        label2.setFont(new Font("Arial", Font.ITALIC, 16));
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        String text = "  ";
        if(source == exit)
            System.exit(0);
        else if(source == south)
            text = "South campus data";
        else if(source == east)
            text = "East campus data";
        else if(source == accounting)
            text = "Accounting classes";
        else if(source == cis)
            text = "CIS classes";
        else  if(source == marketing)
            text = "Marketing classes";
        else  if(source == baseball)
            text = "Baseball";
        else  if(source == debate)
            text = "Debate team";
        else
            text = "Politics";
        label2.setText(text);
    }

    public static void main(String[] args)
    {
        JavaJuniorCollege frame = new JavaJuniorCollege();
        final int WIDTH = 400;
        final int HEIGHT = 150;
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}