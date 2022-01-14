// Swing
//http://www.newthinktank.com/2012/02/java-video-tutorial-20/
//https://www.youtube.com/watch?v=3XB3in9Xqy8&list=PLE7E8B7F4856C9B19&index=20

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.Font;

public class Lesson20 extends JFrame{

    int FontSize =50;
    public static void main(String[] args){
        new Lesson20();
    }
//----------------------------------------
   public Lesson20(){

     this.setSize(20*FontSize, 17*FontSize); // Size of the frame
     Font font = new Font("Courier", Font.BOLD,FontSize);
     UIManager.put("ToolTip.font",
            new FontUIResource("SansSerif", Font.BOLD, FontSize-4));
        // Opens the frame in the middle of the screen-
        // You could also define position based on a component                   |

        // this.setLocationRelativeTo(null);


        // Toolkit is the super class for the Abstract Window Toolkit
        // It allows us to ask questions of the OS

        Toolkit tk = Toolkit.getDefaultToolkit();

        // A Dimension can hold the width and height of a component
        // getScreenSize returns the size of the screen
        Dimension dim = tk.getScreenSize();

        // dim.width returns the width of the screen
        // this.getWidth returns the width of the frame you are making

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);


        // Define if the user can resize the frame (true by default)
        //this.setResizable(false);

        // Define how the frame exits (Click the Close Button)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My First Frame");// Title for the frame
        this.setFont(font);

        //  JPanel contains all of the components for your frame
        JPanel thePanel = new JPanel();
        JLabel label1 = new JLabel("Tell me something");
        label1.setText("New Text");
        label1.setFont(font);
        label1.setToolTipText("Doesn't do anything");
        thePanel.add(label1);

        //Button
        JButton button1 = new JButton("Send");
        button1.setBorderPainted(true); // Hide the button border (Default True)
        button1.setContentAreaFilled(true); //Hide the button background (Default True)
        button1.setText("New Button");
        button1.setFont(font);
        button1.setToolTipText("Doesn't do anything either");  //  tool tip for the label
        thePanel.add(button1);

        //Textfield
        JTextField textField1 = new JTextField("Type Here", 15);
        textField1.setColumns(10);
        textField1.setText("New Text Here");
        textField1.setFont(font);
        textField1.setToolTipText("More of nothing");// Tool tip

        thePanel.add(textField1);

        // Text area
        JTextArea textArea1 = new JTextArea(15, 20);
        textArea1.setText("Just a whole bunch of text that is important\n");
        textArea1.setFont(font);
        textArea1.setLineWrap(true); // If text doesn't fit, jump to the next
        textArea1.setWrapStyleWord(true);
        int numOfLines = textArea1.getLineCount();
        textArea1.append(" number of lines: " + numOfLines);

        //Scroll bars to the text area
        JScrollPane scrollbar1 = new JScrollPane(textArea1,
                      JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Other options: VERTICAL_SCROLLBAR_ALWAYS, VERTICAL_SCROLLBAR_NEVER

        thePanel.add(scrollbar1);

        this.add(thePanel);
        this.setVisible(true);
        textField1.requestFocus();// Gives focus to the textfield
        // You can also request focus for the text array
        // textArea1.requestFocus();
    }// public GuiSwing()
}//public class GuiSwing extends JFrame
