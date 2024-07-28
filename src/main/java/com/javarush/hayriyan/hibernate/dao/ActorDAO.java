package com.javarush.hayriyan.hibernate.dao;

import com.javarush.hayriyan.hibernate.entity.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO<Actor>{
    public ActorDAO(SessionFactory sessionFactory){
        super(Actor.class,sessionFactory);
    }

}
