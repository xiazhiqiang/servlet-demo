package com.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;

@WebServlet(urlPatterns = { "/person" })
public class PersonController extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Set the content type of the HTTP response to "application/json"
    JSONObject json = new JSONObject();
    json.put("firstName", "John");
    json.put("lastName", "Doe");
    json.put("age", 30);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");

    // Write the JSON string to the response output stream
    PrintWriter out = response.getWriter();
    out.print(json.toString());
    out.flush();
  }
}
