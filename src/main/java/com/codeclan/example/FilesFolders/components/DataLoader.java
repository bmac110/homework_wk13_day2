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
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
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
        User user2 = new User("Jimbolina");
        userRepository.save(user);
        userRepository.save(user2);

        Folder folder = new Folder("Jimmys folder", user);
        folderRepository.save(folder);

        File file = new File("Jimmys file", ".jim", "200kb", folder);
        fileRepository.save(file);

        user.addFolder(folder);
        userRepository.save(user);

        folder.addFile(file);
        folderRepository.save(folder);

        Optional<User> foundUser = userRepository.findById(1L);
    }
}
