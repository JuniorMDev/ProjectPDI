package sensedia.com.projectpdi.infrastructure.data.mysql;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sensedia.com.projectpdi.infrastructure.entities.Client;
import sensedia.com.projectpdi.interfaceAdapters.gateway.ClientGateway;
import sensedia.com.projectpdi.interfaceAdapters.repositories.ClientRepository;

@Service
@AllArgsConstructor
public class ClientMySql implements ClientGateway {

    private final ClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client findClientByCPF(String cpf) {
        return clientRepository.findClientByCPF(cpf);
    }

}
