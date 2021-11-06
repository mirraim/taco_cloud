package ru.mirraim.tacos.entity;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The @Table annotation is completely optional. By default the object is mapped to a table based
 * on the domain class name. In this case, TacoOrder is mapped to a table named "Taco_Order". If
 * that’s fine for you, then you can leave the @Table annotation off completely or use it without
 * parameters. But if you’d prefer to map it to a different table name, then you can specify the table
 * name as a parameter to @Table
 */
@Data
@Table
public class TacoOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private Timestamp placedAt;

    @NotBlank(message="Delivery name is required")
    private String deliveryName;
    @NotBlank(message="Street is required")
    private String deliveryStreet;
    @NotBlank(message="City is required")
    private String deliveryCity;
    @NotBlank(message="State is required")
    private String deliveryState;
    @NotBlank(message="Zip code is required")
    private String deliveryZip;
    @CreditCardNumber(message="Not a valid credit card number")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
            message="Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
