package mx.com.escuelita.escuelitarest.resource.impl;

import java.util.List;
import java.util.Optional;
import mx.com.escuelita.escuelitarest.entity.Carrera;
import mx.com.escuelita.escuelitarest.resource.Resource;
import mx.com.escuelita.escuelitarest.service.CarreraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
@RestController
@RequestMapping("/carrera")
public class CarreraRestController implements Resource<Carrera> {

  @Autowired
  private CarreraServiceImpl servicio;
  
  @Override
  public List<Carrera> findAll() {
    return servicio.findAll();
  }

  @Override
  public List<Carrera> findAllCustom() {
    return servicio.findAllCustom();
  }

  @Override
  public Optional<Carrera> findById(String id) {
    return servicio.findById(id);
  }

  @Override
  public Carrera add(Carrera t) {
    return servicio.add(t);
  }

  @Override
  public Carrera update(String id, Carrera t) {
    t.setIdCarrera(id);
    return servicio.update(t);
  }

  @Override
  public Carrera delete(String id) {
    Carrera objCarrera = new Carrera();
    objCarrera.setEstadoCarrera(false);
    return servicio.delete(Carrera.builder().idCarrera(id).build());
  }
  
}
