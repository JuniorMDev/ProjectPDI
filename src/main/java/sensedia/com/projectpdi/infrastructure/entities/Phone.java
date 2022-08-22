package sensedia.com.projectpdi.infrastructure.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PHONES_CLIENT")
public class Phone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_PHONE")
    private Integer id;

    @Column(name = "DDD_PHONE")
    private String ddd;

    @Column(name = "N_PHONE")
    private String number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "C_CLIENT")
    private Client client;
}
