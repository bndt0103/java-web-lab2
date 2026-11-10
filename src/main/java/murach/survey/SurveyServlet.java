package murach.survey;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import murach.business.User;
import murach.business.Survey;

public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String url = "/index.html";

        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }

        if (action.equals("join")) {
            url = "/index.html";
        } 
        else if (action.equals("add")) {
            // Lấy thông tin cá nhân của User
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirth = request.getParameter("dateOfBirth");

            // Lấy thông tin khảo sát Survey
            String heardFrom = request.getParameter("heardFrom");
            String contactVia = request.getParameter("contactVia");

            // Kiểm tra 2 ô Checkbox
            String wantsUpdates = request.getParameter("wantsUpdates");
            if (wantsUpdates == null) {
                wantsUpdates = "No";
            } else {
                wantsUpdates = "Yes";
            }

            String emailNews = request.getParameter("emailNews");
            if (emailNews == null) {
                emailNews = "No";
            } else {
                emailNews = "Yes";
            }

            // 2 đối tượng User và Survey
            User user = new User(firstName, lastName, email, dateOfBirth);
            Survey survey = new Survey(heardFrom, wantsUpdates, emailNews, contactVia);

            // Gửi sang JSP qua request attribute
            request.setAttribute("user", user);
            request.setAttribute("survey", survey);
            url = "/thanks.jsp";
        }

        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
