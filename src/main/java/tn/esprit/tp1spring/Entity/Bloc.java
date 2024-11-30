package tn.esprit.tp1spring.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity //via lombok
@Getter //via lombok

@Setter //via lombok
@NoArgsConstructor //constructeur non paramétré via lombok
@AllArgsConstructor //constructeur paramétérer via lombok
@ToString //via lombok
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idBloc;
    String nomBloc;
    Long capaciteBloc;
    //one to many m3a foyer ama tetkteb manytoone

    @ManyToOne
    Foyer foyer;

    //OneToMany M3a el chambre
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloc")
    private Set<Chambre> chambres;
}
