package com.standard;

import java.io.PrintWriter;

public interface ServletResponse {
    PrintWriter getWriter();

    void setContentType(String type);



}










