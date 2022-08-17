package com.example;

public class Main {

    public static void main(String[] args) {
        // bad method
	    String hello = "hello";
        System.out.println("<p>" + hello + "</p");

        String [] words = {"hello", "world"};
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (String word : words){
            // fluent interface
            sb.append(String.format(" <li>%s</li>\n", word));
        }
        sb.append("</ul>");
        System.out.println(sb);


        // good method
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello")
                .addChild("li", "world");
        System.out.println(builder);
    }
}
