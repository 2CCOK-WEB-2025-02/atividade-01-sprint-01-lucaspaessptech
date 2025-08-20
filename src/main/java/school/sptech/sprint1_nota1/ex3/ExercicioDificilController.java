package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        if(n <= 0){
            ExercicioDificilResponse resposta = new ExercicioDificilResponse(0, 0);
            return resposta;
        }
        if(n == 1){
            ExercicioDificilResponse resposta = new ExercicioDificilResponse(1, 1);
            return resposta;

        }
        List<Integer> sequencia = new ArrayList<>();
        sequencia.add(0);
        sequencia.add(1);
        int soma = 1;
        int termoAtual= 0;
        for (int i = 2; i <= n; i++){
            sequencia.add(sequencia.get(i-2)+sequencia.get(i-1));
            termoAtual = sequencia.get(i);
            soma+=termoAtual;
        }
        ExercicioDificilResponse resposta = new ExercicioDificilResponse(termoAtual, soma);
        return resposta;
    }
}
