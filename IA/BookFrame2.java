import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookFrame2 extends Frame implements WindowListener,ActionListener{

      JTextField title3 = new JTextField();
      JTextField bookTitleD = new JTextField();
      JTextField bookTitleW = new JTextField();
      JTextField bookAuthorD = new JTextField();
      JTextField bookAuthorW = new JTextField();
      JButton nowDelete = new JButton();
      JButton goBack = new JButton();

    public BookFrame2(String title) {
      setLayout(null);
      setBackground(Color.blue);
      addWindowListener(this);

      //the main title
      Font font1 = new Font("SansSerif", Font.BOLD, 50);
      title3.setBackground(Color.yellow);
      title3.setForeground(Color.gray);
      title3.setEditable(false);
      title3.setBounds(250,90,500,100);
      title3.setText("      Delete Book");
      title3.setFont(font1);
      add(title3);
      setSize(1000,700);

      //the title text field (non edit)
      Font font2 = new Font("SansSerif", Font. BOLD, 30);
      bookTitleD.setBackground(Color.yellow);
      bookTitleD.setForeground(Color.gray);
      bookTitleD.setEditable(false);
      bookTitleD.setBounds(130, 240, 250, 80);
      bookTitleD.setText("    Insert Title");
      bookTitleD.setFont(font2);
      add(bookTitleD);

      // enter title text field (edit)
      bookTitleW.setEditable(true);
      bookTitleW.setBounds(380, 240, 500, 80);
      bookTitleW.setFont(font2);
      add(bookTitleW);

      //the book author text JTextField (non edit)
      bookAuthorD.setBackground(Color.yellow);
      bookAuthorD.setForeground(Color.gray);
      bookAuthorD.setEditable(false);
      bookAuthorD.setBounds(130, 350, 250, 80);
      bookAuthorD.setText("  Insert Author");
      bookAuthorD.setFont(font2);
      add(bookAuthorD);

      //enter author text field (edit)
      bookAuthorW.setEditable(true);
      bookAuthorW.setBounds(380, 350, 500, 80);
      bookAuthorW.setFont(font2);
      add(bookAuthorW);

      //the adding Button
      nowDelete.setBackground(Color.yellow);
      nowDelete.setForeground(Color.gray);
      nowDelete.setOpaque(true);
      nowDelete.setBorderPainted(false);
      nowDelete.setText("Press to Delete Book");
      nowDelete.setFont(font2);
      nowDelete.setBounds(320, 550, 350, 90);
      add(nowDelete);
      nowDelete.addActionListener(this);

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

      else if(e.getSource() == nowDelete){
        String theTitle = bookTitleW.getText().toString();
        String theAuthor = bookAuthorW.getText().toString();
        String currentLine;



    File inputFile = new File("myFile.txt");
    File tempFile = new File("myTempFile.txt");

    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

// rewrite the whole file...??????
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
