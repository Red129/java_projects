package com.jjt;

import java.util.Scanner;

/**
 * 登录菜单，首次登录用于调用验证类，来验证是否为管理员
 * 验证成功后，可以继续选择是否更改管理员密码
 */
public class LoginMenu {
    VerifyEqual verifyEqual = new VerifyEqual();
//    public static void main(String[] args) {
////      测试代码
//        Manager manager = new Manager();
//
//         LoginMenu p = new LoginMenu();
//         p.update_manager(manager);
//    }

    public boolean login(Manager manager) {

        boolean flag = false;
        int j = 3;//有三次登录机会
        for (int i = 0; i < 3; i++) {
            if (verifyEqual.verify(manager.getUsername(), manager.getPassword())) {
                //如果登录成功则退出尝试
                flag = true;
                System.out.println("----------登录成功！-----------");
                break;
            } else {
                j--;
                System.out.println("登录失败，还能进行" + j + "次尝试");
            }
        }
        if (!flag) {
            System.out.println("-----登录超出限制次数，请过一段时间后重试！------");
        }

        return flag;
    }
    public void update_manager(Manager manager) {
        /**
         * 修改用户密码，得首先登录成功后才能修改
         * 也即调用login成功返回true后才能进行如下操作
         */
        System.out.println("当前用户信息如下：");
        System.out.println("用户名：" + manager.getUsername() + ";" + "当前用户密码如下：" + manager.getPassword());
        String update_name;
        String update_password;
        System.out.println("请输入要修改为的用户名:");
        Scanner sc = new Scanner(System.in);
        update_name = sc.next();

        while (true) {
            System.out.println("请输入您的密码：");
            update_password = sc.next();
            System.out.println("请再次输入您的密码：");
            if (update_password.equals(sc.next())) {
                break;
            } else {
                System.out.println("输入的两次密码不匹配，请重新输入您的密码");
            }
        }

        manager.setUsername(update_name);
        manager.setPassword(update_password);

        System.out.println("修改成功!");

    }
}
