<!DOCTYPE html>
<html>
<body>

<canvas id="myCanvas" style="border:1px solid #000000;"></canvas>
<input type="text" size="5" onkeypress="myFunction(event)">

<script>

var canvas = document.getElementById("myCanvas");
canvas.width  = window.innerWidth;
canvas.height = window.innerHeight;
var ctx = canvas.getContext("2d");

var colorlist = ["red","white","green","blue","purple","yellow"]

function myFunction(event) {
  var x = event.which || event.keyCode;
  document.getElementById("demo").innerHTML = "The Unicode value is: " + x;
}
function CanvasColorFill () {
	var colorvalue = Math.floor(Math.random() * 6);
	if (colorvalue == 0) { //red screen
		ctx.fillStyle = "#FF0000";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	} else if (colorvalue == 1) { //white screen
		ctx.fillStyle = "#FFFFFF";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	} else if (colorvalue == 2) { //green screen
		ctx.fillStyle = "#00FF1A";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	} else if (colorvalue == 3) { //blue screen
		ctx.fillStyle = "#00BBFF";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	} else if (colorvalue == 4) { //purple screen
		ctx.fillStyle = "#FF00F7";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	} else {  //yellow screen
		ctx.fillStyle = "#FFFB00";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	}

}

CanvasColorFill();




</script>

</body>
</html>
