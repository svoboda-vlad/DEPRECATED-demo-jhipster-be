package svobodavlad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import svobodavlad.service.api.dto.Pet;
import svobodavlad.web.api.PetsApiDelegate;

@Service
public class PetApiDelegateImpl implements PetsApiDelegate {

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit) {
    	var pet = new Pet();
    	pet.setId(123L);
    	pet.setName("my pet");
    	var petList = new ArrayList<Pet>(List.of(pet));
        return ResponseEntity.ok().body(petList);

    }
}
