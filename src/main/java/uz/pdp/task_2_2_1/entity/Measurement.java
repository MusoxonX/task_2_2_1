package uz.pdp.task_2_2_1.entity;
;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.task_2_2_1.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Measurement extends AbsEntity {

}
