package com.javaReactJsUploadAndStore.repo;

import com.javaReactJsUploadAndStore.entity.UserFileRow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface USerFileDBRepository extends JpaRepository <UserFileRow, Long> {

}
