package revise;

import java.util.ArrayList;

public class Splitaq {

	public static void main(String[] args) {
		  String str = "This program splits a string based on space";
	        String[] tokens = str.split(" ");
	        for(String s:tokens){
	            System.out.println(s);
	        }
	        str = "This     program  splits a string based on space";
	        tokens = str.split("\\s+");
	    }
	}


