import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Poj0 {

public static int balance = 1000;
public static int betAmount = 0;
public static JFrame f;


public static void startGame(int betAmount) {
    LuckyNineGame game = new LuckyNineGame(balance, betAmount);
}

    public static void main(String[] args) {
        f = new JFrame("Nine' of Luck"); //first frame
        Color dgreen = Color.decode("#143105");
        //143105
        Color wh =  Color.decode("#FFFFFF");
        f.getContentPane().setBackground(dgreen);
        JLabel l1 = new JLabel("Tap here to continue");
        l1.setForeground(wh);
        Font customFont = new Font("Calibri", Font.PLAIN, 25);
     	l1.setFont(customFont);

		JLabel howToPlayButton = new JLabel("How to play");
		howToPlayButton .setBackground(dgreen);
		howToPlayButton.setForeground(Color.black);
		howToPlayButton.setFont(customFont);

        ImageIcon originalIcon = new ImageIcon("1.jpg");
        Image originalImage = originalIcon.getImage();


        // Resize yun image
        int newWidth = 1100; // Set yun width
        int newHeight = 700; // Set yun height
        Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setBounds(-10, -30, 1100, 700);

		JTextArea rulesTextArea = new JTextArea(getGameRules());//open game rules

		ImageIcon back = new ImageIcon("back.jpg");
        JLabel backButton = new JLabel(back);

        backButton.setBounds(0, 10, 2050, 40);

        JScrollPane scrollPane = new JScrollPane(rulesTextArea);
        scrollPane.setBounds(15, 15, 1060, 630);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        rulesTextArea.add(backButton);
        rulesTextArea.setEnabled(false);
		rulesTextArea.setBackground(dgreen);
		rulesTextArea.setFont(new Font("Arial", Font.PLAIN, 20));


        l1.addMouseListener(new MouseAdapter() { // open sign and login
		    public void mouseClicked(MouseEvent e) {
                JFrame f2 = createFrame("Nine' of Luck");
                f2.getContentPane().setBackground(dgreen);
                ImageIcon sign = new ImageIcon("3.jpg");
                ImageIcon log = new ImageIcon("2.jpg");
                JLabel b2 = new JLabel(sign);
                JLabel b3 = new JLabel(log);
                ImageIcon back = new ImageIcon("back.jpg");
                JLabel backButton = new JLabel(back);



                b2.setBounds(420, 200, 225, 90);
                b3.setBounds(420, 350, 225, 90);
                backButton.setBounds(0, 10, 80, 40);

                f2.add(b2);
                f2.add(b3);
                f2.add(backButton);
                f2.setLayout(null);
                f2.setVisible(true);
                f.setVisible(false);

					backButton.addMouseListener(new MouseAdapter() {
		   			 public void mouseClicked(MouseEvent e) {
                        f.setVisible(true);
                        f2.setVisible(false);
                    }
              	  });
                b2.addMouseListener(new MouseAdapter() { //OPEN FRAME 3 SIGN IN
		    		public void mouseClicked(MouseEvent e) {
                        JFrame f3 = createFrame("Nine' of Luck");
                        f3.getContentPane().setBackground(dgreen);

                        JLabel backButton = new JLabel(back);
                        JLabel sup = new JLabel(sign);
                        JLabel w3 = new JLabel("FULL NAME");
                        w3.setForeground(wh);
                        JLabel w4 = new JLabel("MOBILE NUMBER");
                        w4.setForeground(wh);
                        JLabel w5 = new JLabel("CREATE USERNAME");
                        w5.setForeground(wh);
                        JLabel w6 = new JLabel("CREATE A PASSWORD (MUST BE 8 CHARACTERS ABOVE)");
                        w6.setForeground(wh);
                        JLabel w7 = new JLabel("CONFIRM PASSWORD");
                        w7.setForeground(wh);
                        JTextField tf1 = new JTextField();
                        JTextField tf2 = new JTextField();
                        JTextField tf3 = new JTextField();
                        JPasswordField tf4 = new JPasswordField();
                        JPasswordField tf5 = new JPasswordField();
                        JLabel agree = new JLabel("I AM OVER 18 YEARS OLD , HAVE READ AND AGREE TO THE RULES OF PLAYING NINE'S OF LUCK");
                        agree.setForeground(wh);
                        JCheckBox checkBox = new JCheckBox("Agree");
						checkBox.setForeground(dgreen);

						ImageIcon signin = new ImageIcon("4.jpg");
                        JLabel b4 = new JLabel(signin);
						Color tfs = Color.decode("#ffffff");
						//82d68b 85cf80 #7CA87C 66bf60 77c971

 						sup.setBounds(160, 50, 225, 90);
                        w3.setBounds(180, 140, 300, 50);
                        w4.setBounds(180, 200, 300, 50);
                        w5.setBounds(180, 260, 300, 50);
                        w6.setBounds(180, 320, 800, 50);
                        w7.setBounds(180, 380, 300, 50);
                        tf1.setBounds(180, 180, 300, 30);
                        tf2.setBounds(180, 240, 300, 30);
                        tf3.setBounds(180, 300, 300, 30);
                        tf4.setBounds(180, 360, 300, 30);
                        tf5.setBounds(180, 420, 300, 30);
                        backButton.setBounds(0, 10, 80, 40);
                        agree.setBounds(180, 450, 600, 30);
                        checkBox.setBounds(180, 480, 60, 30);
                        tf1.setBackground(tfs);
                        tf2.setBackground(tfs);
                        tf3.setBackground(tfs);
                        tf4.setBackground(tfs);
                        tf5.setBackground(tfs);
                        checkBox.setBackground(tfs);


                        b4.setBounds(260, 530, 100, 40);


               			f3.add(sup);
                        f3.add(tf1);
                        f3.add(tf2);
                        f3.add(tf3);
                        f3.add(tf4);
                        f3.add(tf5);
                        f3.add(w3);
                        f3.add(w4);
                        f3.add(w5);
                        f3.add(w6);
                        f3.add(w7);
                        f3.add(b4);
                        f3.add(backButton);
                        f3.add(checkBox);
                        f3.add(agree);


                        f3.setLayout(null);
                        f3.setVisible(true);

                        f2.setVisible(false);

                        	backButton.addMouseListener(new MouseAdapter() {
		   					 public void mouseClicked(MouseEvent e) {
                      			  f2.setVisible(true);
                      			  f3.setVisible(false);
                   				 }
                        	});

                        b4.addMouseListener(new MouseAdapter() { //OPEN FRAME 4 LOG IN
		   				 public void mouseClicked(MouseEvent e) {
                                JFrame f4 = createFrame("Nine' of Luck");
                                JLabel backButton = new JLabel(back);
                                f4.getContentPane().setBackground(dgreen);

                                JLabel lin = new JLabel(log);
                                lin.setBounds(160, 50, 225, 90);


                                JLabel w8 = new JLabel("USERNAME");
                                w8.setForeground(wh);
                                JLabel w9 = new JLabel("PASSWORD");
                                w9.setForeground(wh);
                                JTextField tf6 = new JTextField();
                                JPasswordField tf7 = new JPasswordField();

								ImageIcon lin2 = new ImageIcon("log2.jpg");
                                JLabel b5 = new JLabel(lin2);

                                w8.setBounds(180, 140, 300, 50);
               					w9.setBounds(180, 200, 300, 50);
                                tf6.setBounds(180, 180, 300, 30);
                                tf7.setBounds(180, 240, 300, 30);
                                b5.setBounds(450, 300, 100, 40);
                                backButton.setBounds(0, 10, 80, 40);

                                f4.add(tf6);
                                f4.add(tf7);
                                f4.add(b5);
                                f4.add(w8);
                                f4.add(w9);
                                f4.add(lin);
                                f4.add(backButton);

                                f4.setLayout(null);
                                f4.setVisible(true);

                                f3.setVisible(false);
                                f2.setVisible(false);

                             	   backButton.addMouseListener(new MouseAdapter() {
		   				 public void mouseClicked(MouseEvent e) {
                           		      f2.setVisible(true);
                        		      f4.setVisible(false);
                           			     }
                     			    });

                                b5.addMouseListener(new MouseAdapter() { //OPEN FRAME 5 play exit
		   				 public void mouseClicked(MouseEvent e) {
                                        JFrame f5 = createFrame("Nine' of Luck");
                                        f5.getContentPane().setBackground(dgreen);

								ImageIcon opt = new ImageIcon("opt 2.jpg");
                                JLabel bg = new JLabel(opt);

								        Font customFont = new Font("IMPACT", Font.PLAIN, 40);
								        Color tfs = Color.decode("#77c971");

                                        JButton b6 = new JButton("PLAY");b6.setFont(customFont);
								         b6.setForeground(tfs);
								         b6.setBackground(Color.WHITE);
                                        JButton b7 = new JButton("EXIT");
                                         b7.setFont(customFont);
								         b7.setForeground(tfs);
								         b7.setBackground(Color.WHITE);


										bg.setBounds(-10, -30, 1100, 700);
                                        b6.setBounds(250, 250, 250, 100);
                                        b7.setBounds(600, 250, 250, 100);

                                        f5.add(b6);
                                        f5.add(b7);
                                        f5.add(bg);
                                        f5.setLayout(null);
                                        f5.setVisible(true);


                                        f4.setVisible(false);

                                        b7.addActionListener(new ActionListener() {
    										public void actionPerformed(ActionEvent e) {
    											JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?" , "EXIT" , JOptionPane.YES_NO_OPTION);
     										   System.exit(0); // Close the application
 			 								  }
										});

                                        b6.addActionListener(new ActionListener() {
								            public void actionPerformed(ActionEvent e) {
								                JFrame f7 = createFrame("Nine' of Luck");
								                f7.getContentPane().setBackground(dgreen);
								                Font customFont = new Font("IMPACT", Font.PLAIN, 25);
								                	Color tf = Color.decode("#ffffff");


								                Font customFon = new Font("IMPACT", Font.PLAIN, 40);
								                Color tfs = Color.decode("#77c971");
													//82d68b 85cf80 #7CA87C 66bf60 77c971



								                JLabel bet = new JLabel("How many opponents do you want? (Excluding the banker)");
								                bet.setFont(customFon);
								                bet.setForeground(tf);

								                JRadioButton b8 = new JRadioButton("1 PLAYER");
								                JRadioButton b9 = new JRadioButton("2 PLAYERS");
								                JRadioButton b10 = new JRadioButton("3 PLAYERS");

								                ButtonGroup opponentsGroup = new ButtonGroup();
								                opponentsGroup.add(b8);
								                opponentsGroup.add(b9);
								                opponentsGroup.add(b10);

								                JButton startGameButton = new JButton("Start Game");

								                bet.setBounds(80,10,1050,400);

								                b8.setBounds(450, 250, 200, 30);
								                b9.setBounds(450, 300, 200, 30);
								                b10.setBounds(450, 350, 200, 30);
								                startGameButton.setBounds(450, 400, 200, 30);

								                b8.setFont(customFont);
								                b8.setForeground(tfs);
								                b8.setBackground(tf);
 												b9.setFont(customFont);
								                b9.setForeground(tfs);
								                b9.setBackground(tf);
												b10.setFont(customFont);
								                b10.setForeground(tfs);
								                b10.setBackground(tf);
												startGameButton.setFont(customFont);
								                startGameButton.setForeground(Color.BLACK);
								                startGameButton.setBackground(tf);


								                f7.add(bet);
								                f7.add(b8);
								                f7.add(b9);
								                f7.add(b10);
								                f7.add(startGameButton);

								                f5.setVisible(false);
								                f7.setLayout(null);
								                f7.setVisible(true);

								                b8.addMouseListener(new MouseAdapter() {
		   										 public void mouseClicked(MouseEvent e) {
								                        // Handle logic for 1 opponents
								                    }
								                });

								                b9.addMouseListener(new MouseAdapter() {
		   										 public void mouseClicked(MouseEvent e) {
								                        // Handle logic for 2 opponents
								                    }
								                });

								                b10.addMouseListener(new MouseAdapter() {
		   										 public void mouseClicked(MouseEvent e) {
								                        // Handle logic for 3 opponents
								                    }
								                });

								                startGameButton.addMouseListener(new MouseAdapter() {
		   												 public void mouseClicked(MouseEvent e) {
										                JFrame f8 = createFrame("Nine' of Luck");
										                f8.getContentPane().setBackground(dgreen);

										                Font customFont = new Font("IMPACT", Font.PLAIN, 25);
								                		Color tf = Color.decode("#ffffff");


								               			 Font customFon = new Font("IMPACT", Font.PLAIN, 50);
								             		 	 Color tfs = Color.decode("#77c971");
														//82d68b 85cf80 #7CA87C 66bf60 77c971


										                JLabel money = new JLabel("Put your money down");
										                money.setFont(customFon);
								               			money.setForeground(tf);
										                money.setBounds(400,0,700,400);


														ImageIcon peso = new ImageIcon("p.jpg");
                               							JLabel pesos = new JLabel(peso);
                               							pesos.setBounds(170, 150, 300, 400);

										                JRadioButton b100 = new JRadioButton("100");
										                JRadioButton b200 = new JRadioButton("200");
										                JRadioButton b300 = new JRadioButton("300");
										                JRadioButton b400 = new JRadioButton("400");
										                JRadioButton b500 = new JRadioButton("500");

										                ButtonGroup betGroup = new ButtonGroup();
										                betGroup.add(b100);
										                betGroup.add(b200);
										                betGroup.add(b300);
										                betGroup.add(b400);
										                betGroup.add(b500);

										                JButton placeBetButton = new JButton("Place Bet");


										                b100.setBounds(490, 240, 150, 30);
										                b200.setBounds(490, 290, 150, 30);
										                b300.setBounds(490, 340, 150, 30);
										                b400.setBounds(490, 390, 150, 30);
										                b500.setBounds(490, 440, 150, 30);
										                placeBetButton.setBounds(490, 490, 150, 30);

										                 b100.setFont(customFont);
								               			 b100.setForeground(tfs);
								               			 b100.setBackground(tf);
								               			 b200.setFont(customFont);
								               			 b200.setForeground(tfs);
								               			 b200.setBackground(tf);
								               			 b300.setFont(customFont);
								               			 b300.setForeground(tfs);
								               			 b300.setBackground(tf);
								               			 b400.setFont(customFont);
								               			 b400.setForeground(tfs);
								               			 b400.setBackground(tf);
								               			 b500.setFont(customFont);
								               			 b500.setForeground(tfs);
								               			 b500.setBackground(tf);
								               			 placeBetButton.setFont(customFont);
								                		placeBetButton.setForeground(Color.BLACK);
								               			 placeBetButton.setBackground(tf);



										                f8.add(b100);
										                f8.add(b200);
										                f8.add(b300);
										                f8.add(b400);
										                f8.add(b500);
										                f8.add(money);
										                f8.add(pesos);
										                f8.add(placeBetButton);


										                f8.setLayout(null);
										                f8.setVisible(true);
										                f7.setVisible(false);

										                placeBetButton.addActionListener(new ActionListener() {
														    public void actionPerformed(ActionEvent e) {
														        int betAmount = getSelectedBetAmount(b100, b200, b300, b400, b500);

														        if (betAmount > 0 && betAmount <= balance) {

														            balance -= betAmount;

														            // Display the deducted amount
														            JOptionPane.showMessageDialog(null, "You placed a bet of " + betAmount
														                    + ".\nRemaining balance: " + balance, "Bet Placed", JOptionPane.INFORMATION_MESSAGE);

																	Poj0.startGame(betAmount);
																	f8.setVisible(false);

														        } else {
														            JOptionPane.showMessageDialog(null, "Please select a valid bet amount.", "Invalid Bet",
														                    JOptionPane.ERROR_MESSAGE);
														        }
														    }
														});
										            }
										       });
								            }
								        });
                                    }
                                });
                            }
                        });
                    }
                });
                b3.addMouseListener(new MouseAdapter() {
		   				 public void mouseClicked(MouseEvent e) {
                        JFrame f4 = createFrame("Nine' of Luck");
                         ImageIcon back = new ImageIcon("back.jpg");
                JLabel backButton = new JLabel(back);
                         f4.getContentPane().setBackground(dgreen);

                         JLabel lin = new JLabel(log);
                                lin.setBounds(160, 50, 225, 90);

                                JLabel w8 = new JLabel("USERNAME");
                                w8.setForeground(wh);
                                JLabel w9 = new JLabel("PASSWORD");
                                w9.setForeground(wh);
                                JTextField tf6 = new JTextField();
                                JPasswordField tf7 = new JPasswordField();


								ImageIcon lin2 = new ImageIcon("log2.jpg");
                                JLabel b5 = new JLabel(lin2);

                                w8.setBounds(180, 140, 300, 50);
               					w9.setBounds(180, 200, 300, 50);
                                tf6.setBounds(180, 180, 300, 30);
                                tf7.setBounds(180, 240, 300, 30);
                                b5.setBounds(450, 300, 100, 30);
                                backButton.setBounds(0, 10, 80, 40);

                                f4.add(tf6);
                                f4.add(tf7);
                                f4.add(b5);
                                f4.add(w8);
                                f4.add(w9);
                                f4.add(lin);
                                f4.add(backButton);

                                f4.setLayout(null);
                                f4.setVisible(true);



                                f2.setVisible(false);

                          backButton.addMouseListener(new MouseAdapter() {
		   				 public void mouseClicked(MouseEvent e) {
                                f2.setVisible(true);
                                f4.setVisible(false);
                            }
                        });
                                b5.addMouseListener(new MouseAdapter() { //open frame 5 play or exit
		   				 public void mouseClicked(MouseEvent e) {
                                        JFrame f5 = createFrame("Nine' of Luck");
                                        f5.getContentPane().setBackground(dgreen);

								ImageIcon opt = new ImageIcon("opt 2.jpg");
                                JLabel bg = new JLabel(opt);

                                       Font customFont = new Font("IMPACT", Font.PLAIN, 40);
								        Color tfs = Color.decode("#77c971");

                                        JButton b6 = new JButton("PLAY");b6.setFont(customFont);
								         b6.setForeground(tfs);
								         b6.setBackground(Color.WHITE);
                                        JButton b7 = new JButton("EXIT");
                                         b7.setFont(customFont);
								         b7.setForeground(tfs);
								         b7.setBackground(Color.WHITE);


										bg.setBounds(-10, -30, 1100, 700);
                                        b6.setBounds(250, 250, 250, 100);
                                        b7.setBounds(600, 250, 250, 100);


                                        f5.add(b6);
                                        f5.add(b7);
                                        f5.add(bg);
                                        f5.setLayout(null);
                                        f5.setVisible(true);


                                        f4.setVisible(false);

                                        b7.addActionListener(new ActionListener() {
    										public void actionPerformed(ActionEvent e) {
     										   System.exit(0); // Close the application
 			 								  }
										});

                                        b6.addActionListener(new ActionListener() {
								            public void actionPerformed(ActionEvent e) {
								                JFrame f7 = createFrame("Nine' of Luck");
								                f7.getContentPane().setBackground(dgreen);
 													Font customFont = new Font("IMPACT", Font.PLAIN, 25);
								                	Color tf = Color.decode("#ffffff");


								                Font customFon = new Font("IMPACT", Font.PLAIN, 40);
								                Color tfs = Color.decode("#77c971");
													//82d68b 85cf80 #7CA87C 66bf60 77c971



								                JLabel bet = new JLabel("How many opponents do you want? (Excluding the banker)");
								                bet.setFont(customFon);
								                bet.setForeground(tf);

								                JRadioButton b8 = new JRadioButton("1 PLAYER");
								                JRadioButton b9 = new JRadioButton("2 PLAYERS");
								                JRadioButton b10 = new JRadioButton("3 PLAYERS");

								                ButtonGroup opponentsGroup = new ButtonGroup();
								                opponentsGroup.add(b8);
								                opponentsGroup.add(b9);
								                opponentsGroup.add(b10);

								                JButton startGameButton = new JButton("Start Game");

								                bet.setBounds(80,10,1050,400);

								                b8.setBounds(450, 250, 200, 30);
								                b9.setBounds(450, 300, 200, 30);
								                b10.setBounds(450, 350, 200, 30);
								                startGameButton.setBounds(450, 400, 200, 30);

								                b8.setFont(customFont);
								                b8.setForeground(tfs);
								                b8.setBackground(tf);
 												b9.setFont(customFont);
								                b9.setForeground(tfs);
								                b9.setBackground(tf);
												b10.setFont(customFont);
								                b10.setForeground(tfs);
								                b10.setBackground(tf);
												startGameButton.setFont(customFont);
								                startGameButton.setForeground(Color.BLACK);
								                startGameButton.setBackground(tf);


								                f7.add(bet);
								                f7.add(b8);
								                f7.add(b9);
								                f7.add(b10);
								                f7.add(startGameButton);

								                f5.setVisible(false);
								                f7.setLayout(null);
								                f7.setVisible(true);

								                b8.addMouseListener(new MouseAdapter() {
		   				 						public void mouseClicked(MouseEvent e) {
								                        // Handle logic for 1 opponents
								                    }
								                });

								                b9.addMouseListener(new MouseAdapter() {
		   				 						public void mouseClicked(MouseEvent e) {
								                        // Handle logic for 2 opponents
								                    }
								                });

								                b10.addMouseListener(new MouseAdapter() {
		   				 						public void mouseClicked(MouseEvent e) {
								                        // Handle logic for 3 opponents
								                    }
								                });


								                startGameButton.addActionListener(new ActionListener() {
										            public void actionPerformed(ActionEvent e) {
										                JFrame f8 = createFrame("Nine' of Luck");
										                f8.getContentPane().setBackground(dgreen);
 														Font customFont = new Font("IMPACT", Font.PLAIN, 25);
								                		Color tf = Color.decode("#ffffff");


								               			 Font customFon = new Font("IMPACT", Font.PLAIN, 50);
								             		 	 Color tfs = Color.decode("#77c971");
														 //82d68b 85cf80 #7CA87C 66bf60 77c971


										                JLabel money = new JLabel("Put your money down");
										                money.setFont(customFon);
								               			money.setForeground(tf);
										                money.setBounds(400,0,700,400);


															ImageIcon peso = new ImageIcon("p.jpg");
                               						 JLabel pesos = new JLabel(peso);
                               						 pesos.setBounds(170, 150, 300, 400);

										                JRadioButton b100 = new JRadioButton("100");
										                JRadioButton b200 = new JRadioButton("200");
										                JRadioButton b300 = new JRadioButton("300");
										                JRadioButton b400 = new JRadioButton("400");
										                JRadioButton b500 = new JRadioButton("500");

										                ButtonGroup betGroup = new ButtonGroup();
										                betGroup.add(b100);
										                betGroup.add(b200);
										                betGroup.add(b300);
										                betGroup.add(b400);
										                betGroup.add(b500);

										                JButton placeBetButton = new JButton("Place Bet");


										                b100.setBounds(490, 240, 150, 30);
										                b200.setBounds(490, 290, 150, 30);
										                b300.setBounds(490, 340, 150, 30);
										                b400.setBounds(490, 390, 150, 30);
										                b500.setBounds(490, 440, 150, 30);
										                placeBetButton.setBounds(490, 490, 150, 30);

										                 b100.setFont(customFont);
								               			 b100.setForeground(tfs);
								               			 b100.setBackground(tf);
								               			 b200.setFont(customFont);
								               			 b200.setForeground(tfs);
								               			 b200.setBackground(tf);
								               			 b300.setFont(customFont);
								               			 b300.setForeground(tfs);
								               			 b300.setBackground(tf);
								               			 b400.setFont(customFont);
								               			 b400.setForeground(tfs);
								               			 b400.setBackground(tf);
								               			 b500.setFont(customFont);
								               			 b500.setForeground(tfs);
								               			 b500.setBackground(tf);
								               			 placeBetButton.setFont(customFont);
								                		 placeBetButton.setForeground(Color.BLACK);
								               			 placeBetButton.setBackground(tf);



										                f8.add(b100);
										                f8.add(b200);
										                f8.add(b300);
										                f8.add(b400);
										                f8.add(b500);
										                f8.add(money);
										                f8.add(pesos);
										                f8.add(placeBetButton);


										                f8.setLayout(null);
										                f8.setVisible(true);
										                f7.setVisible(false);

										                placeBetButton.addActionListener(new ActionListener() {
														    public void actionPerformed(ActionEvent e) {
														         int betAmount = getSelectedBetAmount(b100, b200, b300, b400, b500);

														        if (betAmount > 0) {
														            balance -= betAmount;
														            JOptionPane.showMessageDialog(null, "You placed a bet of " + betAmount
														                    + ".\nRemaining balance: " + balance, "Bet Placed", JOptionPane.INFORMATION_MESSAGE);

                                   									 Poj0.startGame(betAmount);
                                   									 f8.setVisible(false);

														        } else {
														            JOptionPane.showMessageDialog(null, "Please select a valid bet amount.", "Invalid Bet",
														                    JOptionPane.ERROR_MESSAGE);
														        }
														    }
														});
										            }
										       });
								            }
								        });
                                    }
                                });
                   			 }
               			 });
           			 }
       			 });
			howToPlayButton.setBounds(480, 580, 180, 30);
      		  howToPlayButton.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
                JFrame fHowToPlay = createFrame("How to Play - Nine' of Luck");
                ImageIcon back = new ImageIcon("back.jpg");
                JLabel backButton = new JLabel(back);

                backButton.setBounds(0, 10, 2050, 40);


        		fHowToPlay.add(backButton);
                fHowToPlay.add(scrollPane);
                fHowToPlay.setVisible(true);
                f.setVisible(false);

                backButton.addMouseListener(new MouseAdapter() {
		   			 public void mouseClicked(MouseEvent e) {
                        f.setVisible(true);
                        fHowToPlay.setVisible(false);
                    }
              	  });
            }
        });

        l1.setBounds(437, 508, 300, 30);


        f.setLayout(null);
        f.setBounds(130, 20, 1100, 700);
        f.setVisible(true);
        f.add(l1);
		f.add(howToPlayButton);
		f.add(imageLabel);
    }
public static int getSelectedBetAmount(JRadioButton... buttons) {
    for (JRadioButton button : buttons) {
        if (button.isSelected()) {
            return Integer.parseInt(button.getText());
        }
    }
    return 0; // Return 0 if no bet amount is selected
}

		private static String getGameRules() {
        //game rules
        return "Game Rules - Nine' of Luck\n\n"
                + "Players:\n"
                + "Dealer: Facilitates the game and represents the house.\n"
                + "Player: Competes against the dealer.\n"
                + "\n"
                + "Card Values:\n"
                + "Ace: 1 point\n"
                + "2-9: Face value (2-9)\n"
                + "10, Jack, Queen, King: 0 or 10 points\n"
                + "Joker: Not used\n"
                + "\n"
                + "Objective:\n"
                + "Obtain a hand with the highest value, close to 9.\n"
                + "\n"
                + "Game Mechanics:\n"
                + "Initial Hand:\n"
                + "Both the player and the dealer receive two cards, maximum of 3 cards after \"Hirit\".\n"
                + "\n"
                + "Card Sum Calculation:\n"
                + "Calculate the sum of the two cards.\n"
                + "If the sum is exactly 9, it is a \"natural.\"\n"
                + "\n"
                + "Hirit or Goods na!:\n"
                + "If the initial sum is less than 9, the player may choose to \"Hirit\" for an additional card, while \"Goods na!\" \n"
                + "would show all the cards of player including the dealer.\n"
                + "If the player draws a 10, the value is considered 0, and they can continue to draw only once.\n"
                + "\n"
                + "Winning Conditions:\n"
                + "If the player has a \"natural\" (sum of 9) and the dealer does not, the player wins.\n"
                + "If both the player and the dealer have a \"natural,\" it is a tie.\n"
                + "If neither has a \"natural,\" the winner is the one with the highest total value (not exceeding 9).\n"
                + "\n"
                + "Example:\n"
                + "Player's hand: 8, 6 (Total: 14, Value: 4)\n"
                + "The player may choose to \"Hirit\" to improve their hand.\n"
                + "Drawing a 5 would result in a \"natural\" (9) and a win.\n"
                + "If the total exceeds 9 but is still higher than the dealer's hand, the player wins.";
    }

    private static JFrame createFrame(String title) {
        JFrame frame = new JFrame(title);
        frame.setLayout(new BorderLayout());
        frame.setBounds(130, 20, 1100, 700);
        return frame;

    }
}
class LuckyNineGame extends JFrame {
	int balance;
    int betAmount;


    private class Card {
        String value;
        String type;

        Card(String value, String type) {
            this.value = value;
            this.type = type;
        }

        public String toString() {
            return value + "-" + type;
        }

        public int getValue() {
            if ("AJQK".contains(value)) { // A J Q K
                if (value.equals("A")) {
                    return 1;
                }
                return 0;
            }
            return Integer.parseInt(value); // 2-10
        }

        public boolean isAce() {
            return value.equals("A");
        }

        public String getImagePath() {
            return "./card/" + toString() + ".jpg";
        }
    }

    ArrayList<Card> deck;
    Random random = new Random(); // shuffle deck

    // player
    ArrayList<Card> playerHand;
    int playerSum;

    // dealer
    ArrayList<Card> dealerHand;
    int dealerSum;

    // window
    int boardWidth = 600;
    int boardHeight = boardWidth;

    int cardWidth = 110;
    int cardHeight = 154;

    JFrame frame = new JFrame("Nine' of Luck");
    JPanel gamePanel = new JPanel() {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            try {

            	Font cardFont = new Font("Arial", Font.BOLD, 16);
            	g.setColor(Color.white);
                g.setFont(cardFont);

                // draw dealer hand
                for (int i = 0; i < dealerHand.size(); i++) {
                    Card card = dealerHand.get(i);
                    Image cardImg = new ImageIcon(getClass().getResource(card.getImagePath())).getImage();
                    g.drawImage(cardImg, cardWidth + 270 + (cardWidth + 5)*i, 20, cardWidth, cardHeight, null);
                }

                // Show the second card only when player are goods na
                Image hiddenCardImg = new ImageIcon(getClass().getResource("./card/cover.jpg")).getImage();
                if (!stayButton.isEnabled()) {
                	Card hiddenCard = dealerHand.get(1);
                    hiddenCardImg = new ImageIcon(getClass().getResource(hiddenCard.getImagePath())).getImage();
                }
                g.drawImage(hiddenCardImg, 495, 20, cardWidth, cardHeight, null);

                // draw player's hand
                for (int i = 0; i < playerHand.size(); i++) {
                    Card card = playerHand.get(i);
                    Image cardImg = new ImageIcon(getClass().getResource(card.getImagePath())).getImage();
                    g.drawImage(cardImg, cardWidth + 270 + (cardWidth + 5)*i, 450, cardWidth, cardHeight, null);
                }


				if (!stayButton.isEnabled()) {



                g.setFont(new Font("IMPACT", Font.PLAIN, 30));
                g.setColor(Color.white);
                g.drawString("Player Sum: " + playerSum, 450, 430);
                g.drawString("Dealer Sum: " + dealerSum, 450, 220);
				}

				Font remainingBetFont = new Font("Arial", Font.PLAIN, 16);
       			g.setColor(Color.WHITE);
       			g.setFont(remainingBetFont);
        		g.drawString("Remaining Bet : " + balance, 20, 600); // Position of the bet

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };


    JButton hitButton = new JButton("Hirit");
    JButton stayButton = new JButton("Goods na!");


    LuckyNineGame(int balance, int betAmount) {
    	this.balance = balance;
   		this.betAmount = betAmount;
        startGame();

        frame.setVisible(true);
        frame.setBounds(130, 20, 1100, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addWagerSelector();
        gamePanel.setLayout(null);
        gamePanel.setBackground(new Color(20, 49, 5));
        frame.add(gamePanel);

        hitButton.setFocusable(true);
        frame.add(hitButton);
        hitButton.setBounds(400, 620, 130, 30);
          Font customFont = new Font("IMPACT", Font.PLAIN, 15);
         Color tfs = Color.decode("#77c971");


    hitButton.setFont(customFont);
	hitButton.setForeground(tfs);
	hitButton.setBackground(Color.WHITE);


    stayButton.setFocusable(true);
    frame.add(stayButton);
	stayButton.setBounds(550, 620, 130, 30);
	stayButton.setFont(customFont);
	stayButton.setForeground(tfs);
	stayButton.setBackground(Color.WHITE);

		frame.add(gamePanel);


        hitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Card card = deck.remove(deck.size() - 1);
                playerSum += card.getValue();
                playerHand.add(card);
                hitButton.setEnabled(false); // Disable hit after one hiritt

                gamePanel.repaint();
            }
        });

        stayButton.addActionListener(new ActionListener() {
   	   		public void actionPerformed(ActionEvent e) {
		        hitButton.setEnabled(false);
		        stayButton.setEnabled(false);

		        gamePanel.repaint();

				// Calculate the last digit of player and dealer sums
		        int playerScore = playerSum % 10;
		        int dealerScore = dealerSum % 10;


		        // Dealer draws if the total is less than 6
       			 while (dealerSum <= 6) {
       		 	Card card = deck.remove(deck.size() - 1);
	            dealerSum += card.getValue();
	            dealerHand.add(card);
	       		}

	       		// Calculate new dealer score after drawing
        		dealerScore = dealerSum % 10;

		        // Show win/lose message dialog based on scores
		        if (playerScore > dealerScore) {
                	handleWin();
	            } else if (playerScore < dealerScore) {
	                handleLoss();
	            } else {
	                handleTie();
	            }

		        gamePanel.repaint();
		    }
		});

        gamePanel.repaint();
    }

    // add ng wager
    private void addWagerSelector() {
        // create ng option sa wager 100, 200, etc.
        JPanel wagerPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton[] wagerButtons = new JButton[5];
        int[] wagers = {100, 200, 300, 400, 500}; // Possible wager amounts
        	 Font customFont = new Font("IMPACT", Font.PLAIN, 10);
         Color tfs = Color.decode("#77c971");

        for (int i = 0; i < wagerButtons.length; i++) {
            wagerButtons[i] = new JButton(String.valueOf(wagers[i]));

            int wager = wagers[i]; // Store current wager
            wagerButtons[i].addActionListener(e -> {


                if (wager <= balance) {
                    betAmount = wager;
                    balance -= betAmount;
                    JOptionPane.showMessageDialog(this, "Balance is : " + balance);
                    enableWagerSelectionAndButtons();
                    updateCardsAfterOutcome();
                    gamePanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(this, "Not enough balance to place this bet.");
                    checkBalance();
                }
            });
            wagerPanel.add(wagerButtons[i]); // Add the button to the panel
        }

        gamePanel.add(wagerPanel); // Add the panel to the game's main panel
        wagerPanel.setBounds(950, 550, 125, 95); // Set the location and size of the panel
    }

    // Result handlers
    private void handleWin() {
        balance += betAmount * 2; // Double the bet amount on win
        Poj0.balance = balance; // Update the global balance
        JOptionPane.showMessageDialog(this, "You win! New balance: " + balance);
        betAmount = 0; // Reset bet amount
        checkBalance();
        disableWagerSelectionAndButtons();

    }

    private void handleLoss() {
        Poj0.balance = balance; // Update the global balance
        JOptionPane.showMessageDialog(this, "You lose! New balance: " + balance);
        betAmount = 0; // Reset bet amount
        checkBalance();
        disableWagerSelectionAndButtons();

    }

    private void handleTie() {
        balance += betAmount; // Return the bet amount on tie
        Poj0.balance = balance; // Update the global balance
        JOptionPane.showMessageDialog(this, "It's a tie! Bet returned. New balance: " + balance);
        betAmount = 0; // Reset bet amount
        disableWagerSelectionAndButtons();

    }


    private void disableWagerSelectionAndButtons() {
        hitButton.setEnabled(false);
        stayButton.setEnabled(false);
        gamePanel.repaint();
    }

    private void enableWagerSelectionAndButtons() {
        hitButton.setEnabled(true);
        stayButton.setEnabled(true);
        gamePanel.repaint();
    }

    public void startGame() {
        // deck
        buildDeck();
        shuffleDeck();

        // player
        playerHand = new ArrayList<>();
        playerSum = 0;

        // dealer
        dealerHand = new ArrayList<>();
        dealerSum = 0;

        // Initial cards
        for (int i = 0; i < 2; i++) {
            Card card = deck.remove(deck.size() - 1);
            playerSum += card.getValue();
            playerHand.add(card);

            card = deck.remove(deck.size() - 1);
            dealerSum += card.getValue();
            dealerHand.add(card);
        }
    }

    public void buildDeck() {
        deck = new ArrayList<>();
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] types = {"Cloves", "Diamond", "Heart", "Spades"};

        for (String type : types) {
            for (String value : values) {
                Card card = new Card(value, type);
                deck.add(card);
            }
        }
    }

    public void shuffleDeck() {
        for (int i = 0; i < deck.size(); i++) {
            int j = random.nextInt(deck.size());
            Card currCard = deck.get(i);
            Card randomCard = deck.get(j);
            deck.set(i, randomCard);
            deck.set(j, currCard);
        }
    }

    private void updateCardsAfterOutcome() {
    	// refill the deck if empty
    	if (deck.isEmpty()) {
        buildDeck();
        shuffleDeck();
    }

    playerHand.clear();
    dealerHand.clear();
    playerSum = 0;
    dealerSum = 0;

    // to draw new cards for each player:
    for (int i = 0; i < 2; i++) {
        Card playerCard = deck.remove(deck.size() - 1);
        playerSum += playerCard.getValue();
        playerHand.add(playerCard);

        Card dealerCard = deck.remove(deck.size() - 1);
        dealerSum += dealerCard.getValue();
        dealerHand.add(dealerCard);
    }

    shuffleDeck();
    gamePanel.repaint();
}

private void checkBalance() {
    if (Poj0.balance <= 0) {

        JOptionPane.showMessageDialog(frame, "Your balance is 0. You will be taken back to the start.", "Out of Balance", JOptionPane.INFORMATION_MESSAGE);

        Poj0.balance = 1000;

        frame.setVisible(false);
        Poj0.f.setVisible(true);
    }
}
}
