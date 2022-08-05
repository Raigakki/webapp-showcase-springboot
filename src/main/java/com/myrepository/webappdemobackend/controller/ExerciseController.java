package com.myrepository.webappdemobackend.controller;

import com.myrepository.webappdemobackend.WebappDemoBackendApplication;
import com.myrepository.webappdemobackend.entity.response.ExerciseResponse;
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

    @GetMapping(path = "/resistance/find/{numberToCompute}")
    // TODO SISTEMARE NOTE CON SPIEGAZIONE
    @ApiOperation(value = "Restituisce la resistenza di un numero in input", notes = "La resistenza di un numero è...")
    public ResponseEntity<String> getResistenza(@PathVariable String numberToCompute) {
        return ResponseEntity.ok(exerciseService.getResistenza(numberToCompute));
    }

    @GetMapping(path = "/resistance/max/{limitNumber}")
    @ApiOperation(value = "Restituisce il numero con la resistenza più alta calcolato fino al numero in input")
    public ResponseEntity<ExerciseResponse> getHighestResistentNumber(@PathVariable String limitNumber) {
        // TODO TROVARE STANDARD PER SINTASSI LOG
        logger.info("getHighestResistentNumber({})", limitNumber);
        return ResponseEntity.ok(exerciseService.getHighestResistentNumber(limitNumber));
    }

    private void logging() {
        // TODO RIMUOVERE --> LOGGING EXAMPLE
        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
    }

}
