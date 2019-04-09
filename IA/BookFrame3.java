import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookFrame3 extends Frame implements WindowListener,ActionListener{

  JTextField title3 = new JTextField();
  JTextField bookTitleD = new JTextField();
  JTextField bookTitleW = new JTextField();
  JTextField bookAuthorD = new JTextField();
  JTextField bookAuthorW = new JTextField();
  JButton nowAdd = new JButton();
  JButton goBack = new JButton();

  public BookFrame3(String title){
    setLayout(null);
    setBackground(Color.blue);
    addWindowListener(this);

    Font font1 = new Font("SansSerif", Font.BOLD, 50);
    title3.setBackground(Color.yellow);
    title3.setForeground(Color.gray);
    title3.setEditable(false);
    title3.setBounds(250,90,500,100);
    title3.setText("      Delete Book");
    title3.setFont(font1);
    add(title3);
    setSize(1000,700);

  }
  public void actionPerformed(ActionEvent e) {

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


public void removeBook(String input){
   String file = "Books.txt";     //SHOULDN'T BE HARDCODED BUT EH
   if(findBook(input) != null){
     database.remove((findBook(input)));
     try {
       File inFile = new File(file);

       if (!inFile.isFile()) {
         System.out.println("Parameter is not an existing file");
         return;
       }

       //Construct the new file that will later be renamed to the original filename.
       File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

       BufferedReader br = new BufferedReader(new FileReader(file));
       PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

       String line = null;

       //Read from the original file and write to the new
       //unless content matches data to be removed.
       while ((line = br.readLine()) != null){
         if (!line.trim().equals(findBook(input))){
           pw.println(line);
           pw.flush();
         }
       }
       pw.close();
       br.close();
     }
   }
 }
