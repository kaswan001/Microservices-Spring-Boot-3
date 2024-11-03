package com.manish.school;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FullSchoolResponse {

    private String name ;
    private String email;
    private List<Student> students;
}
