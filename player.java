//imports
import java.util.*;
import java.io.*;
import java.lang.*;
import java.lang.System.*;

public class Player {
		
	protected String name;
	protected Animal Animal1;
	protected Animal Animal2;
	protected Animal Animal3;
	protected Animal temp;
	}

//constructor
public Animal(String name){
	//basic Player info
	this.name=name;
	}

//getters and setter
public String getName(){
	return name;        
	}
	
public void setAnimal1(Animal object) {
	this.Animal1 = object;
	}
			
//choose animal functions. animals will be chosen 1 by 1 by each player, meaning player 1 will choose an animal first, then player 2, then player 1 again.
public void chooseAnimal1() {
	System.out.print("Current animawls available are Dog, Bird, and Bear \n");
	System.out.print("Please choose your first animawl:");
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(reader);
	try{
		line = in.readLine();
		while(! (line.equalsIgnoreCase("Dog") || line.equalsIgnoreCase("Bear") || line.equalsIgnoreCase("Bird"))){
			System.out.println(line);
			System.out.println(is not a valid option. Please enter a valid option:);
			line = in.readLine();
		}
	}catch(IOException e) { e.printStackTrace(); }
			
	switch (line) {
	case "Dog":  this.Animal1 = new Dog;   
	break;
	case "Bear":  this.Animal1 = new Bear;
		                     break;
	case "Bird":  this.Animal1 = new Bird;
	break;
	}
}

public void chooseAnimal2() {
	System.out.print("Current animawls available are Dog, Bird, and Bear \n");
	System.out.print("Please choose your second animawl:");
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(reader);
	try{
		line = in.readLine();
		while(! (line.equalsIgnoreCase("Dog") || line.equalsIgnoreCase("Bear") || line.equalsIgnoreCase("Bird"))){
			System.out.println(line);
			System.out.println(is not a valid option. Please enter a valid option:);
			line = in.readLine();
		}
	}catch(IOException e) { e.printStackTrace(); }
			
	switch (line) {
	case "Dog":  this.Animal2 = new Dog;   
	break;
	case "Bear":  this.Animal2 = new Bear;
		                     break;
	case "Bird":  this.Animal2 = new Bird;
	break;
	}
}
	
public void chooseAnimal3() {
	System.out.print("Current animawls available are Dog, Bird, and Bear \n");
	System.out.print("Please choose your third animawl:");
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(reader);
	try{
		line = in.readLine();
		while(! (line.equalsIgnoreCase("Dog") || line.equalsIgnoreCase("Bear") || line.equalsIgnoreCase("Bird"))){
			System.out.println(line);
			System.out.println(is not a valid option. Please enter a valid option:);
			line = in.readLine();
		}
	}catch(IOException e) { e.printStackTrace(); }
			
	switch (line) {
	case "Dog":  this.Animal3 = new Dog;   
	break;
	case "Bear":  this.Animal3 = new Bear;
		                     break;
	case "Bird":  this.Animal3 = new Bird;
	break;
	}
}
	
// function to switch animals	
public void switchAnimal() {
	System.out.print("Would you like to switch animals ? Enter yes or no:");
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(reader);
	try{
		line = in.readLine();
		while(! (line.equalsIgnoreCase("yes") || line.equalsIgnoreCase("no"))){
			System.out.println(line);
			System.out.println(is not a valid option. Please enter a valid option:);
			line = in.readLine();
		}
	}catch(IOException e) { e.printStackTrace(); }
	
	if(line == "no")
		;
	else{
		System.out.print("Which animal would you like to bring out to battle ? Please type animal2 or animal3:");
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		try{
			line2 = in.readLine();
			while(! (line.equalsIgnoreCase("animal2") || line.equalsIgnoreCase("animal3") ||)){
				System.out.println(line);
				System.out.println(is not a valid option. Please enter a valid option:);
				line2 = in.readLine();
			}
		}catch(IOException e) { e.printStackTrace(); }
		if(line2 == "animal2"){
			this.temp = this.Animal1;
			this.Animal1 = this.Animal2;
			this.Animal2 = this.temp;
		}
		else if(line2 == "animal3"){
			this.temp = this.Animal1;
			this.Animal1 = this.Animal3;
			this.Animal3 = this.temp;
		}
	}
}


public void chooseAttack(){
	System.out.print("Here is a list of your fighting animawls attacks:");
	Animal1.printAttacklist();
	System.out.print("Which attack would you like to use ? Input 1, 2 or 3:");
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(reader);
	try{
		line = in.readLine();
		while(! (line.equalsIgnoreCase("1") || line.equalsIgnoreCase("2") || line.equalsIgnoreCase("3"))){
			System.out.println(line);
			System.out.println(is not a valid option. Please enter a valid option:);
			line = in.readLine();
		}
	}catch(IOException e) { e.printStackTrace(); }
	
	if(line == "1"){
		Animal1.attack1();
	}
	else if(line == "2"){
		Animal1.attack2();
	}
	else if(line == "3"){
		Animal1.attack3();
	}
}
	
	
