package com.myrepository.webappdemobackend.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExerciseService {

    public String getResistenza(String numeroDaElaborare) {
        try {
            char[] numeroCharArray = String.valueOf(numeroDaElaborare).toCharArray();
            int prod;
            int count = 0;
            do {
                prod = 1;
                for (char c : numeroCharArray) {
                    prod *= Integer.parseInt(String.valueOf(c));
                }
                count++;
                numeroCharArray = String.valueOf(prod).toCharArray();
            } while (prod >= 10);
            return String.valueOf(count);
        } catch (Exception e) {
            return  e.getClass() + "\n" +
                    "Errore durante l'elaborazione dell'input \"" + numeroDaElaborare + "\".\n" +
                    "Inserire un numero intero positivo.";
        }

    }

    public List<String> getNumeroPiuResistente(String limit) {
        // TODO Implementare un logger
        //TODO GESTIRE RETURN FUORI DAL TRY/CATCH
        try {
            int limitNumeric = Integer.parseInt(limit);
            int resistenzaMax = 0;
            int resistenzaIterazioneAttuale;
            List<String> numsMaxRes = new ArrayList<>();
            for (int i = 0; i <= limitNumeric; i++) {
                resistenzaIterazioneAttuale = Integer.parseInt(getResistenza(String.valueOf(i)));
                if (resistenzaIterazioneAttuale > resistenzaMax) {
                    resistenzaMax = resistenzaIterazioneAttuale;
                    numsMaxRes.clear();
                    numsMaxRes.add(String.valueOf(i));
                } else if (resistenzaIterazioneAttuale == resistenzaMax) {
                    numsMaxRes.add(String.valueOf(i));
                }
            }
            return numsMaxRes;
        } catch (Exception e) {
            return List.of(e.getClass().toString(),
                    "Errore durante l'elaborazione dell'input '" + limit + "'. Inserire un numero intero positivo.");
        }
    }

}
