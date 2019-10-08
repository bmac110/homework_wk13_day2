package com.codeclan.example.FilesFolders;

import com.codeclan.example.FilesFolders.models.User;
import com.codeclan.example.FilesFolders.repositories.FileRepository;
import com.codeclan.example.FilesFolders.repositories.FolderRepository;
import com.codeclan.example.FilesFolders.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserFolderFileAndSave(){
		User user = new User("Jimmy");
		userRepository.save(user);
	}

}
