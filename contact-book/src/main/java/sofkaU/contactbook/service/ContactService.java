package sofkaU.contactbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sofkaU.contactbook.dao.ContactDao;
import sofkaU.contactbook.domain.Contact;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService implements IContactServices {

    @Autowired //Para inyectar un ContactoDao
    private ContactDao contact_dao;

    @Override
    @Transactional(readOnly = true)
    public List<Contact> list() {
        return (List<Contact>)contact_dao.findAll();
    }

    @Override
    @Transactional
    public Contact save(Contact contact) {
        return contact_dao.save(contact);
    }

    @Override
    @Transactional
    public Contact update(Long id, Contact contact) {
        contact.setId(id);
        return contact_dao.save(contact);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        contact_dao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Contact> findContact(Contact contact) {
        return contact_dao.findById(contact.getId());
    }

    @Transactional
    public void updateName(Long id, Contact contact){
        contact_dao.updateName(id, contact.getName());
    }

    @Transactional
    public void updatePhoneNumber(Long id, Contact contact){
        contact_dao.updatePhoneNumber(id, contact.getPhone_number());
    }

    @Transactional
    public void updateEmail(Long id, Contact contact){
        contact_dao.updateEmail(id, contact.getEmail());
    }

    @Transactional
    public void updateBirthDate(Long id, Contact contact){
        contact_dao.updateBirthDate(id, contact.getBirth_date());
    }
}
