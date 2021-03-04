<!DOCTYPE html>
<html>
<body>




// Get the canvas element form the page
var canvas = document.getElementById("myCanvas");
 
/* Rresize the canvas to occupy the full page, 
   by getting the widow width and height and setting it to canvas*/
 
canvas.width  = window.innerWidth;
canvas.height = window.innerHeight;
 



<input type="text" size="50" onkeydown="keyCode(event)"> 







<script>






public class GameCode {
  
    
 //each function displays corresponding colors 
  function white(){
  }
  function red(){
  }
  function green(){
  }
  function blue(){
  }
  function purple(){
  }
  function yellow(){
  }
  
  function keyCode(event) {
    var x = event.keyCode;
    if (x == 27) {
    ;
    }
  }
  
  function check(){
    //Checks if input matches colorvalue and returns true or calls upon input again if input is false.
  }
  
  
  function start(){
    while (i < 10){
      // i is = to the amount of iterations of the game
      var colorvalue = Math.floor(Math.random() * 6);
      
      if (colorvalue = 0){
        white();
      }
      else if (colorvalue = 1){
        red();
      }
      else if (colorvalue = 2){
        green();
      }
      else if (colorvalue = 3){
        blue();
      }
      else if (colorvalue = 4){
        purple();
      }
      else if (colorvalue = 5){
        yellow();
      }
      
      input();
      check();
      
 
    }
    
  }
 

}
</script>

</body>
</html>
