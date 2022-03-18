package com.mlr.myshop.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class FileController {

    public void saveFile(MultipartFile file) {
        String filePath = "D:/Users/mlr/myImage/";
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID() + suffix;
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //单文件上传
    @PostMapping("/SingleFileUpload")
    public Map<String, Object> SingleFileUpload(MultipartFile file) {
        Map<String, Object> map = new HashMap<>();
        if (file != null) {
            saveFile(file);
            map.put("上传成功", 200);
        } else {
            map.put("上传失败", null);
        }
        return map;
    }

    //多文件上传
//    @PostMapping("/MultiFileUpload")
//    public Map<String, Object> MultiFileUpload(List<MultipartFile> files) {
//        Map<String, Object> map = new HashMap<>();
//        if (files != null && files.size() > 0) {
//            for (MultipartFile file : files) {
//                saveFile(file);
//            }
//            map.put("上传成功", 200);
//        } else {
//            map.put("上传失败", null);
//        }
//        return map;
//    }
}
