package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.telaPrincipal;

public class CancelarController implements ActionListener{
	telaPrincipal tela;
	
	public CancelarController(telaPrincipal tela) {
		this.tela = tela;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		tela.dispose();
		
	}

}
