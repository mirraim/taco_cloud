package ru.mirraim.tacos.data;

import org.springframework.data.repository.CrudRepository;
import ru.mirraim.tacos.entity.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
