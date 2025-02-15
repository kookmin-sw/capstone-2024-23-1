package com.example.capstone.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CoordinateInfo {

    private String totalCount;

    @JsonProperty("coordinate")
    private List<Coordinate> coordinate;
}
