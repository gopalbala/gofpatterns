package com.gb.gofpatterns.proxy.fileloader;

import java.util.HashMap;
import java.util.Map;

public class ProxyFileServiceImpl implements FileService {

    Map<String, File> files = new HashMap<>();

    FileService fileService = new FileServiceImpl();

    @Override
    public File getFile(String name) {
        if (files.containsKey(name))
            return files.get(name);
        File file = fileService.getFile(name);
        if (file == null)
            return null;
        files.putIfAbsent(file.getFileName(), file);
        return file;
    }
}
