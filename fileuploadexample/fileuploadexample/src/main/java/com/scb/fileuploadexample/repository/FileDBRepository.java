package com.scb.fileuploadexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.fileuploadexample.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}