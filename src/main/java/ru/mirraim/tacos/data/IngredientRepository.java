package ru.mirraim.tacos.data;

import org.springframework.data.repository.CrudRepository;
import ru.mirraim.tacos.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
