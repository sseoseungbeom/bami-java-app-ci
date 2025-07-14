package one.bami.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class VulnerableExample {
    public static void main(String[] args) {
        String userInput = "'; DROP TABLE users; --"; // SQL Injection

        // ☠ 하드코딩된 비밀번호
        String password = "pw12345";

        try {
            // ☠ 하드코딩된 DB URL
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", password);
            Statement stmt = conn.createStatement();

            // ☠ SQL Injection 위험
            String query = "SELECT * FROM users WHERE name = '" + userInput + "'";
            stmt.execute(query);

            // ☠ 리소스 누수 가능성 (close 안함)
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ☠ 의미 없는 if 조건문 (코드 냄새)
        if (false) {
            System.out.println("Unreachable code");
        }

        // ☠ 불필요한 null 할당
        String unused = null;
    }
}

