package sensedia.com.projectpdi.application.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import sensedia.com.projectpdi.application.dto.ClientDTO;
import sensedia.com.projectpdi.infrastructure.entities.Client;

@Mapper(componentModel = "spring")
public abstract class ClientMapper {

    public static final ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    public abstract Client clientDTOToClient(ClientDTO clientDTO);
}
