package com.cc;

import net.lingala.zip4j.exception.ZipException;
import java.util.Scanner;
import net.lingala.zip4j.core.ZipFile;

public class Unzip {
  public static void main(String[] args) {
    unzip(args[0], args[1]);
  }

  public static void unzip(String source, String destination) {
    Scanner sc = new Scanner(System.in);
    String password = null;
    try {
      ZipFile zipFile = new ZipFile(source);
      zipFile.setFileNameCharset("GBK");
      if (zipFile.isEncrypted()) {
        System.out.println("Type the password");
        password = sc.nextLine();
        zipFile.setPassword(password);
      }
      zipFile.extractAll(destination);
    } catch (ZipException e) {
      e.printStackTrace();
    }
  }
}
