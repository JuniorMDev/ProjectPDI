package sensedia.com.projectpdi.infrastructure.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_CLIENT")
    private Integer id;

    @Column(name = "N_CLIENT")
    private String name;

    @Column(name = "DOC_CLIENT")
    private String CPF;

    @Column(name = "END_CLIENT")
    private  String address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "C_PHONE")
    private List<Phone> phones;
}
