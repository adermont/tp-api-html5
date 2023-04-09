package fr.simplon.webapi.controler;

import fr.simplon.webapi.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Contrôleur Spring MVC : chaque méthode retourne le nom de la vue associée à l'URL demandée.
 */
@Controller
public class WebControler
{
    ItemDao itemDao;

    @Autowired
    public WebControler(ItemDao pItemDao){
        this.itemDao = pItemDao;
    }

    @GetMapping(path = "/authors")
    public String authors(Model model)
    {
        return "authors";
    }

    @GetMapping(path = "/drag-and-drop")
    public String dragAndDrop(Model model)
    {
        return "drag-and-drop";
    }

    @GetMapping(path = "/drag-and-drop-th")
    public String dragAndDropThymeleaf(Model model)
    {
        model.addAttribute("items", itemDao.findAll(3));
        return "drag-and-drop-th";
    }

    @GetMapping(path = "/geolocation")
    public String geolocation(Model model)
    {
        return "geolocation";
    }

    @GetMapping(path = "/session-storage")
    public String sessionStorage(Model model)
    {
        return "session-storage";
    }

    @GetMapping(path = "/web-share")
    public String webShare(Model model)
    {
        return "web-share";
    }
}
