package mx.com.escuelita.escuelitarest.service;

import java.util.List;
import java.util.Optional;
import mx.com.escuelita.escuelitarest.entity.Carrera;
import mx.com.escuelita.escuelitarest.repository.CarreraRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
@Service
public class CarreraServiceImpl implements IService<Carrera> {

  @Autowired
  private CarreraRepository repositorio; 
  
  @Override
  public List<Carrera> findAll() {
    return repositorio.findAll();
  }

  @Override
  public List<Carrera> findAllCustom() {
    return repositorio.findAllCustom();
  }

  @Override
  public Optional<Carrera> findById(String id) {
    return repositorio.findById(id);
  }

  @Override
  public Carrera add(Carrera t) {
    return repositorio.save(t);
  }

  @Override
  public Carrera update(Carrera t) {
    Carrera objCarrera = repositorio.getReferenceById(t.getIdCarrera());
    BeanUtils.copyProperties(t, objCarrera);
    return repositorio.save(objCarrera);
  }

  @Override
  public Carrera delete(Carrera t) {
    Carrera objCarrera = repositorio.getReferenceById(t.getIdCarrera());
    objCarrera.setEstadoCarrera(false);
    return repositorio.save(objCarrera);
  }
  
}
