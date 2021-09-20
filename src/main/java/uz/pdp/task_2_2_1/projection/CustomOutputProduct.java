package uz.pdp.task_2_2_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_1.entity.Output;
import uz.pdp.task_2_2_1.entity.OutputProduct;
import uz.pdp.task_2_2_1.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Product getProduct();
    double getAmount();
    double getPrice();
    Output getOutput();
}
