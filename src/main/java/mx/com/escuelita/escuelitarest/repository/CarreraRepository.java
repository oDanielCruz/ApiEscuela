package mx.com.escuelita.escuelitarest.repository;

import java.util.List;
import mx.com.escuelita.escuelitarest.entity.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public interface CarreraRepository extends JpaRepository<Carrera, String> {
  
  @Query("select c from Carrera c where c.estadoCarrera='1'")
  List<Carrera> findAllCustom();
  
}
