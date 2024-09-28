package org.example;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.example.quanlyphuongtien.GiaoDienQuanLyPhuongTienGiaoThong;
import org.example.useful.ReadFileExcel;

import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        GiaoDienQuanLyPhuongTienGiaoThong giaodien = new GiaoDienQuanLyPhuongTienGiaoThong();
        giaodien.giaodienChinh();

    }
}