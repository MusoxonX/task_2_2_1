package uz.pdp.task_2_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_2_2_1.entity.AttachmentContent;
import uz.pdp.task_2_2_1.projection.CustomAttachmentContent;

import java.util.Optional;

@RepositoryRestResource(path = "attachmentcontent",excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
