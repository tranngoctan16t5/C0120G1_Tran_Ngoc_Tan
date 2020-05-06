package TSP_va_JSTL.Bai_Tap.Ung_Dung_Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator_Servlet",urlPatterns = "/calculator")
public class Calculator_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          float firstNumber=Float.parseFloat(request.getParameter("first_number"));
          float secondNumber=Float.parseFloat(request.getParameter("second_number"));
          char operator=request.getParameter("operator").charAt(0);

        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result :</h1>");

        try{
            float result=Calculator.calculator(firstNumber,secondNumber,operator);
            writer.println(firstNumber + "" +operator+""+secondNumber+"="+result);

        }catch (Exception ex){
            writer.println("Error: "+ex.getMessage());
        }
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
