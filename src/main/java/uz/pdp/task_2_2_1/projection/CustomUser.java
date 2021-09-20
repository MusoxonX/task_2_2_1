package uz.pdp.task_2_2_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_1.entity.User;
import uz.pdp.task_2_2_1.entity.Warehouse;

import java.util.List;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    List<Warehouse> getWarehouse();

    boolean getActive();
}
