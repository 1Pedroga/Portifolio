package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class TelaJkenpo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JRadioButton rdbtnPedra;
	private JRadioButton rdbtnPapel;
	private JRadioButton rdbtnTesoura;
	private JLabel lblPC;
	private JLabel lblPapel;
	private JLabel lblTesoura;
	private JLabel lblPedra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJkenpo frame = new TelaJkenpo();
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
	public TelaJkenpo() {
		setTitle("JoKenPo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblPedra = new JLabel("");
		lblPedra.setIcon(new ImageIcon(TelaJkenpo.class.getResource("/img/pedra.png")));
		lblPedra.setBounds(31, 122, 64, 64);
		contentPane.add(lblPedra);

		lblPapel = new JLabel("");
		lblPapel.setIcon(new ImageIcon(TelaJkenpo.class.getResource("/img/papel.png")));
		lblPapel.setBounds(183, 0, 64, 64);
		contentPane.add(lblPapel);

		lblTesoura = new JLabel("");
		lblTesoura.setIcon(new ImageIcon(TelaJkenpo.class.getResource("/img/tesoura.png")));
		lblTesoura.setBounds(338, 122, 64, 64);
		contentPane.add(lblTesoura);

		lblPC = new JLabel("");
		lblPC.setIcon(new ImageIcon(TelaJkenpo.class.getResource("/img/pc.png")));
		lblPC.setBounds(136, 98, 171, 139);
		contentPane.add(lblPC);

		rdbtnPedra = new JRadioButton("");
		buttonGroup.add(rdbtnPedra);
		rdbtnPedra.setBackground(Color.WHITE);
		rdbtnPedra.setBounds(6, 193, 109, 23);
		contentPane.add(rdbtnPedra);

		JButton btnNewButton = new JButton("Pow");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pow();
			}
		});
		btnNewButton.setBounds(10, 31, 89, 23);
		contentPane.add(btnNewButton);

		rdbtnPapel = new JRadioButton("");
		buttonGroup.add(rdbtnPapel);
		rdbtnPapel.setBackground(Color.WHITE);
		rdbtnPapel.setBounds(158, 68, 109, 23);
		contentPane.add(rdbtnPapel);

		rdbtnTesoura = new JRadioButton("");
		buttonGroup.add(rdbtnTesoura);
		rdbtnTesoura.setBackground(Color.WHITE);
		rdbtnTesoura.setBounds(319, 193, 109, 23);
		contentPane.add(rdbtnTesoura);
	}// fim do contrutor

	void pow() {
		// validação
		if (rdbtnPedra.isSelected() && !rdbtnPapel.isSelected() && !rdbtnTesoura.isSelected()) {
			JOptionPane.showMessageDialog(null, "Escolha uma opção");
		} else {
			// lógica principal
			Random random = new Random();
			int pc = random.nextInt(3);
			// Dica para verificar o número sorteado
			// System.out.println(pc);
			// Associar o número a imagem
			switch (pc) { 
			case 0:
			lblPC.setIcon(new ImageIcon(TelaJkenpo.class.getResource("/img/pcpapel.png")));
			break;
			case 1:
				lblPC.setIcon(new ImageIcon(TelaJkenpo.class.getResource("/img/pcpapel.png")));
				break;
			case 3:
				lblPC.setIcon(new ImageIcon(TelaJkenpo.class.getResource("/img/pcpapel.png")));
				break;
			}
			//Comparações para determinar o vencedor ou empate
			if (rdbtnPedra.isSelected() && pc == 0 || (rdbtnPapel.isSelected() && pc == 1) || (rdbtnTesoura.isSelected() && pc == 2)) {
				JOptionPane.showInternalMessageDialog(null, "Empate");
			}else if (rdbtnPedra.isSelected() && pc == 2 || (rdbtnPapel.isSelected() && pc == 0) || (rdbtnTesoura.isSelected() && pc == 1)) {
				JOptionPane.showInternalMessageDialog(null, "Pc Venceu");
		}else {
			JOptionPane.showInternalMessageDialog(null, "Jogador Venceu");
		}
			//Limpar os campos
			lblPC.setIcon(new ImageIcon(TelaJkenpo.class.getResource("/img/pc.png")));
	buttonGroup.clearSelection();
	}
}}// fim do código
