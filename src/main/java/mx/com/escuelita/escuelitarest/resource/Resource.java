package mx.com.escuelita.escuelitarest.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Oswaldo Daniel Cruz Cruz
 * @param <T>
 */
public interface Resource<T> {
  
  @GetMapping
  public List<T> findAll();
  
  @GetMapping("/custom")
  public List<T> findAllCustom();
  
  @GetMapping("/{id}")
  public Optional<T> findById(@PathVariable String id);
  
  @PostMapping
  public T add(@RequestBody T t);
  
  @PutMapping("/{id}")
  public T update(@PathVariable String id, @RequestBody T t);
  
  @DeleteMapping("/{id}")
  public T delete(@PathVariable String id);
  
}
