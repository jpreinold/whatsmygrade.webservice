package com.jpreinold.whatsmygrade.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Assignment {
    private String name;
    private String id;
    private double grade;
}
