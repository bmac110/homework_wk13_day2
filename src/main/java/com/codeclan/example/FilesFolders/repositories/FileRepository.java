package com.codeclan.example.FilesFolders.repositories;

import com.codeclan.example.FilesFolders.models.File;
import com.codeclan.example.FilesFolders.projections.EmbedFilesFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFilesFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
