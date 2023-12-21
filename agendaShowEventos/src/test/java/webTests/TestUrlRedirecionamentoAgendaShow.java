package webTests;

import org.junit.Before;
import org.junit.Test;

import static webTests.BaseTest.getDriver;

public class TestUrlRedirecionamentoAgendaShow {

    PageAgendaShow pageAgendaShow = new PageAgendaShow();

    //@Before
    public void setUp() throws Exception {
        getDriver();
        pageAgendaShow.clicarNovaAgenda();
    }

    //@Test
    public void acessaAgendaShow(){
        pageAgendaShow.validarUrl();
    }
}
