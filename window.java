import javax.swing.*;
import javax.swing.GroupLayout.Group;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.border.EmptyBorder;

import java.util.concurrent.TimeUnit;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.LEADING;

import java.awt.*;
import java.beans.ExceptionListener;
public class window extends JFrame {
    
    public static String[] alphebet = { " ","A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z", ",", "-", "'", "\"",  "\\", "(", ")", "{", "}", "[", "]", "\n", ".", ":"};

    public static JFrame frame;
    public static JPanel panel;

    public static void main(String[] args) throws InterruptedException {
        frame = new JFrame("window");
        String firstLine ="So we use a coding language called Java. Java looks like this : ";//\\n public class running{\\r\\n
        String secondLine = "public class running{";
        String lineThree = "    public static void main(String[] args) {";
        JLabel textOne = new JLabel("hello");
        JLabel textTwo = new JLabel("aasdf");
        JLabel textThree = new JLabel("askld");
        JLabel heading = new JLabel("Starting ...");
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        textOne.getBounds(new Rectangle(200, 20));
        textTwo.getBounds(new Rectangle(100, 20));
        textThree.getBounds(new Rectangle(100, 20));
        textOne.setBorder(new EmptyBorder(10,10,10,110));

        frame.getContentPane().setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(heading)
                .addComponent(textOne)
                .addComponent(textTwo))
            .addComponent(textThree)
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addComponent(heading)
            .addGroup(layout.createParallelGroup(BASELINE)
                .addComponent(textOne)
                .addComponent(textThree))
            .addComponent(textTwo)
        );
        
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        typing(textOne, firstLine);
        
            }
                // String firstLine ="So we use a coding language called Java. Java looks like this : ";//\n public class running{\r\n
                // String secondLine = "public class running{";
                // String lineThree = "    public static void main(String[] args) {";
                // frame = new JFrame("Curriculum");
                // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
                // JLabel textOne = new JLabel("hello");
                // JLabel textTwo = new JLabel("aasdf");
                // JLabel textThree = new JLabel("askld");
                // JLabel heading = new JLabel("Starting ...");
                // Font headingFont = new Font("Roboto", Font.PLAIN, 30);
                // heading.setFont(headingFont);
                // frame.setSize(1000,1000);
                // frame.add(textOne);
        
                // frame.setVisible(true); 
                // frame.setIconImage(null);
                
                // textOne.setText(firstLine);
                // // for(int i = 0; i<=1000000000; i++){
                // //     text.setText(String.valueOf(i));
                // // }
                // frame.add(heading);
                // frame.add(textTwo);
                // frame.add(textThree);
        
                // heading.setLocation(250, 250);
                // System.out.println(alphebet.length);
                // System.out.println(firstLine.length());
                // //heading.setBounds(new Rectangle(new Point(50,50), heading.getPreferredSize()));
                // //textOne.setBounds(new Rectangle(new Point(50,50), textOne.getPreferredSize()));
        
                // // layout
                // GroupLayout layout = new GroupLayout(frame);
                // layout.setAutoCreateContainerGaps(true);
                // layout.setAutoCreateGaps(true);
        
        
                // layout.setHorizontalGroup(
                //     layout.createSequentialGroup()
                //     // .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER))
                //     // .addComponent(heading)
                //     .addGroup(layout.createParallelGroup(BASELINE)
                //         .addComponent(textOne)//GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE
                //         .addComponent(textTwo)
                //         .addComponent(textThree))
        
                // );
                
                // frame.setLayout(layout);
                // frame.setLocationRelativeTo(null);
                // frame.getContentPane().setLayout(layout);
                
                
            
            public static void typing (JLabel text, String line) throws InterruptedException{
        String currentText = " ";
        for(int i = 0; i<=line.length()-1; i++){
            for(int j = 0; i<alphebet.length; j++){
                Thread.sleep(2);
                text.setText(currentText);
                currentText = currentText.substring(0,currentText.length()-1);
                currentText += alphebet[j];
                if (String.valueOf(line.charAt(i)).equals(alphebet[j])) {
                    currentText += alphebet[j];
                    break;
                }    
            }
        }
    }


    // @Override
    // public void exceptionThrown(Exception e) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'exceptionThrown'");
    // }

}