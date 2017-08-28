package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class BuscarController implements ActionListener{
	private JTextField tfCaminho;
	
	public BuscarController(JTextField tfCaminho) {
		this.tfCaminho = tfCaminho;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		procurarArquivo();
		
	}
	
	public void procurarArquivo() {
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos Executáveis(.exe)", "exe");
		
		String diretorioBase = System.getProperty("user.home")+"/Desktop";
		File dir = new File(diretorioBase);
		
		JFileChooser choose = new JFileChooser();
		
		choose.setCurrentDirectory(dir);
		choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
		choose.setAcceptAllFileFilterUsed(false);
		choose.addChoosableFileFilter(filtro);
		String caminhoArquivo = "";
		
		int retorno = choose.showOpenDialog(null);
		if(retorno == JFileChooser.APPROVE_OPTION) {
			caminhoArquivo = choose.getSelectedFile().getAbsolutePath();
			tfCaminho.setText(caminhoArquivo);
		}
	}
	

}
