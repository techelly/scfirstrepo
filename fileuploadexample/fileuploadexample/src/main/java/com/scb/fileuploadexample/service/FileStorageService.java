package com.scb.fileuploadexample.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

import com.scb.fileuploadexample.model.FileDB;

public interface FileStorageService {
	public FileDB store(MultipartFile file,Integer custId) throws IOException ;
	  public FileDB getFile(String id) ;
	  public Stream<FileDB> getAllFiles();
}
