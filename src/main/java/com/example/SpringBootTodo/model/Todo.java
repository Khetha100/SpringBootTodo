package com.example.SpringBootTodo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Todo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;


    private String description;


    private boolean isDone;
}
