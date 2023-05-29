package com.Zerodha;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class FbUtilClass {
    public String DataDrivenFb(int rw, int cl) throws EncryptedDocumentException, IOException, IOException {

        FileInputStream file = new FileInputStream(ConfigFile.FbSignUpData);
        Sheet test =  WorkbookFactory.create(file).getSheet("ADD");
        String st = test.getRow(rw).getCell(cl).getStringCellValue();
        return st;

    }
}
