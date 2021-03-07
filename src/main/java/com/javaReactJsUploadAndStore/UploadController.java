package com.javaReactJsUploadAndStore;

import com.javaReactJsUploadAndStore.response.ResponseMessage;
import com.javaReactJsUploadAndStore.service.UserFileDBService;
import com.javaReactJsUploadAndStore.utils.performanceTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@CrossOrigin("http://localhost:8081")
public class UploadController extends performanceTime{

    @Autowired
    private UserFileDBService userFileDBService;

    public UploadController(UserFileDBService userFileDBService) {
        this.userFileDBService = userFileDBService;
    }


    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ResponseEntity<ResponseMessage> uploadFile (@RequestParam ("File") MultipartFile file) throws IOException {
        setStartTime();
        String message = "";

        try{
            userFileDBService.storeService(file);
            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));

        } catch (IOException e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }

    }

}
