package uniandes.edu.co.demo.modelo;

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
     * 
     */
    @Id
    private int id;

    
}
