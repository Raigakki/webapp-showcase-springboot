package com.raigakki.webappshowcase.entity.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public abstract class BaseResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean errorFlag;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMessage;

}
