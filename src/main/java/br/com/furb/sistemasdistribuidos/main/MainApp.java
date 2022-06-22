package br.com.furb.sistemasdistribuidos.main;

import br.com.furb.sistemasdistribuidos.manager.Gerenciador;

public class MainApp {

	public static void main(String[] args) {
		Gerenciador gerenciador = new Gerenciador();
		gerenciador.criar();
		gerenciador.inicializar();
		gerenciador.encerrar();
	}
}
