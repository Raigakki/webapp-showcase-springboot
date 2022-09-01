package com.myrepository.webappdemobackend.entity.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.myrepository.webappdemobackend.entity.model.Videogame;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class VideogameResponse extends BaseResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Videogame> videogameList;

}
