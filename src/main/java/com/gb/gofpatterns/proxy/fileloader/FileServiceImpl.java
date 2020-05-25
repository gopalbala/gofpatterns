package com.gb.gofpatterns.proxy.fileloader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileServiceImpl implements FileService {

    @Override
    public File getFile(String name) {
        System.out.println("Loading file from disk " + name);
        try {
            String content = Files.readString(Path.of(name), StandardCharsets.UTF_8);
            File file = new File();
            file.setContent(content);
            file.setFileName(name);
            file.setPath("./");
            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
