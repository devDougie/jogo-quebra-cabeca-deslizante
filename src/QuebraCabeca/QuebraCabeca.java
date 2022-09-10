package QuebraCabeca;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class QuebraCabeca extends JFrame implements ActionListener{
	
	JLabel lblInstrucao = new JLabel("Coloque os números em ordem (1,2,3,...,8).");
	
	JButton btn1 = new JButton("1");
	JButton btn0 = new JButton(" ");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn2 = new JButton("2");
	
	JButton btnProximo = new JButton("Próximo");
	
	
	public QuebraCabeca(){
		
		setLayout(null);
		setSize(355, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Jogo Quebra-Cabeça Deslizante");
		setFont(new Font("Dialog", Font.PLAIN, 12));
		
		ImageIcon img = new ImageIcon(this.getClass().getResource("/puzzle-pieces-icon.png"));
		this.setIconImage(img.getImage());
		
		lblInstrucao.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblInstrucao.setBounds(20, 15, 300, 50);
		add(lblInstrucao);
		
		btn1.setFont(new Font("SansSerif", Font.BOLD, 14));
		btn1.setBounds(80, 80, 50, 50);
		btn1.addActionListener(this);
		add(btn1);
		
		btn0.setFont(new Font("SansSerif", Font.BOLD, 14));
		btn0.setBounds(145, 80, 50, 50);
		btn0.addActionListener(this);
		add(btn0);
		
		btn3.setFont(new Font("SansSerif", Font.BOLD, 14));
		btn3.setBounds(210, 80, 50, 50);
		btn3.addActionListener(this);
		add(btn3);
		
		btn4.setFont(new Font("SansSerif", Font.BOLD, 14));
		btn4.setBounds(80, 145, 50, 50);
		btn4.addActionListener(this);
		add(btn4);
		
		btn5.setFont(new Font("SansSerif", Font.BOLD, 14));
		btn5.setBounds(145, 145, 50, 50);
		btn5.addActionListener(this);
		add(btn5);
		
		btn6.setFont(new Font("SansSerif", Font.BOLD, 14));
		btn6.setBounds(210, 145, 50, 50);
		btn6.addActionListener(this);
		add(btn6);
		
		btn7.setFont(new Font("SansSerif", Font.BOLD, 14));
		btn7.setBounds(80, 210, 50, 50);
		btn7.addActionListener(this);
		add(btn7);
		
		btn8.setFont(new Font("SansSerif", Font.BOLD, 14));
		btn8.setBounds(145, 210, 50, 50);
		btn8.addActionListener(this);
		add(btn8);
		
		btn2.setFont(new Font("SansSerif", Font.BOLD, 14));
		btn2.setBounds(210, 210, 50, 50);
		btn2.addActionListener(this);
		add(btn2);
		
		btnProximo.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnProximo.setBounds(110, 280, 125, 50);
		btnProximo.addActionListener(this);
		add(btnProximo);
		
        //JOptionPane.showMessageDialog(QuebraCabeça.this,"Coloque os números em ordem (1,2,3,...,8).", "", JOptionPane.INFORMATION_MESSAGE);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == btnProximo){
			String s = btn4.getText();
			btn4.setText(btn2.getText());
			btn2.setText(s);
			s = btn1.getText();
			btn1.setText(btn5.getText());
			btn5.setText(s);
			s = btn0.getText();
			btn0.setText(btn7.getText());
			btn7.setText(s);
		}
		
		if(e.getSource() == btn1){
			String s = btn1.getText();
				if(btn0.getText().equals(" ")){ 
					btn0.setText(s); btn1.setText(" ");
				}else if(btn4.getText().equals(" ")){ 
					btn4.setText(s); btn1.setText(" ");
				}
		}
		
		if(e.getSource() == btn3){
			String s = btn3.getText();
			if(btn0.getText().equals(" ")){ 
				btn0.setText(s); btn3.setText(" ");
			}else if(btn6.getText().equals(" ")){ 
					btn6.setText(s); btn3.setText(" ");	
			}
		}
		
		if(e.getSource() == btn0){
			String s = btn0.getText();
			if(btn1.getText().equals(" ")){ 
				btn1.setText(s); btn0.setText(" ");
			}else if(btn3.getText().equals(" ")){ 
				btn3.setText(s); btn0.setText(" ");
			}else if(btn5.getText().equals(" ")){ 
				btn5.setText(s); btn0.setText(" ");
			}
		}
		
		if(e.getSource() == btn4){
			String s = btn4.getText();
			if(btn1.getText().equals(" ")){ 
				btn1.setText(s); btn4.setText(" ");
			}else if(btn7.getText().equals(" ")){ 
				btn7.setText(s); btn4.setText(" ");
			}else if(btn5.getText().equals(" ")){ 
				btn5.setText(s); btn4.setText(" ");
			}
		}
		
		if(e.getSource() == btn5){
			String s = btn5.getText();
			if(btn0.getText().equals(" ")){ 
				btn0.setText(s); btn5.setText(" ");
			}else if(btn4.getText().equals(" ")){ 
				btn4.setText(s); btn5.setText(" ");
			}else if(btn6.getText().equals(" ")){ 
				btn6.setText(s); btn5.setText(" ");
			}else if(btn8.getText().equals(" ")){ 
				btn8.setText(s); btn5.setText(" ");
			}
		}
		
		if(e.getSource() == btn6){
			String s = btn6.getText();
			if(btn2.getText().equals(" ")){ 
				btn2.setText(s); btn6.setText(" ");
			}else if(btn3.getText().equals(" ")){ 
				btn3.setText(s); btn6.setText(" ");
			}else if(btn5.getText().equals(" ")){ 
				btn5.setText(s); btn6.setText(" ");
			}
		}
		
		if(e.getSource() == btn7){
			String s = btn7.getText();
			if(btn4.getText().equals(" ")){ 
				btn4.setText(s); btn7.setText(" ");
			}else if(btn8.getText().equals(" ")){ 
				btn8.setText(s); btn7.setText(" ");
			}
		}
		
		if(e.getSource() == btn8){
			String s = btn8.getText();
			if(btn7.getText().equals(" ")){ 
				btn7.setText(s); btn8.setText(" ");
			}else if(btn2.getText().equals(" ")){ 
				btn2.setText(s); btn8.setText(" ");
			}else if(btn5.getText().equals(" ")){ 
				btn5.setText(s); btn8.setText(" ");
			}
		}
		
		if(e.getSource() == btn2){
			String s = btn2.getText();
			if(btn6.getText().equals(" ")){ 
				btn6.setText(s); btn2.setText(" ");
			}else if(btn8.getText().equals(" ")){ 
				btn8.setText(s); btn2.setText(" ");
			}
			
			if(btn1.getText().equals("1") && btn0.getText().equals("2") && btn3.getText().equals("3") && btn4.getText().equals("4") && btn5.getText().equals("5") 
			&& btn6.getText().equals("6") && btn7.getText().equals("7") && btn8.getText().equals("8") && btn2.getText().equals(" ")){ 
			JOptionPane.showMessageDialog(QuebraCabeca.this,"Você completou o Quebra-Cabeça! Clique em 'Próximo' para tentar outra vez.", "Parabéns!!!", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	
	}
 

	public static void main(String[] args){
		
		QuebraCabeca qc = new QuebraCabeca();
		qc.setLocationRelativeTo(null);
		qc.setVisible(true);
		
	}

}
