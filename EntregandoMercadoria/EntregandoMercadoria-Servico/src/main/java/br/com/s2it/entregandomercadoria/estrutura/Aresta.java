package br.com.s2it.entregandomercadoria.estrutura;

/**
 * Classe das arestas do meu grafo
 * @author paulo.cotta
 *
 */
public class Aresta {

	private Integer peso;
    private Vertice origem;
    private Vertice destino;
    
    
    public Aresta(Vertice v1, Vertice v2){
	    this.peso = 1;
	    this.origem = v1;
	    this.destino = v2;
    }
    
    public void setPeso(Integer novoPeso){
        this.peso = novoPeso;
    }
    
    public Integer getPeso(){
        return peso;
    }
    

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getOrigem() {
        return origem;
    }
	
}