package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.BuscarController;
import controller.CancelarController;
import controller.OkController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class telaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField tfCaminho;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPrincipal frame = new telaPrincipal();
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
	public telaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblText = new JLabel("Digite o caminho do executavel ou click em procurar");
		lblText.setBounds(24, 53, 299, 14);
		contentPane.add(lblText);
		
		JLabel lblAbrir = new JLabel("Abrir:");
		lblAbrir.setBounds(36, 78, 46, 14);
		contentPane.add(lblAbrir);
		
		tfCaminho = new JTextField();
		tfCaminho.setBounds(69, 75, 214, 20);
		contentPane.add(tfCaminho);
		tfCaminho.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(25, 129, 89, 23);
		contentPane.add(btnOk);
		OkController okController = new OkController(tfCaminho,this);
		btnOk.addActionListener(okController);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(124, 129, 89, 23);
		contentPane.add(btnCancelar);
		CancelarController cancelarController = new CancelarController(this);
		ActionListener fechar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				this.dispose();
				
			}
		};
		btnCancelar.addActionListener(cancelarController);
		
		
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(223, 129, 89, 23);
		contentPane.add(btnProcurar);
		BuscarController buscar = new BuscarController(tfCaminho);
		btnProcurar.addActionListener(buscar);
		
		
	}
}
