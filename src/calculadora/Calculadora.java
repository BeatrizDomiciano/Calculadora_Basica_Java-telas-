package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora extends JFrame {
	
	public double n1 , n2;
	public String sinal;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 263, 339);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setForeground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField visor = new TextField();
		visor.setForeground(new Color(128, 128, 128));
		visor.setFont(new Font("Times New Roman", Font.BOLD, 21));
		visor.setBackground(new Color(204, 204, 255));
		visor.setBounds(40, 52, 161, 44);
		contentPane.add(visor);
		
		Panel panel = new Panel();
		panel.setBounds(40, 97, 160, 164);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 4, 0, 0));
		
		Button bntCE = new Button("CE");
		bntCE.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText("");
			}
		});
		bntCE.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bntCE.setBackground(new Color(230, 230, 250));
		panel.add(bntCE);
		
		Button bntC = new Button("C");
		bntC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText("");
			}
		});
		bntC.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bntC.setBackground(new Color(230, 230, 250));
		panel.add(bntC);
		
		Button bntPorcent = new Button("%");
		bntPorcent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				n1 = Double.parseDouble(visor.getText());
				n1 = n1/100;
				visor.setText(String.valueOf(n1));
			}
		});
		bntPorcent.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bntPorcent.setBackground(new Color(230, 230, 250));
		panel.add(bntPorcent);
		
		Button bntVezes = new Button("X");
		bntVezes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				n1 = Double.parseDouble(visor.getText());
				visor.setText("");
				sinal = "multiplicar";
			}
		});
		bntVezes.setFont(new Font("Times New Roman", Font.BOLD, 10));
		bntVezes.setBackground(new Color(230, 230, 250));
		panel.add(bntVezes);
		
		Button bnt7 = new Button("7");
		bnt7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText(visor.getText()+"7");
			}
		});
		bnt7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bnt7.setBackground(new Color(230, 230, 250));
		panel.add(bnt7);
		
		Button bnt8 = new Button("8");
		bnt8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText(visor.getText()+"8");
			}
		});
		bnt8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bnt8.setBackground(new Color(230, 230, 250));
		panel.add(bnt8);
		
		Button bnt9 = new Button("9");
		bnt9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText(visor.getText()+"9");
			}
		});
		bnt9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bnt9.setBackground(new Color(230, 230, 250));
		panel.add(bnt9);
		
		Button bntDiv = new Button("\u00F7");
		bntDiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				n1 = Double.parseDouble(visor.getText());
				visor.setText("");
				sinal = "dividir";
			}
		});
		bntDiv.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bntDiv.setBackground(new Color(230, 230, 250));
		panel.add(bntDiv);
		
		Button bnt4 = new Button("4");
		bnt4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText(visor.getText()+"4");
			}
		});
		bnt4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bnt4.setBackground(new Color(230, 230, 250));
		panel.add(bnt4);
		
		Button bnt5 = new Button("5");
		bnt5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText(visor.getText()+"5");
			}
		});
		bnt5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bnt5.setBackground(new Color(230, 230, 250));
		panel.add(bnt5);
		
		Button bnt6 = new Button("6");
		bnt6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText(visor.getText()+"6");
			}
		});
		bnt6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bnt6.setBackground(new Color(230, 230, 250));
		panel.add(bnt6);
		
		Button bntMenos = new Button("-");
		bntMenos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				n1 = Double.parseDouble(visor.getText());
				visor.setText("");
				sinal = "subtrair";
			}
		});
		bntMenos.setFont(new Font("Times New Roman", Font.BOLD, 15));
		bntMenos.setBackground(new Color(230, 230, 250));
		panel.add(bntMenos);
		
		Button bnt1 = new Button("1");
		bnt1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText(visor.getText()+"1");
			}
		});
		bnt1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bnt1.setBackground(new Color(230, 230, 250));
		panel.add(bnt1);
		
		Button bnt2 = new Button("2");
		bnt2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText(visor.getText()+"2");
			}
		});
		bnt2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bnt2.setBackground(new Color(230, 230, 250));
		panel.add(bnt2);
		
		Button bnt3 = new Button("3");
		bnt3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText(visor.getText()+"3");
			}
		});
		bnt3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bnt3.setBackground(new Color(230, 230, 250));
		panel.add(bnt3);
		
		Button bntMais = new Button("+");
		bntMais.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				n1 = Double.parseDouble(visor.getText());
				visor.setText("");
				sinal = "somar";
			}
		});
		bntMais.setFont(new Font("Times New Roman", Font.BOLD, 13));
		bntMais.setBackground(new Color(230, 230, 250));
		panel.add(bntMais);
		
		Button bntMaisMenos = new Button("\u00B1");
		bntMaisMenos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					n1 = Double.parseDouble(visor.getText());
					n1 = n1 * (-1);
					visor.setText(String.valueOf(n1));
			}
		});
		bntMaisMenos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bntMaisMenos.setBackground(new Color(230, 230, 250));
		panel.add(bntMaisMenos);
		
		Button bnt0 = new Button(visor.getText()+"0");
		bnt0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				visor.setText(visor.getText()+"0");
			}
		});
		bnt0.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bnt0.setBackground(new Color(230, 230, 250));
		panel.add(bnt0);
		
		Button bntPonto = new Button(".");
		bntPonto.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bntPonto.setBackground(new Color(230, 230, 250));
		panel.add(bntPonto);
		
		Button bntIgual = new Button("=");
		bntIgual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				n2 = Double.parseDouble(visor.getText());
				if (sinal == "somar") {
					visor.setText(String.valueOf(n1+n2));
				}
				if (sinal =="subtrair") {
					visor.setText(String.valueOf(n1-n2));
				}
				if (sinal =="multiplicar") {
					visor.setText(String.valueOf(n1*n2));
				}
				if (sinal =="dividir") {
					visor.setText(String.valueOf(n1/n2));
				}
			}
		});
		bntIgual.setFont(new Font("Times New Roman", Font.BOLD, 13));
		bntIgual.setBackground(new Color(230, 230, 250));
		panel.add(bntIgual);
	}
}
