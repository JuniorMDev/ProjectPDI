package sensedia.com.projectpdi.application.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sensedia.com.projectpdi.infrastructure.entities.Phone;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {



    private Integer id;
    private String name;
    private String CPF;
    private  String address;
    private List<Phone> phones;
}
