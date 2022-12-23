package mx.com.escuelita.escuelitarest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Carrera")
@Table(name = "carreras")
public class Carrera implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  @Id
  @Column(name = "id_carrera")
  private String idCarrera;
  
  @Column(name = "nombre_carrera")
  private String nombreCarrera;
  
  @Column(name = "estado_carrera")
  private boolean estadoCarrera;
  
}
