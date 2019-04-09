import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class FamilyLibrary extends Frame implements WindowListener, ActionListener {

    JTextField main = new JTextField();
    JButton addBook = new JButton();
    JButton deleteBook = new JButton();
    JButton showBook = new JButton();
    JTextField adding = new JTextField();
    //JTextField numberofBooks = new JTextField();

    public FamilyLibrary(String title) {

        //the basic outline for the mainframe
        super(title);
        setLayout(null);
        setBackground(Color.blue);
        addWindowListener(this);
        setSize(1000, 700);


        //the main title
        Font font1 = new Font("SansSerif", Font.BOLD, 50);
        main.setBackground(Color.yellow);
        main.setForeground(Color.gray);
        main.setEditable(false);
        main.setBounds(250, 90, 500, 100);
        main.setText("    Family Library");
        main.setFont(font1);
        add(main);

        // The Add Book Button
        Font font2 = new Font("TimesRoman", Font.BOLD, 30);
        addBook.setBackground(Color.yellow);
        addBook.setForeground(Color.gray);
        addBook.setOpaque(true);
        addBook.setBorderPainted(false);
        addBook.setText("Add Book");
        addBook.setFont(font2);
        addBook.setBounds(100, 300, 200, 100);
        add(addBook);
        addBook.addActionListener(this);

        // The Delete Book Button
        deleteBook.setBackground(Color.yellow);
        deleteBook.setForeground(Color.gray);
        deleteBook.setOpaque(true);
        deleteBook.setBorderPainted(false);
        deleteBook.setText("Delete Book");
        deleteBook.setFont(font2);
        deleteBook.setBounds(650, 300, 200, 100);
        add(deleteBook);
        deleteBook.addActionListener(this);

        // The Show Book Button
        showBook.setBackground(Color.yellow);
        showBook.setForeground(Color.gray);
        showBook.setOpaque(true);
        showBook.setBorderPainted(false);
        showBook.setText("Show All Books");
        showBook.setFont(font2);
        showBook.setBounds(620, 500, 270, 100);
        add(showBook);
        showBook.addActionListener(this);

    }


    // If you press a button...
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == addBook) {
            BookFrame1 hello = new BookFrame1("Add Book");
            hello.setVisible(true);
            setVisible(false);
        } else if (e.getSource() == deleteBook) {
            BookFrame2 goodbye = new BookFrame2("Delete Book");
            goodbye.setVisible(true);
            setVisible(false);

        } else if (e.getSource() == showBook) {
            BookFrame3 all = new BookFrame3("All Books");
            all.setVisible(true);
            setVisible(false);

        }
    }


    public static void main(String[] args) {
        Frame main = new FamilyLibrary("Family Library");
        main.setVisible(true);
    }

    //closes the windows
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }


    public void windowActivated(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }


}
