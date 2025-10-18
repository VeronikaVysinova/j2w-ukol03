package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

    //privatni field obsahujici seznam vizitek
    private final List<Vizitka> seznamVizitek = List.of(
            new Vizitka("Dita (Přykrylová) Formánková","Czechitas z.s.","Václavské náměstí 839/11","110 00 Praha 1",null,"+420 800359859","www.czechitas.cz"),
            new Vizitka("Krasomila Havranová","Havran&spol a.s.","nám. Svobody 138","342 01 Sušice","krasomila@havranaspol.cz","+420 734654321","www.havranaspol.cz"),
            new Vizitka("Jan Lego","Lego production s.r.o. ","Jutská 2779","272 01 Kladno","jan@lego.cz","+420 731759465",null),
            new Vizitka("Emilie Novotná","Cestuj a.s.","Za Piskovnou 1210/2","184 00 Praha-Dolní Chabry","novotna@cestuj.cz",null,null)
            );

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("/seznam");
        //vizitky - klic pod kterym budou data dostupna ve view, seznamVizitek - objekt, ktery chci zobrazit pod klicem vizitky
        modelAndView.addObject("seznamVizitek", seznamVizitek);
        return modelAndView;
    }



   @GetMapping("/seznam/{id}") //zpracovavam pozadavky na adresu localhost:8080/seznam
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("vizitka", seznamVizitek.get(id));
        return modelAndView;
    }
}
