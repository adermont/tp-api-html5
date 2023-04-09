package fr.simplon.webapi.dao;

import fr.simplon.webapi.model.Item;

import java.util.List;

public interface ItemDao
{
    List<Item> findAll(int nbItems);
}
