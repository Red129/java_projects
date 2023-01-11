package com.jjt;
/**
 * 用于验证是否为管理员
 */

import java.util.Scanner;

public class VerifyEqual {
    public VerifyEqual() {
    }
    public boolean verify(String Authorized_name, String Authorized_password) {
        System.out.println("请输入用户名:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("请输入密码：");
        String password = sc.next();

        return Authorized_name.equals(name) && Authorized_password.equals(password);

    }

}
