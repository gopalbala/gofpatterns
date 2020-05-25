package com.gb.gofpatterns.proxy.fileloader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileServiceImpl implements FileService {

    @Override
    public File getFile(String name) {
        System.out.println("Loading file from disk " + name);
        try {
            URL res = getClass().getClassLoader().getResource("static/" + name);
            String content = Files.readString(Paths.get(res.toURI()), StandardCharsets.UTF_8);
            File file = new File();
            file.setContent(content);
            file.setFileName(name);
            file.setPath(file.getPath());
            return file;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }


}
