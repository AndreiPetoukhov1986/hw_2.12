package com.example.hw212.controller;

import com.example.hw212.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
    public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService=calculatorService;
    }
    @GetMapping
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer a,
                       @RequestParam(value = "num2", required = false) Integer b){
        if(a==null || b==null){
            return "Не передан один из параметров!";
        }
        return a+" + "+b+" = "+calculatorService.plus(a,b);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer a,
                        @RequestParam(value = "num2", required = false) Integer b){
        if(a==null || b==null){
            return "Не передан один из параметров!";
        }
        return a+" - "+b+" = "+calculatorService.minus(a,b);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer a,
                           @RequestParam(value = "num2", required = false) Integer b){
        if(a==null || b==null){
            return "Не передан один из параметров!!!";
        }
        return a+" * "+b+" = "+calculatorService.multiply(a,b);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer a,
                         @RequestParam(value = "num2", required = false) Integer b){
        if(a==null || b==null){
            return "Не передан один из параметров!";
        }
        return a+" / "+b+" = "+calculatorService.divide(a,b);
    }
}

