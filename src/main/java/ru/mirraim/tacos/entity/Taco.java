package ru.mirraim.tacos.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Table
public class Taco {
    @Id
    private Long id;
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    private Timestamp createdAt = Timestamp.valueOf(LocalDateTime.now());

    @NotNull
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
