package uz.pdp.task_2_2_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_1.entity.Client;
import uz.pdp.task_2_2_1.entity.Currency;
import uz.pdp.task_2_2_1.entity.Output;
import uz.pdp.task_2_2_1.entity.Warehouse;

import java.util.Date;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Date getDate();
    Warehouse getWarehouse();
    Client getClient();
    Currency getCurrency();
    String getCode();
}
