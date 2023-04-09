package fr.simplon.webapi.dao;

import fr.simplon.webapi.model.Item;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Component
public class ItemDaoImpl implements ItemDao
{
    public Item createItem(int i)
    {
        return new Item(i, new Date(System.currentTimeMillis()), String.format("Item %d", i),
                        String.format("Contenu de l'item %d", i), String.format("img/item%d.png", i));
    }

    public List<Item> findAll(int nbItems)
    {
        List<Item> result = new ArrayList<>();
        for (int i = 0; i < nbItems; i++)
        {
            result.add(createItem(i));
        }
        return result;
    }
}
