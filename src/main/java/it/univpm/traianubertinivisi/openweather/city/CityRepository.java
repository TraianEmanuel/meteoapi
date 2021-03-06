package it.univpm.traianubertinivisi.openweather.city;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface CityRepository extends CrudRepository<DbCity, Integer> {
	
	List<DbCity> findByName(String[] criteria);
	
}
