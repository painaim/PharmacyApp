import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class viewInsuranceMenu {

	//initialize form elements
    JFrame frame = new JFrame("Main Menu");
    JPanel mainPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel bottomPanel = new JPanel();

    //initialize form contents
    JLabel infoLabel1 = new JLabel("Current Insurance Policies:");
    JLabel infoProviderLabel = new JLabel("Provider Name:");
    JLabel infoPolicyLabel = new JLabel("Policy Name:");
    JLabel infoDescriptionLabel = new JLabel("Description:");
    JLabel providerLabel = new JLabel("");
    JLabel policyLabel = new JLabel("");
    JLabel descriptionLabel = new JLabel("");
    JButton returnButton = new JButton("Return");
    JButton exitButton = new JButton("Exit Program");

    public void startGui(String provider, String policy, String description){

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
        providerLabel.setText(provider);
        policyLabel.setText(policy);
        descriptionLabel.setText(description);
                
        //Add items to panel. Grid layout means rows, columns, horizontal padding, vertical padding
        topPanel.setLayout(new GridLayout(1,1,0,0));
        mainPanel.setLayout(new GridLayout(3,2,10,10));
        bottomPanel.setLayout(new GridLayout(1,2,10,10));
        topPanel.add(infoLabel1);
        mainPanel.add(infoProviderLabel);
        mainPanel.add(providerLabel);
        mainPanel.add(infoPolicyLabel);
        mainPanel.add(policyLabel);
        mainPanel.add(infoDescriptionLabel);
        mainPanel.add(descriptionLabel);
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
