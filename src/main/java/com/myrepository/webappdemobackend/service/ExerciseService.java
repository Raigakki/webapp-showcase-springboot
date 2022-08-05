package com.myrepository.webappdemobackend.service;

import com.myrepository.webappdemobackend.entity.model.ResistanceExercise;
import com.myrepository.webappdemobackend.entity.response.ExerciseResponse;
import org.springframework.stereotype.Service;

import java.util.*;

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

    public ExerciseResponse getHighestResistentNumber(String inputLimit) {
        ExerciseResponse exerciseResponse = new ExerciseResponse();
        ResistanceExercise resistanceExercise = new ResistanceExercise();
        try {
            Integer limit = Integer.valueOf(inputLimit);
            // TODO implementare eccezione perzonalizzata?
            if (limit < 0) throw new Exception();
            resistanceExercise.setResistanceAssociated(0);
            resistanceExercise.setConsideredNumber(0);
            for (int i = 0; i <= limit; i++) {
                int resistenzaIterazioneAttuale;
                resistenzaIterazioneAttuale = Integer.parseInt(getResistenza(String.valueOf(i)));
                if (resistenzaIterazioneAttuale >= resistanceExercise.getResistanceAssociated()) {
                    resistanceExercise.setConsideredNumber(i);
                    resistanceExercise.setResistanceAssociated(resistenzaIterazioneAttuale);
                }
            }
        }
        catch (Exception e) {
            exerciseResponse.setErrorFlag(true);
            exerciseResponse.setErrorMessage(
                    "Input number must be a positive Java-Readable Integer " +
                    "(Min Value = 0, Max Value = " + Integer.MAX_VALUE + ")");
            return exerciseResponse;
        }
        exerciseResponse.setResistanceExercise(resistanceExercise);
        return exerciseResponse;
    }

    public Set<Integer> getFrequente(int[] numsArray) {
        int count;
        Set<Integer> numsPiuFrequenti = new HashSet<>();
        int frequenzaMax = 0;
        for (int i = 0; i < numsArray.length; i++) {
            if (numsPiuFrequenti.contains(numsArray[i]))
                continue;
            count = 0;
            for (int j = 0; j < numsArray.length; j++) {
                if (numsArray[i] == numsArray[j])
                    count++;
            }
            if (count > frequenzaMax) {
                numsPiuFrequenti.clear();
                numsPiuFrequenti.add(numsArray[i]);
                frequenzaMax = count;
            }
            if (count == frequenzaMax) {
                numsPiuFrequenti.add(numsArray[i]);
            }
        }
        return numsPiuFrequenti;
    }

    public List<String> getFrequenti(int[] numsArray, int limit) {
        int count;
        Map<String, Integer> frequenzaNums = new HashMap<>();
        for (int i = 0; i < numsArray.length; i++) {
            if (frequenzaNums.containsKey(numsArray[i]))
                continue;
            count = 0;
            for (int j = 0; j < numsArray.length; j++) {
                if (numsArray[i] == numsArray[j])
                    count++;
            }
            frequenzaNums.put(String.valueOf(numsArray[i]),count);
        }

        List<String> numPiuFrequentiDesc = new ArrayList<>();

        frequenzaNums.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> numPiuFrequentiDesc.add(x.getKey()));

        List<String> numPiuFrequentiRichiesti = new ArrayList<>();
        for (int i = numPiuFrequentiDesc.size() - 1; i > numPiuFrequentiDesc.size() - 1 - limit; i--)
            numPiuFrequentiRichiesti.add(numPiuFrequentiDesc.get(i));
        return numPiuFrequentiRichiesti;
    }

}
