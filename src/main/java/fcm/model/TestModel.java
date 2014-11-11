package fcm.model;

import fcm.model.converter.LocalDateConverter;
import fcm.model.converter.LocalDateTimeConverter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "TEST_MODEL")
public class TestModel extends AbstractPersistable<Long> {

    @Convert(converter = LocalDateConverter.class)
    @Column(name = "JUST_DATE")
    private LocalDate localDate;

    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "JUST_DATE_AND_TIME")
    private LocalDateTime localDateTime;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

}
