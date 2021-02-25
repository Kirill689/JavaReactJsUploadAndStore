package com.javaReactJsUploadAndStore.service;

import com.javaReactJsUploadAndStore.entity.UserFile;
import com.javaReactJsUploadAndStore.repo.USerFileDBRepository;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserFileDBService {


    @Autowired
    private USerFileDBRepository uSerFileDBRepository;

    public UserFileDBService(USerFileDBRepository uSerFileDBRepository) {
        this.uSerFileDBRepository = uSerFileDBRepository;
    }

    public UserFile storeService (MultipartFile file) throws IOException {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        //Any operations with stream or string that required in business logic
        String doSomthingWithThisData = IOUtils.toString(file.getInputStream(), StandardCharsets.UTF_8);

        UserFile fileDB = new UserFile(fileName, file.getContentType(), file.getBytes());

        return uSerFileDBRepository.save(fileDB);
    }



}
