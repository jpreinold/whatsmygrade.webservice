package com.jpreinold.whatsmygrade.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Course {

    private String name;
    private String id;
    private List<Category> categories;

}
