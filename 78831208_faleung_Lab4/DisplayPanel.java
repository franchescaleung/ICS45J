// Represents a display panel for a Craps table

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class DisplayPanel extends JPanel
{
    private JTextField wonText, lostText, pointText, betText, creditText;
    private int wonCount, lostCount, bet, credit;

    // Constructor
    public DisplayPanel()
    {
        super(new GridLayout(3, 2, 10, 0));
        setBorder(new EmptyBorder(0, 0, 5, 0));
        Font displayFont = new Font("Monospaced", Font.BOLD, 16);

        add(new JLabel("    Bet:"));
        betText = new JTextField("0", 5);
        betText.setFont(displayFont);
        betText.setEditable(true);
        betText.setBackground(Color.WHITE);
        add(betText);
        add(new JLabel("    Credit:"));

        creditText = new JTextField("1000", 5);
        creditText.setFont(displayFont);
        creditText.setEditable(false);
        creditText.setBackground(Color.WHITE);
        add(creditText);

        add(new JLabel("    Won:"));
        add(new JLabel("    Lost:"));
        add(new JLabel("    Point:"));
        add(new JLabel(""));



        wonText = new JTextField("  0", 5);
        wonText.setFont(displayFont);
        wonText.setEditable(false);
        wonText.setBackground(Color.WHITE);
        add(wonText);

        lostText = new JTextField("  0", 5);
        lostText.setFont(displayFont);
        lostText.setEditable(false);
        lostText.setBackground(Color.WHITE);
        add(lostText);

        pointText = new JTextField(5);
        pointText.setFont(displayFont);
        pointText.setEditable(false);
        pointText.setBackground(Color.DARK_GRAY);
        add(pointText);
    }
  
    public JTextField getBet()
    {
        return betText;
    }
  
    public JTextField getCredit()
    {
        return creditText;
    }

    private JTextField getLostText()
    {
    	return lostText;
    }
    
    private JTextField getWonText()
    {
    	return wonText; 
    }
    // Updates this display, based on the result and
    // "point" in the previous roll
    // result = next roll
    // point = current roll
    public void update(int result, int point)
    {
        // Your code goes here
    	// if result = -1: game is over
    
    	if (result == -1)
    	{
    		// set bet to editable
    		// lost count += 1
    		// subtract bet amount from credit
    		// set point text background to gray
    		betText.setEditable(true);
    		int betAmount = Integer.parseInt(getBet().getText());
    		int newCreditAmount = Integer.parseInt(getCredit().getText()) - betAmount;
    		creditText.setText(Integer.toString(newCreditAmount));
    				
    		int losses = Integer.parseInt(getLostText().getText().trim()) + 1;
    		lostText.setText("  " + Integer.toString(losses));
    		
    		pointText.setBackground(Color.DARK_GRAY);
    		pointText.setText("");
    		
    		
    	}
//    	
//    	// if result == 1: winner
//    	
    	else if (result == 1)
    	{
    		// gets credit when won
    		betText.setEditable(true);
    		// win count += 1
    		int wins = Integer.parseInt(getWonText().getText().trim()) + 1;
    		wonText.setText("  " + Integer.toString(wins));
    		
    		// add bet amount to credit
    		int betAmount = Integer.parseInt(getBet().getText());
    		int newCreditAmount = Integer.parseInt(getCredit().getText()) + betAmount;
    		creditText.setText(Integer.toString(newCreditAmount));
    	}
    	
    
    	// if result == 0: continue
    	else
    	{
    		// set bet text to false
    		// point text backgronu = orange
    		// point text = point roll
    		betText.setEditable(false);
    		pointText.setBackground(Color.ORANGE);
    		pointText.setText(Integer.toString(point));
    		
    	}
    	
    	// if credit is 0: pop up that they can't play anymore
    	
    	
  }
}
