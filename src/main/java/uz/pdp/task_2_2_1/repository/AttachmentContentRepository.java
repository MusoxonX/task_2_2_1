package uz.pdp.task_2_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task_2_2_1.entity.AttachmentContent;

import java.util.Optional;


public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
    Optional<AttachmentContent> findByAttachmentId(Integer id);
}
