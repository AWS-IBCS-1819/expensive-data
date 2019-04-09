import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class BookFrame1 extends Frame implements WindowListener,ActionListener {

    JTextField title2 = new JTextField();
    JTextField bookTitleA = new JTextField();
    JTextField bookTitleW = new JTextField();
    JTextField bookAuthorA = new JTextField();
    JTextField bookAuthorW = new JTextField();
    JButton nowAdd = new JButton();
    JButton goBack = new JButton();


  public BookFrame1(String title) {
    setLayout(null);
    setBackground(Color.blue);
    addWindowListener(this);

    //the main title
    Font font1 = new Font("SansSerif", Font.BOLD, 50);
    title2.setBackground(Color.yellow);
    title2.setForeground(Color.gray);
    title2.setEditable(false);
    title2.setBounds(250,90,500,100);
    title2.setText("       Add Book");
    title2.setFont(font1);
    add(title2);
    setSize(1000,700);

    //the title text field (non edit)
    Font font2 = new Font("SansSerif", Font. BOLD, 30);
    bookTitleA.setBackground(Color.yellow);
    bookTitleA.setForeground(Color.gray);
    bookTitleA.setEditable(false);
    bookTitleA.setBounds(130, 240, 250, 80);
    bookTitleA.setText("    Insert Title");
    bookTitleA.setFont(font2);
    add(bookTitleA);

    // enter title text field (edit)
    bookTitleW.setEditable(true);
    bookTitleW.setBounds(380, 240, 500, 80);
    bookTitleW.setFont(font2);
    add(bookTitleW);

    //the book author text JTextField (non edit)
    bookAuthorA.setBackground(Color.yellow);
    bookAuthorA.setForeground(Color.gray);
    bookAuthorA.setEditable(false);
    bookAuthorA.setBounds(130, 350, 250, 80);
    bookAuthorA.setText("  Insert Author");
    bookAuthorA.setFont(font2);
    add(bookAuthorA);

    //enter author text field (edit)
    bookAuthorW.setEditable(true);
    bookAuthorW.setBounds(380, 350, 500, 80);
    bookAuthorW.setFont(font2);
    add(bookAuthorW);

    //the adding Button
    nowAdd.setBackground(Color.yellow);
    nowAdd.setForeground(Color.gray);
    nowAdd.setOpaque(true);
    nowAdd.setBorderPainted(false);
    nowAdd.setText("Press to Add Book");
    nowAdd.setFont(font2);
    nowAdd.setBounds(320, 550, 350, 90);
    add(nowAdd);
    nowAdd.addActionListener(this);

    //the back Button
    goBack.setBackground(Color.red);
    goBack.setForeground(Color.gray);
    goBack.setOpaque(true);
    goBack.setBorderPainted(false);
    goBack.setText("Back");
    goBack.setFont(font2);
    goBack.setBounds(10, 50, 150, 50);
    add(goBack);
    goBack.addActionListener(this);


  }

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == goBack){
      FamilyLibrary home = new FamilyLibrary("Family Library");
      home.setVisible(true);
      setVisible(false);
    }
    else if(e.getSource() == nowAdd){

      String theTitle = bookTitleW.getText().toString();
      String theAuthor = bookAuthorW.getText().toString();
      try{
        BufferedWriter readMe = new BufferedWriter(new FileWriter("allBooks.txt", true));
            readMe.write(theTitle + "," + theAuthor);
            readMe.newLine();
            readMe.close();
      }
      catch (IOException c){
            c.printStackTrace();
      }


    }


    }


  public void windowClosing(WindowEvent e) {
          dispose();
          System.exit(0);
          }

  public void windowActivated(WindowEvent e) {}
  public void windowIconified(WindowEvent e) {}
  public void windowDeiconified(WindowEvent e) {}
  public void windowOpened(WindowEvent e) {}
  public void windowClosed(WindowEvent e) {}
  public void windowDeactivated(WindowEvent e) {}

}
