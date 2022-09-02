package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Cursor;

public class Portfolio extends JFrame {

	public class IMC {

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio frame = new Portfolio();
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
	public Portfolio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portfolio.class.getResource("/img/pc.png")));
		setResizable(false);
		setTitle("Portf\u00F3lio de projetos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 467);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setToolTipText("SOBRE");
		btnNewButton_1.setIcon(new ImageIcon(Portfolio.class.getResource("/img/sobre.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento clicar no bot�o
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(302, 227, 64, 64);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Calculadora da m\u00E9dia");
		btnNewButton_2.setIcon(new ImageIcon(Portfolio.class.getResource("/img/media.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(65, 37, 64, 64);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setToolTipText("TEMPERATURA");
		btnNewButton_3.setIcon(new ImageIcon(Portfolio.class.getResource("/img/temperatura.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversaoTemperatura conversao = new ConversaoTemperatura();
				conversao.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(302, 37, 64, 64);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setToolTipText("HELLO");
		btnNewButton_4.setIcon(new ImageIcon(Portfolio.class.getResource("/img/world.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento clicar no bot�o
				Hello hello = new Hello();
				hello.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(178, 227, 64, 64);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setToolTipText("PORCENTAGEM");
		btnNewButton_5.setIcon(new ImageIcon(Portfolio.class.getResource("/img/%.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoPorcentagem porcentagem = new CalculoPorcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(405, 37, 64, 64);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setIcon(new ImageIcon(Portfolio.class.getResource("/img/app.png")));
		btnNewButton_6.setToolTipText("App Servi\u00E7o");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppServico servico = new AppServico();
				servico.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(76, 140, 64, 64);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setIcon(new ImageIcon(Portfolio.class.getResource("/img/Gasolina (2).png")));
		btnNewButton_7.setToolTipText("Etanol x Gasolina");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Combustivel combustivel = new Combustivel();
				combustivel.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(178, 140, 64, 64);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setToolTipText("Elei\u00E7\u00E3o");
		btnNewButton_8.setIcon(new ImageIcon(Portfolio.class.getResource("/img/vote.png")));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleicao eleicao = new Eleicao ();
				eleicao.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(302, 140, 64, 64);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setIcon(new ImageIcon(Portfolio.class.getResource("/img/Dado.png")));
		btnNewButton_9.setToolTipText("Dado");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dado dado = new Dado();
				dado.setVisible(true);
				
			}
		});
		btnNewButton_9.setBounds(405, 140, 64, 64);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cep cep = new Cep();
				cep.setVisible(true);
			}
		});
		btnNewButton_10.setIcon(new ImageIcon(Portfolio.class.getResource("/img/7952169_send_message_envelope_fast_email_icon.png")));
		btnNewButton_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_10.setContentAreaFilled(false);
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setToolTipText("CEP");
		btnNewButton_10.setBounds(405, 227, 64, 64);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_11.setContentAreaFilled(false);
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});
		btnNewButton_11.setIcon(new ImageIcon(Portfolio.class.getResource("/img/1654357_calculator_equal_math_minus_multiplication_icon.png")));
		btnNewButton_11.setToolTipText("tabuada");
		btnNewButton_11.setBounds(65, 227, 64, 64);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carta carta = new Carta ();
				carta.setVisible(true);
			}
		});
		btnNewButton_12.setContentAreaFilled(false);
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_12.setIcon(new ImageIcon(Portfolio.class.getResource("/img/6646623_blackjack_cards_casino_game_poker_icon.png")));
		btnNewButton_12.setToolTipText("CARTA");
		btnNewButton_12.setBounds(405, 332, 64, 64);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_13.setContentAreaFilled(false);
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setIcon(new ImageIcon(Portfolio.class.getResource("/img/2824440_calculator_math_school_tool_icon.png")));
		btnNewButton_13.setToolTipText("Calculadora da media");
		btnNewButton_13.setBounds(65, 37, 64, 64);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaIMC imc = new TelaIMC();
				imc.setVisible(true);
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(Portfolio.class.getResource("/img/5850361_exercise_fitness_gym_icon.png")));
		btnNewButton.setToolTipText("IMC");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(192, 37, 64, 64);
		contentPane.add(btnNewButton);
		
		JButton btnjokenpo = new JButton("");
		btnjokenpo.setContentAreaFilled(false);
		btnjokenpo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnjokenpo.setDefaultCapable(false);
		btnjokenpo.setBorderPainted(false);
		btnjokenpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaJkenpo jokenpo = new TelaJkenpo();
				jokenpo.setVisible(true);
			}
		});
		btnjokenpo.setIcon(new ImageIcon(Portfolio.class.getResource("/img/9165480_v_letter_hand_sign_icon.png")));
		btnjokenpo.setToolTipText("Jokenpo");
		btnjokenpo.setBounds(65, 332, 64, 64);
		contentPane.add(btnjokenpo);
	}// fim do construtor
}
