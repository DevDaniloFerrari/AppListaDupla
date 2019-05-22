package applistadupla;

public class No {

    private final int Dado;
    private No Proximo;
    private No Anterior;

    public No(int Dado) {
        this.Dado = Dado;
        Proximo = null;
        Anterior = null;
    }

    public int getDado(){
        return this.Dado;
    }
    
    public No getProximo() {
        return Proximo;
    }

    public void setProximo(No Proximo) {
        this.Proximo = Proximo;
    }

    public No getAnterior() {
        return Anterior;
    }

    public void setAnterior(No Anterior) {
        this.Anterior = Anterior;
    }
    
    

}
