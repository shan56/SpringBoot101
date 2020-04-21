package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;


@Controller
public class HomeController {

    @RequestMapping
        public String homePage(){
        Scanner kb = new Scanner(System.in);
        kb.nextLine();
        System.out.println();

            return "index";
        }

}
