package uz.pdp.task_2_2_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_1.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
