package com.javaReactJsUploadAndStore.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Clob;

@Entity
@Table(name = "files_from_users")
public class UserFile {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String name;

    private String type;

    @Lob
    private byte [] fileFromUser;

    public UserFile(String fileName, String type, byte [] fileFromUser) {
        this.name = fileName;
        this.type = type;
        this.fileFromUser = fileFromUser;
    }


    public String getFileName() {
        return name;
    }

    public void setFileName(String fileName) {
        this.name = fileName;
    }

    public byte [] getFileFromUser() {
        return fileFromUser;
    }

    public void setFileFromUser(byte [] fileFromUser) {
        this.fileFromUser = fileFromUser;
    }

    public String getId() {
        return id;
    }
}
