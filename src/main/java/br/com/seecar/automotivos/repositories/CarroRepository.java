package br.com.seecar.automotivos.repositories;

import br.com.seecar.automotivos.models.CarrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarroRepository extends JpaRepository<CarrosModel, UUID> {
}
