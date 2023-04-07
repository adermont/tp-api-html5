package fr.simplon.springofsimplon.dao;

import fr.simplon.springofsimplon.model.Item;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ItemDao
{
    List<Item> findAll(int nbItems);
}
