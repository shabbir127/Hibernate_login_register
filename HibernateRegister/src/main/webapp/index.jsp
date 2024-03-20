<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>


<div class="container">
<div class="row">
<div class="col-md-6 offset-mf-3">
<div class="card">
<div class="card-body fs-5">
<p class="fs-3 text-center">Register Page</p>
<%String msg=(String)session.getAttribute("msg");
if(msg != null)
{	%>
 <p class="text-center fs-4"><%=msg %></p>


  <%
}
session.removeAttribute("msg");
%>


<form action="register" method="post">
  <div class="mb-3">
    <label class="form-label">Employee</label>
    <input type="text" class="form-control" name="name">
   
  </div>
  <div class="mb-3">
    <label class="form-label">Department</label>
    <input type="text" class="form-control" name="department" >
    </div>
 <div class="mb-3">
    <label class="form-label">Salary</label>
    <input type="text" class="form-control" name="salary">
    </div>
    <div class="mb-3">
    <label class="form-label">Email</label>
    <input type="email" class="form-control" name="email">
    </div>
    <div class="mb-3">
    <label class="form-label">password</label>
    <input type="password" class="form-control" name="password">
    </div>
  <button type="submit" class="btn btn-primary">Register</button>
</form>



</div>
</div>
</div>
</div>
</div>






<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

</body>
</html>