package agendaShowEventos.controllers;

import agendaShowEventos.model.Agenda;
import agendaShowEventos.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AgendaController {

    @Autowired
    private AgendaRepository ar;


    @RequestMapping(value = "/agendaShow", method = RequestMethod.GET)
    public String form(){

        return "agenda/formAgenda";
    }

    @RequestMapping(value = "/agendaShow", method = RequestMethod.POST)
    public String form(Agenda agenda){
        ar.save( agenda );
        return "redirect:/agendaShow";
    }

    @RequestMapping("/agendas")
    public ModelAndView listaAgenda(){
        ModelAndView mv= new ModelAndView("indexAgendaShow.html");
        Iterable<Agenda> agenda = ar.findAll();
        mv.addObject( "agendas", agenda );
        return mv;
    }
}
