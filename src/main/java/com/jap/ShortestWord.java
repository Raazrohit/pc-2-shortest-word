package com.jap;


public class ShortestWord {
    public static void main(String[] args) {
	 //Declare and initialize a String array.
	String words[] = {"java", "programming", "language"};
        // Create an object of the class ShortestWord
	ShortestWord object = new ShortestWord();
        //Call the method findShortestWord() and pass the array.
		String shortestword = object.findShortestWord(words);
		System.out.println("Shortest word from given array of string is : "+ shortestword);
    }

    //Write the logic to find the shortest word from the String array inside
    // the below method and return the shortest word.
    public String findShortestWord(String[] words) {
	String shortestString = words[0];
	int n = words.length;
		for(int i = 0;i < n; i++){
			if(words[i].compareTo(shortestString) < 0)
				shortestString = words[i];
		} 
        return shortestString;
    }
}
