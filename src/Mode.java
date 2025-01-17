import java.awt.*;

import javax.swing.*;

import javax.swing.border.Border;

import java.awt.event.*;

public class Mode {
    int boardwith = 300;
    int boardheight = 300;
    JFrame frame = new JFrame("Tic-Tac-Toe");
    JLabel textLabel = new JLabel();   
    JPanel logoPanel = new JPanel();
    JPanel MainMenuPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    JPanel boardPanel1 = new JPanel();
    JButton NormalBoardButton = new JButton();
    JButton ExpandedBoardButton = new JButton();
    JLabel logoLabel = new JLabel();
    JLabel MainMenuLabel = new JLabel();
    
    public Mode(){

        Border border = BorderFactory.createLineBorder(new Color(142, 82, 245));

        ImageIcon image = new ImageIcon("tictactoe.jpg");

        frame.setVisible(true);
        frame.setSize(boardwith, boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground( new Color(12,30,62));
        frame.setIconImage(image.getImage());
        
        NormalBoardButton.setBounds(75, 60, 150, 30);
        NormalBoardButton.setFocusable(false);
        NormalBoardButton.setBackground(new Color(12,30,62));
        NormalBoardButton.setBorder(border);
        NormalBoardButton.setForeground(Color.WHITE);
        NormalBoardButton.setText("Player Vs Player");
        frame.add(NormalBoardButton);

        ExpandedBoardButton.setBounds(75, 150, 150, 30);
        ExpandedBoardButton.setFocusable(false);
        ExpandedBoardButton.setBackground(new Color(12,30,62));
        ExpandedBoardButton.setBorder(border);
        ExpandedBoardButton.setForeground(Color.WHITE);
        ExpandedBoardButton.setText("Player Vs Computer");
        frame.add(ExpandedBoardButton);
        
        NormalBoardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                if(buttons.getText()=="Player Vs Player"){
                     new TicTacToe();
                    frame.dispose();
                }
            }
        });
        
        ExpandedBoardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                if(buttons.getText()=="Player Vs Computer"){
                    new Computer();
                    frame.dispose();
                }
            }
        });
     }
}

