package uz.pdp.task_2_2_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_1.entity.Currency;
import uz.pdp.task_2_2_1.entity.Input;
import uz.pdp.task_2_2_1.entity.Supplier;
import uz.pdp.task_2_2_1.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Timestamp getInputdate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getCode();
}
