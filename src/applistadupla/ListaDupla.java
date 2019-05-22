package applistadupla;

public class ListaDupla {

    No Inicio;
    No Fim;

    public ListaDupla() {
        Inicio = null;
        Fim = null;
    }

    public boolean isEmpty() {
        return (Inicio == null);
    }

    public void inserirNoInicio(int valor) {
        No novo = new No(valor);

        if (isEmpty()) {
            Inicio = Fim = novo;
        } else {
            Inicio.setAnterior(novo);
            novo.setProximo(Inicio);
            Inicio = novo;
        }
    }

    public void inserirNoFinal(int valor) {
        No novo = new No(valor);

        if (isEmpty()) {
            Inicio = Fim = novo;
        } else {
            Fim.setProximo(novo);
            novo.setAnterior(Fim);
            Fim = novo;
        }
    }

    public String mostrarDoInicioParaOFim() {

        No noAuxiliar = Inicio;
        String saida = "";

        while (noAuxiliar != null) {
            saida += noAuxiliar.getDado() + ";";
            noAuxiliar = noAuxiliar.getProximo();
        }

        return saida;
    }

    public String mostrarDoFimParaOInicio() {

        No noAuxiliar = Fim;
        String saida = "";

        while (noAuxiliar != null) {
            saida += noAuxiliar.getDado() + ";";
            noAuxiliar = noAuxiliar.getAnterior();
        }

        return saida;
    }

}
