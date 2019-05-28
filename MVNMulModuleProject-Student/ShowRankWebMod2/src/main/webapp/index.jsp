
<%@page  import="com.nt.stud.StudentRankService"%>

  <%  StudentRankService service=new StudentRankService();
       %>
       Rank :::  <%=service.getRank(101) %>
