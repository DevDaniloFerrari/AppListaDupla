package tests;

import applistadupla.ListaDupla;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListaDuplaTest {

    private ListaDupla listaDupla;

    @Before
    public void inicializarTest() {
        listaDupla = new ListaDupla();
    }

    @Test
    public void testListarDoInicioParaOFim() {
        listaDupla.inserirNoInicio(1);
        listaDupla.inserirNoInicio(2);
        listaDupla.inserirNoInicio(3);
        listaDupla.inserirNoInicio(4);

        Assert.assertEquals("4;3;2;1;", listaDupla.mostrarDoInicioParaOFim());

    }

    @Test
    public void testListarDoFimParaOInicio() {
        listaDupla.inserirNoInicio(1);
        listaDupla.inserirNoInicio(2);
        listaDupla.inserirNoInicio(3);
        listaDupla.inserirNoInicio(4);

        Assert.assertEquals("1;2;3;4;", listaDupla.mostrarDoFimParaOInicio());
    }

    @Test
    public void testInserirNoFinal() {
        listaDupla.inserirNoFinal(1);
        listaDupla.inserirNoFinal(2);
        listaDupla.inserirNoFinal(3);
        listaDupla.inserirNoFinal(4);

        Assert.assertEquals("1;2;3;4;", listaDupla.mostrarDoInicioParaOFim());
    }

}
