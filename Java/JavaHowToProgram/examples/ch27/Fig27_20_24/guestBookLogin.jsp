<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<!-- Fig. 27.22: guestBookLogin.jsp -->

<%-- page settings --%>
<%@ page errorPage = "guestBookErrorPage.jsp" %>

<%-- beans used in this JSP --%>
<jsp:useBean id = "guest" scope = "page" 
   class = "com.deitel.jhtp6.jsp.beans.GuestBean" />
<jsp:useBean id = "guestData" scope = "request" 
   class = "com.deitel.jhtp6.jsp.beans.GuestDataBean" />

<html xmlns = "http://www.w3.org/1999/xhtml">
<head>
   <title>Guest Book Login</title>
   <style type = "text/css">
      body 
	  { 
         font-family: tahoma, helvetica, arial, sans-serif;
      }
      table, tr, td 
      { 
         font-size: .9em;
         border: 3px groove;
         padding: 5px;
         background-color: #dddddd;
      }
   </style>
</head>
<body>
   <jsp:setProperty name = "guest" property = "*" />
   <% // start scriptlet
      if ( guest.getFirstName() == null || 
           guest.getLastName() == null ||
           guest.getEmail() == null ) 
      {
   %> <%-- end scriptlet to insert fixed template data --%>
         <form method = "post" action = "guestBookLogin.jsp">
            <p>Enter your first name, last name and email
               address to register in our guest book.</p>
            <table>
               <tr>
                  <td>First name</td>
                  <td>
                     <input type = "text" name = "firstName" />
                  </td>
               </tr>
               <tr>
                  <td>Last name</td>
                  <td>
                     <input type = "text" name = "lastName" />
                  </td>
               </tr>
               <tr>
                  <td>Email</td>
                  <td>
                     <input type = "text" name = "email" />
                  </td>
               </tr>
               <tr>
                  <td colspan = "2">
                     <input type = "submit" value = "Submit" />
                  </td>
               </tr>
            </table>
         </form>
   <% // continue scriptlet
      }  // end if
      else 
      {
         guestData.addGuest( guest );
   %> <%-- end scriptlet to insert jsp:forward action --%>
         <%-- forward to display guest book contents --%>
         <jsp:forward page = "guestBookView.jsp" />
   <% // continue scriptlet
      }  // end else
   %> <%-- end scriptlet --%>
</body>
</html>


<!--
 /**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
-->