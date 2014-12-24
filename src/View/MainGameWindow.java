package View;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Font;





public class MainGameWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    public JLabel[] playerHandPanel;//player card slots
    public JLabel[] dealerHandPanel;//dealer card slots
	JButton btnStand = new JButton("Stand");
	JButton btnHit = new JButton("Hit");
    Label handVal = new Label("0");
    Label dealerVal = new Label("0");
    int cur=0; //saves current card position in the player panel 
    int curd=0;//saves current card position in the dealer panel 
    String dealerFirstCard = "";
    GameView view;
	/**
	 * Create the frame.
	 */
	public MainGameWindow(GameView gv) {
		dealerHandPanel = new JLabel[12];
		playerHandPanel = new JLabel[12];
		view = gv;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(107, 142, 35));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btnHit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.Hit();
			}
		});
		btnHit.setBounds(228, 226, 89, 42);
		contentPane.add(btnHit);
		
	
		btnStand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.stand();
			}
		});
		btnStand.setBounds(390, 226, 89, 42);
		contentPane.add(btnStand);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(10, 430, 103, 28);
		contentPane.add(btnNewGame);
		
		JButton btnNewRound = new JButton("New Round");
		btnNewRound.setBounds(10, 469, 103, 28);
		contentPane.add(btnNewRound);
		
		JPanel dealerPanel = new JPanel();
		dealerPanel.setOpaque(false);
		dealerPanel.setBackground(new Color(50, 205, 50));
		dealerPanel.setBounds(174, 68, 504, 106);
		contentPane.add(dealerPanel);
		dealerPanel.setLayout(null);
		
		JLabel dealerSlot11 = new JLabel("");
		dealerSlot11.setBounds(295, 0, 72, 96);
		dealerPanel.add(dealerSlot11);
		
		JLabel dealerSlot10 = new JLabel("");
		dealerSlot10.setBounds(277, 0, 72, 96);
		dealerPanel.add(dealerSlot10);
		
		JLabel dealerSlot9 = new JLabel("");
		dealerSlot9.setBounds(262, 0, 72, 96);
		dealerPanel.add(dealerSlot9);
		
		JLabel dealerSlot8 = new JLabel("");
		dealerSlot8.setBounds(245, 0, 72, 96);
		dealerPanel.add(dealerSlot8);
		
		JLabel dealerSlot7 = new JLabel("");
		dealerSlot7.setBounds(228, 0, 72, 96);
		dealerPanel.add(dealerSlot7);
		
		JLabel dealerSlot6 = new JLabel("");
		dealerSlot6.setBounds(213, 0, 72, 96);
		dealerPanel.add(dealerSlot6);
		
		JLabel dealerSlot5 = new JLabel("");
		dealerSlot5.setBounds(198, 0, 72, 96);
		dealerPanel.add(dealerSlot5);
		
		JLabel dealerSlot4 = new JLabel("");
		dealerSlot4.setBounds(181, 0, 72, 96);
		dealerPanel.add(dealerSlot4);
		
		JLabel dealerSlot3 = new JLabel("");
		dealerSlot3.setBounds(167, 0, 72, 96);
		dealerPanel.add(dealerSlot3);
		
		JLabel dealerSlot2 = new JLabel("");
		dealerSlot2.setBounds(152, 0, 72, 96);
		dealerPanel.add(dealerSlot2);
		
		JLabel dealerSlot1 = new JLabel("");
		dealerSlot1.setBounds(137, 0, 72, 96);
		dealerPanel.add(dealerSlot1);
		
		JLabel dealerSlot0 = new JLabel("");
		dealerSlot0.setBounds(120, 0, 72, 96);
		dealerPanel.add(dealerSlot0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(546, 0, 89, 120);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Images\\54.png"));
		panel_1.add(lblNewLabel);
		
		JPanel playerPanel = new JPanel();
		playerPanel.setOpaque(false);
		playerPanel.setBackground(new Color(50, 205, 50));
		playerPanel.setBounds(174, 339, 504, 106);
		contentPane.add(playerPanel);
		playerPanel.setLayout(null);
		
		JLabel playerSlot11 = new JLabel("");
		playerSlot11.setBounds(301, 11, 72, 96);
		playerPanel.add(playerSlot11);
		
		JLabel playerSlot10 = new JLabel("");
		playerSlot10.setBounds(286, 11, 72, 96);
		playerPanel.add(playerSlot10);
		
		JLabel playerSlot9 = new JLabel("");
		playerSlot9.setBounds(271, 11, 72, 96);
		playerPanel.add(playerSlot9);
		
		JLabel playerSlot8 = new JLabel("");
		playerSlot8.setBounds(254, 11, 72, 96);
		playerPanel.add(playerSlot8);
		
		JLabel playerSlot7 = new JLabel("");
		playerSlot7.setBounds(237, 11, 72, 96);
		playerPanel.add(playerSlot7);
		
		JLabel playerSlot6 = new JLabel("");
		playerSlot6.setBounds(222, 11, 72, 96);
		playerPanel.add(playerSlot6);
		
		JLabel playerSlot5 = new JLabel("");
		playerSlot5.setBounds(207, 11, 72, 96);
		playerPanel.add(playerSlot5);
		
		JLabel playerSlot4 = new JLabel("");
		playerSlot4.setBounds(190, 11, 72, 96);
		playerPanel.add(playerSlot4);
		
		JLabel playerSlot3 = new JLabel("");
		playerSlot3.setBounds(176, 11, 72, 96);
		playerPanel.add(playerSlot3);
		
		JLabel playerSlot2 = new JLabel("");
		playerSlot2.setBounds(161, 11, 72, 96);
		playerPanel.add(playerSlot2);
		
		JLabel playerSlot1 = new JLabel("");
		playerSlot1.setBounds(146, 11, 72, 96);
		playerPanel.add(playerSlot1);
		
		JLabel playerSlot0 = new JLabel("");
		playerSlot0.setBounds(129, 11, 72, 96);
		playerPanel.add(playerSlot0);
		
		Label label_24 = new Label("Score: 0");
		label_24.setFont(new Font("Dialog", Font.BOLD, 21));
		label_24.setForeground(new Color(0, 0, 255));
		label_24.setBounds(10, 391, 99, 22);
		contentPane.add(label_24);
		
		Label label = new Label("Dealer:");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Dialog", Font.BOLD, 21));
		label.setBounds(307, 177, 73, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Player:");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 21));
		label_1.setBounds(307, 301, 73, 22);
		contentPane.add(label_1);
		//initialize the player slots
		playerHandPanel[0] = playerSlot0;
		playerHandPanel[1] = playerSlot1;
		playerHandPanel[2] = playerSlot2;
		playerHandPanel[3] = playerSlot3;
		playerHandPanel[4] = playerSlot4;
		playerHandPanel[5] = playerSlot5;
		playerHandPanel[6] = playerSlot6;
		playerHandPanel[7] = playerSlot7;
		playerHandPanel[8] = playerSlot8;
		playerHandPanel[9] = playerSlot9;
		playerHandPanel[10] = playerSlot10;
		playerHandPanel[11] = playerSlot11;
		//initialize the dealer slots
		
		dealerHandPanel[0] = dealerSlot0;
		dealerHandPanel[1] = dealerSlot1;
		dealerHandPanel[2] = dealerSlot2;
		dealerHandPanel[3] = dealerSlot3;
		dealerHandPanel[4] = dealerSlot4;
		dealerHandPanel[5] = dealerSlot5;
		dealerHandPanel[6] = dealerSlot6;
		dealerHandPanel[7] = dealerSlot7;
		dealerHandPanel[8] = dealerSlot8;
		dealerHandPanel[9] = dealerSlot9;
		dealerHandPanel[10] = dealerSlot10;
		dealerHandPanel[11] = dealerSlot11;
		
		
		handVal.setForeground(Color.BLUE);
		handVal.setFont(new Font("Dialog", Font.BOLD, 21));
		handVal.setBounds(398, 301, 34, 22);
		contentPane.add(handVal);
		
		
		dealerVal.setForeground(Color.BLUE);
		dealerVal.setFont(new Font("Dialog", Font.BOLD, 21));
		dealerVal.setBounds(398, 177, 34, 22);
		contentPane.add(dealerVal);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("Images\\BG.png"));
		label_2.setBounds(0, 0, 635, 522);
		contentPane.add(label_2);
		
		
	}
	public void busted(){
		//disable the hit and stand buttons
		btnHit.setEnabled(false);
		btnStand.setEnabled(false);
		JOptionPane.showMessageDialog(this,"Your Busted You lose");
	}
	public void stand(){
		//disable the hit and stand buttons
		btnHit.setEnabled(false);
		btnStand.setEnabled(false);
		JOptionPane.showMessageDialog(this,"Dealer Turn");
		flipFirstDealerCard();
	}
	public void blackJack(){
		//disable the hit and stand buttons
		btnHit.setEnabled(false);
		btnStand.setEnabled(false);
		JOptionPane.showMessageDialog(this,"Black Jack Dealer Turn");
		flipFirstDealerCard();
	}
	/**
	 * adds a card to the players' hand
	 * @param image
	 */
	public void addCardToPlayerPanel(String image){
		if(cur<playerHandPanel.length){
		    playerHandPanel[cur].setIcon(new ImageIcon(image));
	     	cur++;//move to the next card position
		}
	}
	/**
	 * sets the dealer hand value
	 * @param value
	 */
	public void setDealerHandValue(int val){
		dealerVal.setText(val+"");
	}
	/**
	 * sets the player hand value
	 * @param value
	 */
	public void setPlayerHandValue(int val){
		handVal.setText(val+"");
	}
	/**
	 * adds a card to the dealers' hand
	 * @param image
	 */
	public void addCardToDealerPanel(String image){
		if(curd<dealerHandPanel.length){
			if(curd!=0){//if not the first card show it faced up
				
		        dealerHandPanel[curd].setIcon(new ImageIcon(image));
	         	curd++;//move to the next card position
			}else{//if this is the first card show it faced down
		        dealerHandPanel[curd].setIcon(new ImageIcon("Images\\54.png"));
		        dealerFirstCard = image;//save the faced down card
	         	curd++;//move to the next card position
			}
		}
	}
	public void flipFirstDealerCard(){
		dealerHandPanel[0].setIcon(new ImageIcon(dealerFirstCard));
	}
}
