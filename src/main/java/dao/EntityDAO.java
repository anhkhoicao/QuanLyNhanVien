/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;

/**
 *
 * @author Fixluck
 * @param <E>: Entity
 * @param <Key>: ID của các class
 */
abstract public class EntityDAO<E, Key> {

    abstract public void insert(E entity);

    abstract public void update(E entity);

    abstract public void delete(Key id);

    abstract public List<E> selectAll();

    abstract public E selectByID(Key id);

    abstract public List<E> selectBySql(String sql, Object...args);

}
