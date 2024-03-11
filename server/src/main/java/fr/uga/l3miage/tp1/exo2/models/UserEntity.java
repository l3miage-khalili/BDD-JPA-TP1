package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "id_user")
    private Long idUser ;

    @Column(name = "sso")
    private boolean SSO ;

    @Column(name = "last_connexion")
    private OffsetDateTime lastConnexion ;

    @OneToOne(mappedBy = "user_entity")
    private SessionEntity sessionEntity ;

}
