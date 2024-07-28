package com.javarush.hayriyan.hibernate.dao;
import com.javarush.hayriyan.hibernate.entity.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends GenericDAO <FilmText>{
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
