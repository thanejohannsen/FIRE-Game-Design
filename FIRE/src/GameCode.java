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
ctx.fillStyle = "#000000";
ctx.fillRect(0, 0, canvas.width, canvas.height);




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
			
		} else if (index == 1) { //white screen
			
		} else if (index == 2) { //green screen
			
		} else if (index == 3) { //blue screen
			
		} else if (index == 4) { //purple screen
			
		} else if (index == 5) { //yellow screen
			
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

