package com.epam.mjc.nio;

import java.io.File;
import java.nio.file.Files;


public class FileReader {



    public Profile getDataFromFile(File file){
            try {
                Files.readAllLines(file.toPath());
                String [] volume = Files.readString(file.toPath()).split(": |\n");
                String name1 = volume[1];
                int age1 = Integer.parseInt(volume[3]);
                String mail1 = volume[5];
                Long phone1 = Long.parseLong(volume[7]);
                return new Profile(name1, age1, mail1, phone1);
            } catch (Exception e) {
                e.printStackTrace();
            }


        return new Profile();}}


