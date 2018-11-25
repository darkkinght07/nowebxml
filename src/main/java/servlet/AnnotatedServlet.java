package servlet;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class AnnotatedServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletOutputStream out = resp.getOutputStream();

        out.write(getMessage().getBytes());
        out.flush();
        out.close();
    }

    private String getMessage() {
        return "Servlet served.";
    }
}
