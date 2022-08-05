package com.myrepository.webappdemobackend.controller;

import com.myrepository.webappdemobackend.WebappDemoBackendApplication;
import com.myrepository.webappdemobackend.service.ExerciseService;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/exercise")
public class ExerciseController {

    private static final Logger logger = LogManager.getLogger(WebappDemoBackendApplication.class);

    @Autowired
    ExerciseService exerciseService;

    @GetMapping(path = "/resistenza/{numeroDaElaborare}")
    // TODO SISTEMARE NOTE CON SPIEGAZIONE
    @ApiOperation(value = "Restituisce la resistenza di un numero in input", notes = "La resistenza di un numero è...")
    public ResponseEntity<String> getResistenza(@PathVariable String numeroDaElaborare) {
        return ResponseEntity.ok(exerciseService.getResistenza(numeroDaElaborare));
    }

    @GetMapping(path = "/resistenza/max/{limiteCalcolo}")
    @ApiOperation(value = "Restituisce il numero con la resistenza più alta calcolato fino al numero in input")
    public ResponseEntity<List<String>> getNumeroPiuResistente(@PathVariable String limiteCalcolo) {
        List<String> numeriPiuResistentiList = exerciseService.getNumeroPiuResistente(limiteCalcolo);
        if (true) {
            // TODO IMPLEMENTARE CORRETTAMENTE UNA BAD REQUEST
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(numeriPiuResistentiList);
    }

    private void logging() {
        // TODO IMPLEMENTARE CORRETTAMENTE UN LOGGER
        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
    }

}
