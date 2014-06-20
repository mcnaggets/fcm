package fcm.repositories;

import fcm.model.FcmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FcmEntityRepository extends JpaRepository<FcmEntity, Long> {
}
