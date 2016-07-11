package recursos;

import java.util.ArrayList;
import java.util.List;

import excecoes.TamanhoInsuficiente;

public class GerenciadorDisco extends GerenciadorRecursos {
	public GerenciadorDisco() {
		super(confs.getTamanhoTotalMS());
	}
	
	public List<Pagina> alocarMemoria(int qtdPaginas) throws TamanhoInsuficiente {
		
		List<Pagina> pgs;
		
		//Supondo inexistência de memória virtual
		if(qtdPaginas*confs.getTamanhoPagina() > tamanhoDisponivel) throw new TamanhoInsuficiente();

		
		pgs = new ArrayList<>(qtdPaginas);
		
		for(int i = 0; i < qtdPaginas ; i++){
			pgs.add(livres.remove(0));
		}
		
		this.tamanhoDisponivel -= qtdPaginas*confs.getTamanhoPagina(); 
		
		return pgs;
	}
	
	public void liberaPagina(Pagina p){
		p.limpar();
		livres.add(p);
		livres.sort(null);
		this.tamanhoDisponivel += confs.getTamanhoPagina();
	}

	public void liberarMemoria(Processo p) {
		TabelaDePaginas tp = p.getTabela();
		
		this.tamanhoDisponivel += tp.getTamanho();
		livres.addAll(tp.getPaginas());
		livres.sort(null);
		p.setTabela(null);
	}
}
