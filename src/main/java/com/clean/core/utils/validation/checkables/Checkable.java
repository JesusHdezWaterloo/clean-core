package com.clean.core.utils.validation.checkables;

/**
 * 
 * @author Jorge
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 * @param <T> 
 */
public interface Checkable<T> {

    public boolean check();

    public T getSource();

}
