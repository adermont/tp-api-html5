package fr.simplon.springofsimplon.controler;

import fr.simplon.springofsimplon.dao.ItemDao;
import fr.simplon.springofsimplon.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController
{
    ItemDao mItemDao;

    @Autowired
    public ItemController(@Qualifier("itemDaoImpl") ItemDao itemDao) {
        this.mItemDao = itemDao;
    }

    @GetMapping(path="/items", produces = "application/json")
    public List<Item> getItems(@RequestParam(value = "count", required = false, defaultValue = "1") int nbResults){
        return mItemDao.findAll(Math.min(nbResults, 100)); // 100 items max
    }
}
