package so;

import controle.Cache;
import recursos.Processo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Escalonador{
	
	private Cache<Escalonador> instancia;
	
	private Queue<Processo> filaProntos = new LinkedList<Processo>();
	private List<Processo> suspensos = new ArrayList<Processo>();
	private List<Processo> executando = new ArrayList<Processo>();
	private HashMap<String, GerenciadorRecurso> bloqueados = new HashMap<>();
	
	public Escalonador(){
		this.instancia = instancia.obterInstancia("src/resources/escalonador.ser");
	}
	
	public void criarProcesso(int tam){
		
	}
	
	public void terminarProcesso(int pid){
		
	}
	
	public void bloquearProcesso(int pid){
		
	}
	
	public void suspenderProcesso(int pid){
		
	}
	
}