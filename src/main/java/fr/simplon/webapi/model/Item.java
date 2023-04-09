package fr.simplon.webapi.model;

import java.sql.Date;

public record Item(int id, Date date, String title, String content, String imageUrl)
{
}
