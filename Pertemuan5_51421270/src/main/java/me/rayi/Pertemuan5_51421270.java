package me.rayi;

import me.rayi.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Pertemuan5_51421270 implements CommandLineRunner{
    
    @Autowired
    private MahasiswaController mhsController;

    public static void main(String[] args) {
        SpringApplication.run(Pertemuan5_51421270.class, args);
    }
    
    @Override
    public void run(String... args)throws Exception {
        mhsController.tampilkanMenu();
    }
}
