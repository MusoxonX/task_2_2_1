package uz.pdp.task_2_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task_2_2_1.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
