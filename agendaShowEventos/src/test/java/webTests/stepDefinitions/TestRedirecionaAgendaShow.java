package webTests.stepDefinitions;

import org.junit.Before;
import org.junit.Test;
import webTests.page.PageAgendaShow;

import static webTests.BaseTest.getDriver;

public class TestRedirecionaAgendaShow {

    PageAgendaShow pageAgendaShow = new PageAgendaShow();

    @Before
    public void setUp() throws Exception {
        getDriver();
        pageAgendaShow.clicarNovaAgenda();
    }

    @Test
    public void acessaAgendaShow(){
        pageAgendaShow.validarUrl();
    }
}
