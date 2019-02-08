/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package events;

/*
 * Beeper.java requires no other files.
 */

 //specific imports to see everything that they are going to use

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Beeper extends JPanel //shows that this class inherits componets from JPanel (superclass)
                    implements ActionListener { //uses ActionListener
    JButton button; // created instance variable of button

    public Beeper() { //constructor method
        super(new BorderLayout()); //constructor of superclass
        button = new JButton("Click Me"); // actually creating a button with that saying
        button.setPreferredSize(new Dimension(200, 80)); //making the size of the button
        add(button, BorderLayout.CENTER);//puts it in the center of the frame (adds to the frame)
        button.addActionListener(this); //makes the button use ActionListener
    }

    public void actionPerformed(ActionEvent e) { // implements methods in the listener interface
        Toolkit.getDefaultToolkit().beep(); //can make sounds!!!
    }


    public static void main(String[] args) { //main frame
      JFrame frame = new JFrame("Beeper"); //actually creaintg new frame
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this allows you the exit the frame/application

      JComponent newContentPane = new Beeper();
      newContentPane.setOpaque(true); // shows the color of the newContentPane
      frame.setContentPane(newContentPane); //action to set the frame as ___

      frame.pack(); //sets to preferred size 
      frame.setVisible(true); //action to make the frame show up
    }
}
