package uz.pdp.task_2_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_2_2_1.entity.OutputProduct;
import uz.pdp.task_2_2_1.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputproduct",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
