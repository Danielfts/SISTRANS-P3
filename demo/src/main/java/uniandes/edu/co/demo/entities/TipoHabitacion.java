package uniandes.edu.co.demo.entities;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TipoHabitacion {

    private Double costo;
    private int capacidad;
    private String tipo;
    private String descripcion;

    public TipoHabitacion(Double costo, int capacidad, String tipo, String descripcion) {
        this.costo = costo;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
}
