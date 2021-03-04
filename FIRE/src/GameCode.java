<!DOCTYPE html>
<html>
<body>

<canvas id="myCanvas" style="border:1px solid #000000;"></canvas>


<script>
import java.io.*;
import java.util.*;


var canvas = document.getElementById("myCanvas");
canvas.width  = window.innerWidth;
canvas.height = window.innerHeight;
var ctx = canvas.getContext("2d");





public class GameCode {
	
	private static ArrayList<String> color = new ArrayList<>();
	private static Random randomGenerator = new Random();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		populateList(color);
		
		
		
		scan.close();
	}
	
	public static ArrayList<String> populateList(ArrayList<String> color){
		color.add("red");
		color.add("white");
		color.add("green");
		color.add("blue");
		color.add("purple");
		color.add("yellow");
		return color; 
	}
	
	public static void game (Scanner scan, int index) {
		chooseRandomColor(scan);
		if (index == 0) { //red screen
			ctx.fillStyle = "#FF0000";
			ctx.fillRect(0, 0, canvas.width, canvas.height);
		} else if (index == 1) { //white screen
			ctx.fillStyle = "#FFFFFF";
			ctx.fillRect(0, 0, canvas.width, canvas.height);
		} else if (index == 2) { //green screen
			ctx.fillStyle = "#00FF1A";
			ctx.fillRect(0, 0, canvas.width, canvas.height);
		} else if (index == 3) { //blue screen
			ctx.fillStyle = "#00BBFF";
			ctx.fillRect(0, 0, canvas.width, canvas.height);
		} else if (index == 4) { //purple screen
			ctx.fillStyle = "#FF00F7";
			ctx.fillRect(0, 0, canvas.width, canvas.height);
		} else
			ctx.fillStyle = "#FFFB00";
			ctx.fillRect(0, 0, canvas.width, canvas.height);
		}
		
	}
	
	public static int chooseRandomColor(Scanner scan) {
		System.out.println("If you want to stop playing hit q, otherwise hit something else: ");
		String quit = scan.nextLine();
		while (!quit.equals("q")) {
			int index = randomGenerator.nextInt(color.size());
			return index;
		}
		return -1;
	}
 
}


</script>

</body>
</html>

