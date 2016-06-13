package so;

import java.util.ArrayList;
import java.util.List;

import ambiente.Pagina;

public class TabelaDePaginas{
	List<Pagina> paginas;
	int tamanho;

	public TabelaDePaginas(int linhas){
		if(linhas <= 0) 
			throw new IllegalArgumentException("Quantidade de linhas inválida.");
		
		paginas = new ArrayList<Pagina>(linhas);
	
		this.tamanho = 0;
		Pagina p;
		for(int i = 0; i < paginas.size(); i++){
			p = new Pagina();
			paginas.add(p);
			this.tamanho += p.getTam();  
		}
	}
}
