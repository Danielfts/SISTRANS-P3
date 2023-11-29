package uniandes.edu.co.demo.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Document(collection="habitaciones")
@ToString
@Data
public class Habitacion {
    /* 
     * Costo
     * Capacidad
     * Numero
     * Tipo
     * asdasdkjlf
     * 
     */
    @Id
    private int id;
    private String numero;
    private TipoHabitacion tipoHabitacion;

    public Habitacion(int id, String numero, TipoHabitacion tipoHabitacion) {
        this.id = id;
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
    }
}
