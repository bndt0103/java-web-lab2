<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="main.css" type="text/css"/>    
</head>
<body>
    <header>
        <img src="images/Murach_image.jpg" alt="Murach Logo">
        <h1>Thanks for filling out our survey!</h1>
        <p>Here is the information that you entered</p>
    </header>

    <section>
        <h2>User Information</h2>
        <label>First Name:</label>
        <span>${user.firstName}</span><br>

        <label>Last Name:</label>
        <span>${user.lastName}</span><br>

        <label>Email:</label>
        <span>${user.email}</span><br>

        <label>Date of Birth:</label>
        <span>${empty user.dateOfBirth ? 'Not provided' : user.dateOfBirth}</span><br>

        <h2>Survey Responses</h2>
        <label>Heard From:</label>
        <span>${survey.heardFrom}</span><br>

        <label>Wants Updates:</label>
        <span>${survey.wantsUpdates}</span><br>

        <label>Email News:</label>
        <span>${survey.emailNews}</span><br>

        <label>Contact Via:</label>
        <span>${survey.contactVia}</span><br>

        <p class="return-text">To enter another survey, click on the Back button in your browser or the Return button shown below.</p>

        <form action="survey" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return" id="return">
        </form>
    </section>

    <footer>
        <p>&copy; 2026 Mike Murach & Associates, Inc.</p>
    </footer>
</body>
</html>
