package com.jpreinold.whatsmygrade.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Category {

    private String name;
    private String id;
    private double weight;
    private List<Assignment> assignments;

}
