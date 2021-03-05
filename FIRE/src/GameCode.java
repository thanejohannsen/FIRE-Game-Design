<!DOCTYPE html>
<html>
<body>

<canvas id="myCanvas" style="border:1px solid #000000;"></canvas>
<button type="button" onclick="start()">Start</button>
<input type="text" id="myText" value="">
<p id="demo"></p>


<script>

var canvas = document.getElementById("myCanvas");
canvas.width  = window.innerWidth;
canvas.height = window.innerHeight;
var ctx = canvas.getContext("2d");

//var colorlist = ["red","white","green","blue","purple","yellow"]
function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

function CanvasColorFill (rand) {
	
	if (rand == 0) { //red screen
		ctx.fillStyle = "#FF0000";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	} else if (rand == 1) { //white screen
		ctx.fillStyle = "#FFFFFF";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	} else if (rand == 2) { //green screen
		ctx.fillStyle = "#00FF1A";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	} else if (rand == 3) { //blue screen
		ctx.fillStyle = "#00BBFF";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	} else if (rand == 4) { //purple screen
		ctx.fillStyle = "#FF00F7";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	} else {  //yellow screen
		ctx.fillStyle = "#FFFB00";
		ctx.fillRect(0, 0, canvas.width, canvas.height);
	}

}



function keycheck(key,rand){
	if (rand == 0) { //red screen
		if (key == 113 || key == 119 || key == 97 || key == 115 || key == 122 || key == 120){
        	start();
        }else{
        	document.getElementById("demo").innerHTML = "WRONG";
        }
	} else if (rand == 1) { //white screen
		if (key == 91 || key == 93 || key == 92 || key == 39 || key == 13){
        	start();
        }else{
        	document.getElementById("demo").innerHTML = "WRONG";
        }
	} else if (rand == 2) { //green screen
		if (key == 111 || key == 112 || key == 108 || key == 59 || key == 46 || key == 47){
        	start();
        }else{
        	document.getElementById("demo").innerHTML = "WRONG";
        }
	} else if (rand == 3) { //blue screen
		if (key == 101 || key == 114 || key == 100 || key == 102 || key == 99 || key == 118){
        	start();
        }else{
        	document.getElementById("demo").innerHTML = "WRONG";
        }
	} else if (rand == 4) { //purple screen
		if (key == 117 || key == 105 || key == 106 || key == 107 || key == 109 || key == 44){
        	start();
        }else{
        	document.getElementById("demo").innerHTML = "WRONG";
        }
	} else {  //yellow screen
		if (key == 116 || key == 121 || key == 103 || key == 104 || key == 98 || key == 110){
        	start();
        }else{
        	document.getElementById("demo").innerHTML = "WRONG";
        }
	}
    
    

}

async function start(){
	var colorvalue = Math.floor(Math.random() * 6);
  	CanvasColorFill(colorvalue);
    await sleep(5000);
    keyget(colorvalue);
}

function keyget(colorvalue){
	var key = document.getElementById("myText").value.charCodeAt(0);
    keycheck(key, colorvalue);
}
/*


async function run(key) {
	var i;
	for (i = 0; i < 10; i++) {
    	var colorvalue = Math.floor(Math.random() * 6);
  		CanvasColorFill(colorvalue);
        keycheck(key,colorvalue);
		//await sleep(2000);
	}
  
}*/
//run();







</script>

</body>
</html>
