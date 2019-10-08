package com.codeclan.example.FilesFolders.projections;

import com.codeclan.example.FilesFolders.models.Folder;
import com.codeclan.example.FilesFolders.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFoldersUser", types = Folder.class)
public interface EmbedFoldersUser {

    String getTitle();
    User getUser();
}
