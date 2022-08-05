package com.myrepository.webappdemobackend.entity.response;

import com.myrepository.webappdemobackend.entity.model.ResistanceExercise;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ExerciseResponse extends BaseResponse {

    private ResistanceExercise resistanceExercise;

}
