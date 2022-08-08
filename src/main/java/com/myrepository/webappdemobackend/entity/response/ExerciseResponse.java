package com.myrepository.webappdemobackend.entity.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.myrepository.webappdemobackend.entity.model.Resistance;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ExerciseResponse extends BaseResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Resistance resistance;

}
