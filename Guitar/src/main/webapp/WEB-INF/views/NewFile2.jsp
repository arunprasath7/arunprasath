<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bootstrap-3.3.7-dist\js\bootstrap.min.js">
  <script src="bootstrap-3.3.7-dist\js\jquery-3.1.0.min (1).js"></script>
  <script src="bootstrap-3.3.7-dist\js\bootstrap.min.js"></script>

<style>
 body{

background-image: url('images\pic4.jpg');
background-repeat;
}

.carousel-inner > .item > img,
.carousel-inner > .item > a > img {
width:800px;
height:400px;
  margin:auto;
}

</style>

</head>
<body>
<div class="container">


<nav class="navbar navbar-inverse">
 
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MUSICALINSTRUMENT</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">HOME</a></li>
      <li><a href="#">musicalinstrument</a></li>
      <li><a href="#">ACCESSORIES</a></li>
      <li><a href="#">LOCATE US</a></li>
      <li><a href="#">ABOUT US</a></li>

 </ul>
    <ul class="nav navbar-nav navbar-right">
    <li><a href="NewFile1"><span class="glyphicon glyphicon-log-in"></span> LOGIN</a></li>
      <li><a href="NewFile"><span class="glyphicon glyphicon-user"></span> REGISTER</a></li>
      <li><span>xxxxxxxxxxxx</span></li>
     
    </ul>
  
</nav>
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="images/pic.jpg" width="350" height="250">  
      </div>

   <div class="item ">
        <img src="images/pic.jpg" width="350" height="250">  
      </div>

   <div class="item ">
        <img src="images/pic2.jpg" width="350" height="250">  
      </div>
      
   <div class="item ">
       <img src="images/pic3.jpg" width="350" height="250">  
     </div>
     
 </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>



</body>
</html>








