package sikim;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pacientes", path = "pacientes")
public interface PacienteRepository extends MongoRepository<Paciente, String> {

	List<Paciente> findByApellido(@Param("apellido") String apellido);

}