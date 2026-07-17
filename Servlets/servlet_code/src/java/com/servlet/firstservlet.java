package com.servlet;
import java.io.IOException;
import javax.servlet.*;

public class firstservlet implements Servlet {

    // life cycle method ;- 
    
    ServletConfig conf;
    @Override
    public void init(ServletConfig conf){
       this.conf=conf;
        System.out.println("creating object....");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing......");
        
    }
    
      @Override
    public void destroy() { 
          System.out.println("Going to destroy servlet object...");
    }
    
    
    // NON Life Cycle Method 
    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }

    

    @Override
    public String getServletInfo() {
        return "this servlet is creaate by rohit wankhade ";
//        System.out.println("");
    }

  
    
}
