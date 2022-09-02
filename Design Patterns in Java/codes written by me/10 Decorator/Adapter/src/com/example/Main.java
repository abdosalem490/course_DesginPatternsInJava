    package com.example;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    import java.util.Scanner;

    public class Main {



		public static void main(String[] args) {
			MyStringBuilder msb = new MyStringBuilder();
			msb.append("hello").appendLine(" world");
			System.out.println(msb.concat("and this too"));
		}


    }
