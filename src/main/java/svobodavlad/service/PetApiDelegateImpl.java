package svobodavlad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import svobodavlad.service.api.dto.PetDTO;
import svobodavlad.web.api.PetsApiDelegate;

@Service
public class PetApiDelegateImpl implements PetsApiDelegate {

    @Override
    public ResponseEntity<List<PetDTO>> listPets(Integer limit) {
    	var petDTO = new PetDTO();
    	petDTO.setId(123L);
    	petDTO.setName("my pet");
    	var petList = new ArrayList<PetDTO>(List.of(petDTO));
        return ResponseEntity.ok().body(petList);

    }
}
