package com.codeclan.example.FilesFolders.repositories;

import com.codeclan.example.FilesFolders.models.Folder;
import com.codeclan.example.FilesFolders.projections.EmbedFilesFolder;
import com.codeclan.example.FilesFolders.projections.EmbedFoldersUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFoldersUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
