package com.javaReactJsUploadAndStore.service;

import com.javaReactJsUploadAndStore.entity.UserFileRow;
import com.javaReactJsUploadAndStore.repo.USerFileDBRepository;
import com.javaReactJsUploadAndStore.utils.ExcelReadHelper;
import com.javaReactJsUploadAndStore.utils.performanceTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class UserFileDBService extends performanceTime {


    @Autowired
    private USerFileDBRepository uSerFileDBRepository;

    public UserFileDBService(USerFileDBRepository uSerFileDBRepository) {
        this.uSerFileDBRepository = uSerFileDBRepository;
    }


    public void storeService (MultipartFile file) throws IOException {

        try {
            List<UserFileRow> tutorials = ExcelReadHelper.excelToUserFileRowObject(file.getInputStream());
            uSerFileDBRepository.saveAll(tutorials);
            finishTime();
            howLongItTakes();
        } catch (IOException e) {
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }

    }


}
