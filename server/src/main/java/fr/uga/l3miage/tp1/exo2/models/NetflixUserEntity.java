package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {
    @Id
    @Column(name = "id")
    private long id ;

    @Column(name = "uuid")
    private String uuid ;

    @Column(name = "lastname")
    private String lastname ;

    @Column(name = "firstname")
    private String firstname ;

    @Column(name = "sex", length = 2)
    @Enumerated(EnumType.ORDINAL)
    private Sex sex ;

    @Column(name = "birth_date")
    private LocalDate birthDate ;

    @OneToOne(mappedBy = "netflix_user")
    private NetflixAccountEntity netflixAccount ;
}
