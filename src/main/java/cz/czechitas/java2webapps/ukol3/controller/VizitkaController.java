package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import cz.czechitas.java2webapps.ukol3.service.VizitkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

    //privatni field obsahujici seznam vizitek nacteny ze servisy, objekt bez toho nemuze vzniknout
    private final VizitkaService vizitkaService;

    //privatni field se naplni tim, ze to dam jako parametr do konstruktoru
    @Autowired //anotace aby Spring vedel, do kteryho konstruktoru ma vlozit co je potreba
    public VizitkaController(VizitkaService vizitkaService) { //IOC - inversion of controlle, neshani tu sluzbu, ale Spring ji najde a dosadi do kontroleru
        this.vizitkaService = vizitkaService;
    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("/seznam");
        //seznamVizitek - klic pod kterym budou data dostupna ve view, seznamVizitek - seznam vsech vizitek
        modelAndView.addObject("seznamVizitek", vizitkaService.getAll());
        return modelAndView;
    }



   @GetMapping("/seznam/{id}") //zpracovavam pozadavky na adresu localhost:8080/seznam
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("vizitka", vizitkaService.getById(id));
        return modelAndView;
    }

    @GetMapping("/nova")
    public ModelAndView novaFormular() {
        ModelAndView modelAndView = new ModelAndView("/novaVizitka");
        //novaVizitka - klic pod kterym budou data dostupna ve view, seznamVizitek - objekt, ktery chci zobrazit pod klicem vizitky
        modelAndView.addObject("novaVizitka", new Vizitka());
        return modelAndView;
    }

    @PostMapping ("/")
    public String pridatVizitku(Vizitka vizitka) {
        vizitkaService.add(vizitka); //prida novou vizitku do seznamu
        return "redirect:/";
    }

    @PostMapping("/smazat") //zpracovavam pozadavky na adresu localhost:8080/smazat
    public String smazat(@RequestParam("id") int id) {
        vizitkaService.deleteById(id);
        return "redirect:/";
    }


}
