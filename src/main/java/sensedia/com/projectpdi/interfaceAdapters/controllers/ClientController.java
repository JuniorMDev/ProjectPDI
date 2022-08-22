package sensedia.com.projectpdi.interfaceAdapters.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sensedia.com.projectpdi.application.dto.ClientDTO;
import sensedia.com.projectpdi.application.dto.DetailDTO;
import sensedia.com.projectpdi.application.usecase.ClientUseCase;

import java.net.URI;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final ClientUseCase clientUseCase;

    private static final String SUCCESS_MESSAGE = "Sucesso";

    @PostMapping("")
    public ResponseEntity<DetailDTO> create(
            @RequestBody ClientDTO clientDTO ) {
                return ResponseEntity.created(URI.create( "/client/" + clientUseCase.create(clientDTO)))
                        .body(DetailDTO.builder()
                                .detail("Cliente Cadastrado com sucesso!")
                                .status(HttpStatus.CREATED.value())
                                .title(SUCCESS_MESSAGE)
                                .build());
    }

}
