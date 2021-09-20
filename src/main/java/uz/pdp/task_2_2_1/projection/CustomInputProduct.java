package uz.pdp.task_2_2_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_1.entity.Input;
import uz.pdp.task_2_2_1.entity.InputProduct;
import uz.pdp.task_2_2_1.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();
    Product getProduct();
    double getAmount();
    double getPrice();
    Date getExpireDate();
    Input getInput();
}
