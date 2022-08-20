package sofkaU.contactbook.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import sofkaU.contactbook.domain.Contact;

import java.util.Date;

public interface ContactDao extends CrudRepository<Contact, Long>{

    @Modifying
    @Query("update Contact cont set cont.name = :name where cont.id = :id")
    public void updateName(
            @Param(value = "id") Long id,
            @Param(value = "name") String name
    );

    @Modifying
    @Query("update Contact cont set cont.phone_number = :phone_number where cont.id = :id")
    public void updatePhoneNumber(
            @Param(value = "id") Long id,
            @Param(value = "phone_number") String phone_number
    );

    @Modifying
    @Query("update Contact cont set cont.email = :email where cont.id = :id")
    public void updateEmail(
            @Param(value = "id") Long id,
            @Param(value = "email") String email
    );

    @Modifying
    @Query("update Contact cont set cont.birth_date = :birth_date where cont.id = :id")
    public void updateBirthDate(
            @Param(value = "id") Long id,
            @Param(value = "birth_date") Date birth_date
    );
}
