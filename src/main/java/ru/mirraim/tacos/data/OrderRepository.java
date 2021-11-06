package ru.mirraim.tacos.data;

import ru.mirraim.tacos.entity.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
