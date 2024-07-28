package com.javarush.hayriyan.hibernate.dao;
import com.javarush.hayriyan.hibernate.entity.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends GenericDAO<Category>{
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}