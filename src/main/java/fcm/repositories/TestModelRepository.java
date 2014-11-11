package fcm.repositories;

import fcm.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestModelRepository extends JpaRepository<TestModel, Long> {
}
