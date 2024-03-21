package br.com.seecar.automotivos.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB CARROS")
@AllArgsConstructor
public class CarrosModel extends RepresentationModel<CarrosModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCarro;
    private String name;
    private String description;
    private BigDecimal value;
    private String brand;
}
