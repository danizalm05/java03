 //Lesson 30
//https://www.youtube.com/watch?v=y9SvMg5CxA4&index=30&list=PLE7E8B7F4856C9B19
/*Complicated Java Swing layout.
 *  Everything in a GridBagLayout, but add a Box 
 *  and  FlowLayout to it.
 *  How to use all of these components: 
 *   JLabel, JTextField, JComboBox, JSpinner, JSlider, 
 *   JRadioButton, ButtonGroup, JCheckBox, JTextArea, 
 *   JScrollPane, ChangeListener.
  */

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

import java.util.Calendar;
import java.util.Date;


public class BigSwing extends JFrame{
	
  public static final int FONT_SIZE = 55;		
  Dimension d = new Dimension(FONT_SIZE*20 ,FONT_SIZE*11 );
  Dimension d_text =new Dimension(FONT_SIZE*4 ,FONT_SIZE*1 );
  Font font = new Font("Arial", Font.BOLD, FONT_SIZE *2/3);
	
	JLabel nameLabel, streetLabel, stateLabel, dateLabel,
		ageLabel, sexLabel, optionsLabel, aboutLabel;
	JTextField nameText, streetText;
	JComboBox stateList;
	JSpinner dateSpin;
	JSlider ageSlider;
	JRadioButton maleRadio, femaleRadio;
	ButtonGroup sexGroup;
	JCheckBox morningCheck, afterNCheck, eveningCheck;
	JTextArea aboutYou;
	
	
 public static void main(String[] args){
  new BigSwing();
 }

 public void ChangeSize(Font fnt){
 
		 
   UIManager.put("OptionPane.minimumSize",new Dimension(500,500));
	  //UIManager.put("Spinner.arrowButtonSize" ,new Dimension(1 ,5 ));
   UIManager.getDefaults().put("controlDkShadow", Color.MAGENTA);
   UIManager.put("Tree.font",fnt);
   UIManager.put("Button.font", fnt);
   UIManager.put("OptionPane.messageFont", fnt);
   UIManager.put("OptionPane.buttonFont", fnt);
   UIManager.put("ComboBox.font",fnt); 
   UIManager.put("Label.font",fnt);
   UIManager.put("RadioButton.font",fnt);
   UIManager.put( "TitledBorder.font",fnt);
   UIManager.put("TextField.font",new Font("Arial", Font.BOLD, FONT_SIZE *2/4));
   UIManager.put("CheckBox.font",fnt);
   
   UIManager.put("TextArea.font",new Font("Arial", Font.BOLD, FONT_SIZE *2/6));
 
 }
 
 public BigSwing(){

 // Create the frame, position it and handle closing it
 ChangeSize(font);
 
	 
 this.setLocationRelativeTo(null);
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 this.setTitle("Random Layout");
				
 JPanel thePanel = new JPanel();
 thePanel.setLayout(new GridBagLayout());
 thePanel.setPreferredSize(d);		
 nameLabel = new JLabel("  Name:");
		
 addComp(thePanel, nameLabel, 0, 0, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
		
 nameText = new JTextField(70);
 nameText.setPreferredSize(d_text);
 addComp(thePanel, nameText, 1, 0, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
 streetLabel = new JLabel("  Street:");
 addComp(thePanel, streetLabel, 0, 1, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
		
 streetText = new JTextField(30);
 streetText.setPreferredSize(d_text);
 addComp(thePanel, streetText, 1, 1, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
 // Create a set of radio buttons and wrap them in a group
 Box sexBox = Box.createVerticalBox();
 maleRadio = new JRadioButton("Male");
 femaleRadio = new JRadioButton("Female");
 ButtonGroup sexGroup = new ButtonGroup();
 sexGroup.add(maleRadio);
 sexGroup.add(femaleRadio);
 sexBox.add(maleRadio);
 sexBox.add(femaleRadio);
 sexBox.setBorder(BorderFactory.createTitledBorder("Sex"));
 addComp(thePanel, sexBox, 3, 0, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
 // Create a flow layout panel and space components 10px apart
 JPanel statePanel = new JPanel();
 statePanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));
 stateLabel = new JLabel("State");
 statePanel.add(stateLabel);
		
 // Create a combo box that will hold the states
 String[] states = {"PA", "NY", "OH", "WV", "NJ"};
 stateList = new JComboBox(states);
 statePanel.add(stateList);
		
 dateLabel = new JLabel("Appointment Date");
 statePanel.add(dateLabel);
		
 // Get todays date
 Date todaysDate = new Date();
				
 // Create a date spinner & set default to today,
 //no minimum, or max Increment the days on button 
 //presses  Can also increment YEAR, MONTH, or
 //DAY_OF_MONTH
				
 dateSpin = new JSpinner(new SpinnerDateModel(todaysDate, null, null,
				   Calendar.DAY_OF_MONTH));
				
 // DateEditor is an editor that handles displaying & editing the dates
 JSpinner.DateEditor dateEditor =
           new JSpinner.DateEditor(dateSpin, "dd/MM/yy");
 
 /////
 Dimension d_spinner = dateSpin.getPreferredSize();  
 
 d_spinner.width =3*FONT_SIZE;
 d_spinner.height = FONT_SIZE;
 dateSpin.setPreferredSize(d_spinner);
 dateSpin.setFont(font);
 
 ////
 dateSpin.setEditor(dateEditor);
 statePanel.add(dateSpin);
 ageLabel = new JLabel("Age: 50");
 statePanel.add(ageLabel);
		
 // Creates a slider with a min value of 1 thru 100
 // and an initial value of 1
				
 ageSlider = new JSlider(1, 99, 50);
		
 // Create an instance of ListenForEvents to handle events
 ListenForSlider lForSlider = new ListenForSlider();
						
 // Tell Java that you want to be alerted when an event
 // occurs on the slider
 ageSlider.addChangeListener(lForSlider);
 statePanel.add(ageSlider);
 addComp(thePanel, statePanel, 1, 2, 5, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
		
 // Create check boxs and assign them to a group
 JCheckBox morningCheck, afterNCheck, eveningCheck;
		
 Box optionBox = Box.createVerticalBox();
 morningCheck = new JCheckBox("Morning");
 afterNCheck = new JCheckBox("Afternoon");
 eveningCheck = new JCheckBox("Evening");
		
 optionBox.add(morningCheck);
 optionBox.add(afterNCheck);
 optionBox.add(eveningCheck);
 optionBox.setBorder(BorderFactory.createTitledBorder("Time of Day"));
 addComp(thePanel, optionBox, 1, 3, 2, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE);
		
 // Create a text area that is 6 columns high and 40 long
 aboutYou = new JTextArea(6, 40);
  aboutYou.setFont(font);		
		// Set the default text for the text area
 aboutYou.setText("Tell us something about you");
		
		// If text doesn't fit on a line, jump to the next
		
		aboutYou.setLineWrap(true);
		
		// Makes sure that words stay intact if a line wrap occurs
		
		aboutYou.setWrapStyleWord(true);
		
		// Adds scroll bars to the text area ----------
		
	 JScrollPane scrollbar1 = new JScrollPane(aboutYou, 
	          JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
		      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				
		// Other options: VERTICAL_SCROLLBAR_ALWAYS, VERTICAL_SCROLLBAR_NEVER
				
	     addComp(thePanel, scrollbar1, 2, 3, 3, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
		
		this.add(thePanel);
	 	// Adjusts the size of the frame to best work  
 		this.pack();
 		this.setVisible(true);
	    // Define if the user can resize the frame (true by default)
		this.setResizable(true);
		
	}
	
	// Sets the rules for a component destined for a GridBagLayout
	// and then adds it 
	
	private void addComp(JPanel thePanel, JComponent comp, int xPos, int yPos, int compWidth, int compHeight, int place, int stretch){
		
		GridBagConstraints gridConstraints = new GridBagConstraints();
		
		gridConstraints.gridx = xPos;
		gridConstraints.gridy = yPos;
		gridConstraints.gridwidth = compWidth;
		gridConstraints.gridheight = compHeight;
		gridConstraints.weightx = 100;
		gridConstraints.weighty = 100;
		gridConstraints.insets = new Insets(5,5,5,5);
		gridConstraints.anchor = place;
		gridConstraints.fill = stretch;
		
		thePanel.add(comp, gridConstraints);
		
	}
	
	// Implements ActionListener so it can react to events on components
	
	private class ListenForSlider implements ChangeListener{

	// Called when the spinner is changed
		public void stateChanged(ChangeEvent e) {
					
			// Check if the source of the event was the button
					
			if(e.getSource() == ageSlider){
				
				// Change the value for the label next to the spinner
						
				ageLabel.setText("Age: " + ageSlider.getValue() );
						
							
			}
					
		}
			
}
	
}