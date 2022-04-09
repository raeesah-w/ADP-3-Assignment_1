package za.ac.cput.util;

import java.util.UUID;

public class Helper {
    //====================================================
    //Marvin Hope
    //Generating a primary key for StudentID
    public static String generateStudentID() {
        return UUID.randomUUID().toString();
    }
    //Generating a primary key for ParentID
    public static String generateParentID() {
        return UUID.randomUUID().toString();
    }
    //====================================================

    //Raeesah Williams
    //SubjectDepartment primary key
    public static String generateSubDeptID()
    {
        return UUID.randomUUID().toString();
    }

    // Transport primary key
    public static String generateTransportID()
    {
        return UUID.randomUUID().toString();
    }

    public static boolean isNotEmpty(String s){

        return(s== null || s.isEmpty()|| s.equals("")|| s.equalsIgnoreCase("null"));
    }






}
