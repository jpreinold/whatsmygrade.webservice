package com.jpreinold.whatsmygrade.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class Student {

    private String name;
    private String id;
    private List<Course> courses;

}
