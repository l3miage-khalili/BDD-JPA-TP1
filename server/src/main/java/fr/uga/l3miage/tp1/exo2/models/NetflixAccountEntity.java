package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;

@Entity
@Table(name = "netflix_account")
public class NetflixAccountEntity {
    @Id
    @Column(name = "id")
    private long id ;

    @Column(name = "nb_devices")
    private int nbDevices ;

    @Column(name = "typeAccount")
    @Enumerated(EnumType.ORDINAL)
    private TypeAccount typeAccount ;

    @OneToOne
//  @Column(name = "netfilx_user")
    private NetflixUserEntity netflixUser ;

    @Column(name = "uuid_user")
    private String uuidUser ;
}
