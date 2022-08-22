package sensedia.com.projectpdi.application.usecase;

import org.hibernate.exception.DataException;
import org.springframework.stereotype.Service;
import sensedia.com.projectpdi.application.assembler.ClientAssembler;
import sensedia.com.projectpdi.application.dto.ClientDTO;
import sensedia.com.projectpdi.infrastructure.entities.Client;
import sensedia.com.projectpdi.interfaceAdapters.gateway.ClientGateway;


import java.sql.SQLException;
import java.util.Objects;

@Service
public class ClientUseCase {

    private final ClientAssembler clientAssembler;
    private final ClientGateway clientGateway;


    public ClientUseCase(ClientAssembler clientAssembler, ClientGateway clientGateway) {
        this.clientAssembler = clientAssembler;
        this.clientGateway = clientGateway;
    }

    public Integer create(ClientDTO clientDTO) {
        Client client = clientAssembler.clientDTOToClient( clientDTO);
        validClient(client);
        client = clientGateway.create(client);
        return client.getId();
    }

    public void validClient(Client client){
        Client clientDb = clientGateway.findClientByCPF(client.getCPF());
        if (client.getCPF() != null) {
            if (Objects.equals(clientDb.getCPF(), client.getCPF())) {
                throw new DataException("Cliente ja cadastrado!", new SQLException());
            }
        }
    }
}
