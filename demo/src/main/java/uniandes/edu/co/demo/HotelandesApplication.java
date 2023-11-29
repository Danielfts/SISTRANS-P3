package uniandes.edu.co.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import uniandes.edu.co.demo.entities.Bar;
import uniandes.edu.co.demo.entities.Habitacion;
import uniandes.edu.co.demo.entities.TipoHabitacion;
import uniandes.edu.co.demo.repository.BarRepository;
import uniandes.edu.co.demo.repository.HabitacionRepository;
import uniandes.edu.co.demo.repository.BarRepository.RespuestaGrupo;

@ComponentScan({"uniandes.edu.co.demo.repository"})
@SpringBootApplication
public class HotelandesApplication  implements CommandLineRunner{

	@Autowired
	private BarRepository barRepository;

	@Autowired
	private HabitacionRepository habitacionRepository;


	public static void main(String[] args) {
		SpringApplication.run(HotelandesApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{

		//INSERT / UPDATE
		barRepository.save(new Bar(101, "Bar de prueba","Cali","Alto",2));
		
		Habitacion h = habitacionRepository.save(new Habitacion(101, "101", null));

		h.setTipoHabitacion(new TipoHabitacion(100.00, 4, "Suite","Una habitacion mela" ));
		habitacionRepository.save(h);

		//Update
		barRepository.aniadirBebidaABar(101, "Bebida de prueba 2", "aperitivo", 10, "diurno", 10);

		//QUERIES
		List<Bar> res = barRepository.buscarPorId(60);

		for(Bar b: res){
			System.out.println(b);
		}
		

		//AGGREGATIONS
		List<RespuestaGrupo> res2 = barRepository.darBaresPorCiudad();

		for(RespuestaGrupo r: res2){
			System.out.println(r.getCiudad());
			System.out.println(r.getCantidad());
		}

	}

}
