package com.jjt;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HouseRentApp {
    public static void main(String[] args) throws IOException {

        Manager manager = new Manager();
        InitandSaveManager initandSaveManager = new InitandSaveManager();
        LoginMenu loginMenu = new LoginMenu();
        manager = initandSaveManager.init();//从文本文件中读取管理员账户

        while (true) {

            System.out.println("------首次使用请先进行登录------");

            if (loginMenu.login(manager)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("-----请问是否需要修改管理员密码：(Y/N)-------");
                char reply = sc.next().charAt(0);
                if (reply == 'y' || reply == 'Y') {
                    loginMenu.update_manager(manager);
                    initandSaveManager.save(manager);
                    System.out.println("---------修改成功，已经保存!------------");

                } else {
                    System.out.println("请问是否进入租房管理系统，还是退出程序(Y/N)");
                    char answer = sc.next().charAt(0);
                    if (answer == 'y' || answer == 'Y') {


                        System.out.println("----------加载中-----------");
                        //下一级菜单代码

                        new HouseView().MainMenu();
                        System.out.println("==退出房屋出租系统==");

                    } else {
                        break;
                    }

                }

            } else {
                System.out.println("登录失败！");
            }
        }

    }
}
