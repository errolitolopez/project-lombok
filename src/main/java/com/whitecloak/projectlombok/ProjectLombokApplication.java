package com.whitecloak.projectlombok;

import com.whitecloak.projectlombok.domain.User;
import com.whitecloak.projectlombok.infrastructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProjectLombokApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjectLombokApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        LocalDate localDate = LocalDate.now();

        User user = new User("John", "Chua", "johnchua@yopmail.com", "09123456789", localDate, true);
        userRepository.save(user);

        userRepository.findAll()
                .stream()
                .forEach(System.out::println);
    }
}