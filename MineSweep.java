package oyun;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MineSweep implements MouseListener {


	JFrame frame; //genel olarak tanýmladým heryeri kapsamasý için  2
	Button [][] board = new Button [18][18];
	int openkutu;
	
	public MineSweep() { //constructor oluþturdum 1
		
		openkutu=0;
		frame = new JFrame("MineSweeper"); //frame i oluþturdum 2 
		frame.setSize(800,800);             //boyutu oluþturdum 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(18,18));
	
		ImageIcon img1;
	    ImageIcon img2;
		
		img1=new ImageIcon(getClass().getResource("miinee.jpg"));
		img2=new ImageIcon(getClass().getResource("flag.png"));
		
		for(int row=0; row <board.length;row++) {
			for (int col=0;col < board[0].length;col++) {
			Button b = new Button(row,col);	
			frame.add(b);
			b.addMouseListener(this);
			board[row][col]=b;
			}
			}
		createmine();
		findcount();
	//	print();
		
		frame.setVisible(true);

	}
	public void createmine() {
		
		int i=0;

		while(i<(board.length*board[0].length)/5) {
			int randrow= (int)(Math.random()*board.length);
			int randcol= (int)(Math.random()*board[0].length);
		while(board[randrow][randcol].isMine()) {
			randrow= (int)(Math.random()*board.length);
			randcol= (int)(Math.random()*board[0].length);
		}
			board[randrow][randcol].setMine(true);
			i++;		
			}
			}
	public void print() 
{
		for(int row=0; row <board.length;row++) 
	{
			for (int col=0;col < board[0].length;col++)
		{
		
		if (board [row][col].isMine()) {
					
		Image img1 = new ImageIcon(MineSweep.class.getResource("miinee.jpg")).getImage();
		board[row][col].setIcon(new ImageIcon(img1));	
				}
		else {
		
			board[row][col].setText(board[row][col].getCount() + "");
		board[row][col].setEnabled(false);
			 }
		}
	}	
}
	public void findcount() {
		for(int row=0; row <board.length;row++) {
			for (int col=0;col < board[0].length;col++) {
				if (board[row][col].isMine()) {
					counting(row,col);
				}
			 }} }
	public void counting(int row, int col) {
		for (int i = row - 1; i <= row + 1; i++) {
			for (int j = col - 1; j <= col + 1; j++) {
				try {
					int value = board[i][j].getCount();
					board[i][j].setCount(++value);
				} catch (Exception e) {
				}
			}
		}
	}				
	public void open(int r, int c) {
		if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c].getText().length() > 0
				|| board[r][c].isEnabled() == false) {
			return;
		} else if (board[r][c].getCount() != 0) {
			board[r][c].setText(board[r][c].getCount() + "");
			board[r][c].setEnabled(false);
		openkutu++;
		} else {
		openkutu++;
			board[r][c].setEnabled(false);
			open(r - 1, c);
			open(r + 1, c);
			open(r, c - 1);
			open(r, c + 1);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Button b =(Button) e.getComponent();
		if(e.getButton()==1) {
		System.out.println("sol");
			if(b.isMine()) {
				JOptionPane.showMessageDialog(frame,"MAYINA BASTIN THE END !!" );
				print();
			}
			else {
				open(b.getRow(),b.getCol());//burada etrafýndaki mayýn bulma yeri
				if(openkutu==(board.length*board[0].length)-(board.length*board[0].length)/5) {
					JOptionPane.showMessageDialog(frame,"OYUNU KAZANDIN  !!" );
				print();
				}
			}
		}
		else if (e.getButton()==3) {
			System.out.println("sag");
			if(!b.isFlag() ) {
				Image img2 = new ImageIcon(MineSweep.class.getResource("flag.png")).getImage();
				b.setIcon(new ImageIcon(img2));
				b.setFlag(true);
			}
			else {
				b.setIcon(null);
				b.setFlag(false);
					} 
		}
	}
	@Override
	public void mousePressed(MouseEvent e) { 
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) { 
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
