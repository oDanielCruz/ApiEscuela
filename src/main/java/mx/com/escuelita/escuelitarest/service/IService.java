package mx.com.escuelita.escuelitarest.service;

import java.util.List;
import java.util.Optional;

/**
 * @author Oswaldo Daniel Cruz Cruz
 * @param <T> parametro de la Clase
 */
public interface IService<T> {

  public List<T> findAll();
  public List<T> findAllCustom();
  public Optional<T> findById(String id);
  
  public T add(T t);
  public T update(T t);
  public T delete(T t);
  
}
