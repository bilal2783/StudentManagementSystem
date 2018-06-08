package com.example.bilal.studentmanagementsystem;

public class BlankFieldException extends Exception
{
    BlankFieldException()
    {
        System.out.println("Cannot Leave the"+""+"field blank");
    }
}
