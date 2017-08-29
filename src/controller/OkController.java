package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OkController implements ActionListener{
	private JTextField tfCaminho;
	private JFrame frame;
	
	public OkController(JTextField tfCaminho,JFrame frame) {
		this.tfCaminho = tfCaminho;
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		executarComando();
		frame.dispose();
	}

	public void executarComando() {
		StringBuffer comando = new StringBuffer();
		String barra = "\\";
		String caminho = tfCaminho.getText();
		caminho = caminho.substring(caminho.lastIndexOf("\\")+1,caminho.length());
		comando.append("cmd /c start ");
		comando.append(caminho);
		System.out.println(caminho);
		try {
			Runtime.getRuntime().exec(comando.toString());
		} catch (IOException e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Arquivo invalido","Erro!",JOptionPane.ERROR_MESSAGE);
		}
		
		frame.dispose();
	}
	
}
