package com.example.lista;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChoresController {



    @PostMapping("/chores")
    public static void newTask(@RequestBody Task newChore) {
        // return repository.save(newTask());
        System.out.println("Task añadida correctamente");

    }




}
