package sofkaU.contactbook.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sofkaU.contactbook.domain.Contact;
import sofkaU.contactbook.service.ContactService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class ContactController {

    @Autowired
    private ContactService contact_service;

    @GetMapping(path = "/")
    public String index(Model model){
        Map<String, String> reply = new HashMap<>();
        model.addAttribute("contact_list", reply);
        return "create-contact";
    }

    @GetMapping(path = "/contacts")
    public String listContacts(Model model){
        var contacts = contact_service.list();
        model.addAttribute("contact_list", contacts);
        return "contact-list";
    }

    @GetMapping(path = "/contacts/{id}")
    public String getById(Model model, Contact contact){
        var cont = contact_service.findContact(contact);
        model.addAttribute("contact", cont.get());
        return "detail";
    }

    @GetMapping(path = "/contacts/edit/{id}")
    public String getContact(Model model, Contact contact){
        var cont = contact_service.findContact(contact);
        model.addAttribute("contact", cont.get());
        return "edit-contact";
    }

    @PostMapping(path = "/contact")
    public ResponseEntity<Contact> create(@RequestBody Contact contact, Model model){
        try{
            contact_service.save(contact);
            log.info("Contact to create: {}", contact);
            return new ResponseEntity<>(contact, HttpStatus.CREATED);
        }catch (Exception exc){
            log.info(String.valueOf(exc));
        }

        return null;
    }

    @DeleteMapping(path = "/contact/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id){
        log.info("Contact to delete: {}", id);
        contact_service.delete(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PutMapping(path = "/contact/{id}")
    public String update(@RequestBody Contact contact, @PathVariable("id") Long id){
        log.info("User to modify: {}", contact);
        contact_service.update(id, contact);
        return "contact-list";
    }

    @PatchMapping(path = "/contact/name/{id}")
    public ResponseEntity<Contact> updateName(Contact contact, @PathVariable("id") Long id){
        log.info("User to modify name: {}", contact);
        contact_service.updateName(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/phone_number/{id}")
    public ResponseEntity<Contact> updatePhoneNumber(Contact contact, @PathVariable("id") Long id){
        log.info("User to modify phone number: {}", contact);
        contact_service.updatePhoneNumber(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/email/{id}")
    public ResponseEntity<Contact> updateEmail(Contact contact, @PathVariable("id") Long id){
        log.info("User to modify name: {}", contact);
        contact_service.updateEmail(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/birth_date/{id}")
    public ResponseEntity<Contact> updateBirthDate(Contact contact, @PathVariable("id") Long id){
        log.info("User to modify name: {}", contact);
        contact_service.updateBirthDate(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }
}
