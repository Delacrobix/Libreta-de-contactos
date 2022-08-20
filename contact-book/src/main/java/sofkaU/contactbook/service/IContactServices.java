package sofkaU.contactbook.service;

import sofkaU.contactbook.domain.Contact;
import java.util.List;
import java.util.Optional;

public interface IContactServices {

    public List<Contact> list();

    public Contact save(Contact contact);

    public Contact update(Long id, Contact contact);

    public void delete(Long id);

    public Optional<Contact> findContact(Contact contact);
}
