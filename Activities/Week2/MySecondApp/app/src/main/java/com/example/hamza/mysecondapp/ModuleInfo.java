package com.example.hamza.mysecondapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hamza on 02/10/15.
 */
public class ModuleInfo {

    List<String> getCourses(String type){
        // Constuct array list
        List<String> courses = new ArrayList<String>();

        // if the type equals the string computer science
        if(type.equals("Computer Science")) {
            // Add these
            courses.add("A degree in computer science will...");
            courses.add("Modules: MAD, IT, ...");
        } else if (type.equals("Creative Computing")){
            courses.add("A degree in creative computing will ...");
            courses.add("Modules: EAD, 3DGD, ...");
        } else if (type.equals("Mobile Computing")){
            courses.add("A degree in mobile computing will ...");
            courses.add("Modules: AI, RC, ...");
        }else{
            courses.add("Course not found");
        }
        return courses;
    }

}
