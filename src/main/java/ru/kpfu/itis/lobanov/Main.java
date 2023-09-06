package ru.kpfu.itis.lobanov;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HttpClientR clientR = new HttpClientR(args[0]);
        Map<String, String> params = new HashMap<>();
        params.put("userId", "2");
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(clientR.get("https://jsonplaceholder.typicode.com/posts", params));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
