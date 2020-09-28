<html>
<body>
<h2>Hi Niru</h2>

<form>
   <label for="fname">First name:</label>
  <input type="text" id="fname" name="fname"><br><br>
  <label for="lname">Last name:</label>
  <input type="text" id="lname" name="lname"><br><br>
  <label for="lname">Age:</label>
  <input type="text" id="age" name="age"><br><br>
  <input type="submit" value="Submit" onclick= "javascript:saveStd()">
</form>
</body>
<script>
 function saveStd(){
   StudentRepository repo;
   Student std = new Student("a","b","c");
   repo.save(std);
   alert("Saved");
 }
</script>
</html>
