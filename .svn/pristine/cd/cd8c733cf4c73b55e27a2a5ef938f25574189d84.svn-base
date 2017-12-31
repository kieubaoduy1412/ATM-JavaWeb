<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.*, java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/demo.css">
<link rel="stylesheet" href="resources/css/footer.css">

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

<link href="http://fonts.googleapis.com/css?family=Cookie"
	rel="stylesheet" type="text/css">
</head>
<body>
	<footer class="footer-basic-centered">

		<p class="footer-company-motto">The ATM System</p>

		<p class="footer-company-name">
			<%
				String fileName = "WEB-INF/app-version.txt";
				InputStream ins = application.getResourceAsStream(fileName);
				try {
					if (ins == null) {
						response.setStatus(response.SC_NOT_FOUND);
					} else {
						BufferedReader br = new BufferedReader((new InputStreamReader(ins)));
						String data;
						while ((data = br.readLine()) != null) {
							out.println(data + "<br>");
						}
					}
				} catch (IOException e) {
					out.println(e.getMessage());
				}
			%>
		</p>

		<p class="footer-links">
			<a href="">Home</a> · <a href="">Help</a> · <a href="">Contact</a>
		</p>

		<p class="footer-company-name">Hitachi Consulting DNB &copy; 2016</p>

	</footer>
	<%-- 	<%
		BufferedReader reader = new BufferedReader(new FileReader("/WEB-INF/app.txt"));
		StringBuilder sb = new StringBuilder();
		String line;

		while ((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
		out.println(sb.toString());
	%> --%>


</body>

</html>
