package fr.simplon.webapi;

import fr.simplon.webapi.dao.ItemDao;
import fr.simplon.webapi.model.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WebApiApplicationTests
{

    @Autowired
    ItemDao mItemsManager;

    @Test
    void contextLoads()
    {
        List<Item> allItems = mItemsManager.findAll(5);
        Assertions.assertEquals(5, allItems.size());
    }

}
