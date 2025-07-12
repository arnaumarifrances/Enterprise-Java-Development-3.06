package com.example.taskmanager.controller;

import com.example.taskmanager.model.*;
import com.example.taskmanager.repository.ContactRepository;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {

    private final TaskRepository taskRepository;
    private final ContactRepository contactRepository;

    public DemoController(TaskRepository taskRepository, ContactRepository contactRepository) {
        this.taskRepository = taskRepository;
        this.contactRepository = contactRepository;
    }

    // Crear BillableTask
    @PostMapping("/billable-task")
    public BillableTask createBillableTask(@RequestBody BillableTask task) {
        return taskRepository.save(task);
    }

    // Crear InternalTask
    @PostMapping("/internal-task")
    public InternalTask createInternalTask(@RequestBody InternalTask task) {
        return taskRepository.save(task);
    }

    // Obtener todas las tareas
    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Crear Contact
    @PostMapping("/contact")
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    // Obtener todos los contactos
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
