package com.biconsumer;

import java.util.Date;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierSpecializationDemo {
	  static String product = "Android";
	  static double price = 659.50;
	   
	    public static void main(String[] args) {
	        
	        BooleanSupplier boolSupplier = () -> product.length() == 10;
	        IntSupplier intSupplier = () -> product.length() - 2;
	        DoubleSupplier doubleSupplier = () -> price -20;
	        LongSupplier longSupplier = () -> new Date().getTime();
	        Supplier<String> supplier = () -> product.toUpperCase();
	        
	        
	        System.out.println(boolSupplier.getAsBoolean());//false
	        System.out.println(intSupplier.getAsInt());//5
	        System.out.println(doubleSupplier.getAsDouble());//639.5
	        System.out.println(longSupplier.getAsLong());// 1581187440978 (it depends on current time)
	        System.out.println(supplier.get());//ANDROID
	        
	    }
	}