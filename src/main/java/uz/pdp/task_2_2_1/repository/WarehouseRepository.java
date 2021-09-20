package uz.pdp.task_2_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_2_2_1.entity.Warehouse;
import uz.pdp.task_2_2_1.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "warehousesList", excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
}
