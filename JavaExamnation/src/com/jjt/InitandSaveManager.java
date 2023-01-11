package com.jjt;

import java.io.*;
import java.nio.Buffer;

public class InitandSaveManager {
    public Manager init() throws IOException {
        //初始化从文本文件中读取管理员信息
        Manager manager = new Manager();
        BufferedReader br = new BufferedReader(new FileReader(new File("manager.txt")));
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] elements = line.split(" ");
            manager = new Manager(elements[0], elements[1]);
        }
        br.close();
        return manager;
    }

    public void save(Manager manager) throws IOException {
        String str = null;
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("manager.txt")));
        bw.write("");//清空上次文本中的账户
        str = manager.getUsername() + " " + manager.getPassword();
        bw.write(str + "\n");
        bw.flush();
        bw.close();
        System.out.println("已经保存！");
    }
}

