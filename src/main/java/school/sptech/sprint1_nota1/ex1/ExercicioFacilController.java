package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        for (int i = 0; i < palavra.length()/2; i++){
            palavra = palavra.toLowerCase();
            if(palavra.charAt(i) != palavra.charAt(palavra.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
