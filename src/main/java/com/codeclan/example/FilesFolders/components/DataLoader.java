package com.codeclan.example.FilesFolders.components;

import com.codeclan.example.FilesFolders.models.File;
import com.codeclan.example.FilesFolders.models.Folder;
import com.codeclan.example.FilesFolders.models.User;
import com.codeclan.example.FilesFolders.repositories.FileRepository;
import com.codeclan.example.FilesFolders.repositories.FolderRepository;
import com.codeclan.example.FilesFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User user = new User("Jimmy");
        userRepository.save(user);

        Folder folder = new Folder("Jimmys folder", user);
        folderRepository.save(folder);

        File file = new File("Jimmys file", ".jim", "200kb", folder);
        fileRepository.save(file);
    }
}
