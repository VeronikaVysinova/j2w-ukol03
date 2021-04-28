package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
@RequestMapping("/")

public class VizitkaController {
  private final List<Vizitka> vizitky;

  public VizitkaController(){
    vizitky = List.of(
            new Vizitka("Dita (Přikrylová) Formánková", "Czechitas z.s.", "Václavské náměstí 837/11", "11000 Praha 1", "dita@czechitas.cz", "+420 800123456", "www.czechitas.cz"),
            new Vizitka("Barbora Bühnová", "Czechitas z.s.", "Václavské náměstí 837/11", "11000 Praha 1", null, "+420 800123456", "www.czechitas.cz"),
            new Vizitka("Monika Ptáčníková", "Czechitas z.s.", "Václavské náměstí 837/11", "11000 Praha 1", "monika@czechitas.cz", "+420 800123456", "www.czechitas.cz"),
            new Vizitka("Mirka Zatloukalová", "Czechitas z.s.", "Václavské náměstí 837/11", "11000 Praha 1", "mirka@czechitas.cz", null, "www.czechitas.cz"),
            new Vizitka("Daniela Ryšavá", null, "Trnava 269", "67401 Trnava", "dani.rysava@gmail.com", null, null)
    );
  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("seznam", vizitky);
    return modelAndView;
  }

  @GetMapping(path = "/detail", params = "id")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("detail", vizitky.get(id));
    return modelAndView;
  }
}
