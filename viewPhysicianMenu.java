import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class viewPhysicianMenu {

	//initialize form elements
    JFrame frame = new JFrame("Main Menu");
    JPanel mainPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel bottomPanel = new JPanel();

    //initialize form contents
    JLabel infoLabel1 = new JLabel("Current Physician:");
    JLabel infoFirstNameLabel = new JLabel("First Name:");
    JLabel infoLastNameLabel = new JLabel("Last Name:");
    JLabel infoPhoneLabel = new JLabel("Phone Number");
    JLabel firstNameLabel = new JLabel("");
    JLabel lastNameLabel = new JLabel("");
    JLabel phoneLabel = new JLabel("");
    JButton returnButton = new JButton("Return");
    JButton exitButton = new JButton("Exit Program");

    public void startGui(String firstName, String lastName, String phoneNum){

    	//Set up form and panels
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,220);
        frame.add(topPanel,BorderLayout.NORTH);
        frame.add(mainPanel,BorderLayout.CENTER);
        frame.add(bottomPanel,BorderLayout.SOUTH);
        topPanel.setBorder(new EmptyBorder(10, 10, 0, 10));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        bottomPanel.setBorder(new EmptyBorder(0, 10, 10, 10));

        frame.setLocationRelativeTo(null);
        firstNameLabel.setText(firstName);
        lastNameLabel.setText(lastName);
        phoneLabel.setText(phoneNum);
                
        //Add items to panel. Grid layout means rows, columns, horizontal padding, vertical padding
        topPanel.setLayout(new GridLayout(1,1,0,0));
        mainPanel.setLayout(new GridLayout(3,2,10,10));
        bottomPanel.setLayout(new GridLayout(1,2,10,10));
        topPanel.add(infoLabel1);
        mainPanel.add(infoFirstNameLabel);
        mainPanel.add(firstNameLabel);
        mainPanel.add(infoLastNameLabel);
        mainPanel.add(lastNameLabel);
        mainPanel.add(infoPhoneLabel);
        mainPanel.add(phoneLabel);
        bottomPanel.add(returnButton);
        bottomPanel.add(exitButton);        
        returnButton.addActionListener(new returnButtonListener());
        exitButton.addActionListener(new exitButtonListener());
            
        frame.setVisible(true);
    }
    class returnButtonListener implements ActionListener {
        @Override
		public void actionPerformed(ActionEvent e) {
               
        }
    }
    class exitButtonListener implements ActionListener {
        @Override
		public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
