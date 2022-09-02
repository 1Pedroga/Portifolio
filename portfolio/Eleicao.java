package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Eleicao extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleicao dialog = new Eleicao();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Eleicao() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Eleicao.class.getResource("/img/vote.png")));
		setTitle("Eleitor");
		setBounds(100, 100, 243, 225);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Idade");
		lblNewLabel.setBounds(10, 41, 46, 14);
		getContentPane().add(lblNewLabel);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(54, 38, 100, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JButton btnNewButton = new JButton("Verificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar();
			}
		});
		btnNewButton.setBounds(65, 114, 89, 23);
		getContentPane().add(btnNewButton);

	}
	void verificar() {
	int idade;
	idade = Integer.parseInt(txtIdade.getText());
	if (idade < 16) {
		JOptionPane.showMessageDialog(null, "voto Proibido");
	} else if (idade > 17 && idade < 71) {
		JOptionPane.showMessageDialog(null, "voto Obrigatório");
	 } else {
			JOptionPane.showMessageDialog(null, "voto Facultativo");
		}
  }}
