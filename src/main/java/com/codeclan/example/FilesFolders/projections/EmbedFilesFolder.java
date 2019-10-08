package com.codeclan.example.FilesFolders.projections;

import com.codeclan.example.FilesFolders.models.File;
import com.codeclan.example.FilesFolders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFilesFolder", types = File.class)
public interface EmbedFilesFolder {

    String getName();
    String getExtension();
    String getSize();
    Folder getFolder();
}
