package sensedia.com.projectpdi.application.assembler;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import sensedia.com.projectpdi.application.dto.ClientDTO;
import sensedia.com.projectpdi.application.mapper.ClientMapper;
import sensedia.com.projectpdi.infrastructure.entities.Client;

@Component
@AllArgsConstructor
public class ClientAssembler {
    public Client clientDTOToClient(ClientDTO clientDTO) {
        return ClientMapper.INSTANCE.clientDTOToClient(clientDTO);
    }
}
