package uniandes.edu.co.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.entities.Habitacion;

public interface HabitacionRepository extends MongoRepository<Habitacion, Integer> {
    
    
}
