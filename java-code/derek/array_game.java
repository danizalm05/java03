//array_game.java
//https://www.youtube.com/watch?v=_pUz-GJcdRU&list=PLE7E8B7F4856C9B19&index=8
package drk;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;// this lib not included in 
//standard java

// Basic class definition
// public means this class can be used by other classes
// Class names should begin with a capital letter
// A file can't contain two public classes. It can contain classes that are not public
// If you place class files in the same folder the java compiler will be able to find them

/* The Goal of this tutorial is to make a game like this
------------------------------
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||M||F||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|P||*||*||*||*||*||*||*||*||*|
|*||*||*||*||D||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
------------------------------
[9,9]

 */

public class array_game{
	
 public static void main(String[] args){
	 MonsterTwo.buildBattleBoard();
	char[][] tempBattleBoard = new char[10][10];
	// ObjectName[] ArrayName = new ObjectName[4];
	MonsterTwo[] Monsters = new MonsterTwo[4];//4 monsters
		
	// MonsterTwo(int health, int attack, int movement, String name)
	Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
	Monsters[1] = new MonsterTwo(500, 40, 2, "Drac");
	Monsters[2] = new MonsterTwo(1000, 20, 1, "Paul");
	Monsters[3] = new MonsterTwo(1000, 20, 1, "George");
		
	MonsterTwo.redrawBoard();
		
	}
	
	
}