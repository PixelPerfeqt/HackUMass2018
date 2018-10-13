import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class panicButton extends Frame implements WindowListener,ActionListener{
    TextField text = new TextField(50);
    Button panicButton;
    public static void main(String[] args) {
        panicButton myWindow = new panicButton("Panic!");
        myWindow.setSize(500,200);
        Color darkGreen = new Color(0, 100, 0);
        myWindow.setBackground(darkGreen);
        myWindow.setVisible(true);
    }

    public panicButton(String title) {
        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        panicButton = new Button("Click for affirmation");
        panicButton.setBackground(Color.blue);
        text.setBackground(Color.lightGray);
        add(text);
        add(panicButton);
        panicButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String[] affirmations = {"It is ok.", "Breathe in for 5 seconds, and out for 5 seconds.", "List 5 things that make you happy.", "I love you.", "You will be ok.", "Julie, you're fine.", "Kittens and puppies exist in this world.", "You are perfectly human."};
        text.setText(affirmations[(int)(Math.random() * affirmations.length)]);
    }

    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}