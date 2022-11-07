//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	
    	int index = 0;
    	
    	for (int i = 0; i<size; i++)
    	{
    		for (int j = 0; j<size; j++)
    		{
    			m[i][j] = str.charAt(index)+ "";
    			index++;
    	    }
    	}
    }

    public boolean isFound( String word )
    {
    	for (int r = 0 ; r<m.length; r++)
    	{
        	for (int c = 0 ; c<m.length; c++)
        	{
        		if (checkRight(word,r,c)==true||checkLeft(word,r,c)==true||checkUp(word,r,c)==true||checkDown(word,r,c)==true
        				||checkDiagUpRight(word,r,c)==true||checkDiagUpLeft(word,r,c)==true||checkDiagDownLeft(word,r,c)==true||checkDiagDownRight(word,r,c)==true)
        			return true;
//        		System.out.println(r + " " + c);
        	}
    	}
    	return false; 
    }

	public boolean checkRight(String w, int r, int c)
    {
		
		if (m[r].length - c <= w.length()) {
//			System.out.println(m[r].length - c);
			return false;
		}
		for (int i = 0; i<w.length() ; i++)
		{
			if(w.charAt(i) != m[r][c+i].charAt(0)) {
				return false;
			}
		}
		return true; 
	}

	public boolean checkLeft(String w, int r, int c)
	{
		if (c+1 < w.length()) {
//			System.out.println(m[r].length - c);
			return false;
		}
		for (int i = 0; i<w.length() ; i++)
		{
			if(w.charAt(i) != m[r][c-i].charAt(0)) {
				return false;
			}
		}
		return true; 
	}

	public boolean checkUp(String w, int r, int c)
	{
		if (r+1 < w.length()) {
//			System.out.println(m[r].length - c);
			return false;
		}
		for (int i = 0; i<w.length() ; i++)
		{
			if(w.charAt(i) != m[r-i][c].charAt(0)) {
				return false;
			}
		}
		return true; 	}

	public boolean checkDown(String w, int r, int c)
   {
		if (m[r].length-r < w.length()) {
//			System.out.println(m[r].length - c);
			return false;
		}
		for (int i = 0; i<w.length() ; i++)
		{
			if(w.charAt(i) != m[r+i][c].charAt(0)) {
				return false;
			}
		}
		return true; 
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		
		boolean found = false;
		if ((c+1) < 0 && (r+1) < w.length()) {
//			System.out.println(m[r].length - c);
			return false;
		}
		for (int i = 0; i<w.length() && (c+i)<m.length && (r-i)>0; i++)
		{
		//	System.out.println(i + " - " + r + ":" + c );
			if(w.charAt(i) == m[r-i][c+i].charAt(0)) {
				found = true && found;
			}
		}
		return found;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		boolean found = false;
		if ((c+1) >= 0 && (r+1) >= 0) {
//			System.out.println(m[r].length - c);
			return false;
		}
		for (int i = 0; i<w.length() && (c+i)<m.length && (r+i)<m.length; i++)
		{
			//System.out.println(i + " - " + r + ":" + c );
			if(w.charAt(i) == m[r-i][c-i].charAt(0)) {
				found = true && found;

			}
		}
		return found;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		boolean found = false;
	
		
		for (int i = 0; i<w.length() && (c-i)>0 && (r+i)< m.length; i++)
		{
			//System.out.println(i + " - " + r + ":" + c );
			if(w.charAt(i) == m[r+i][c-i].charAt(0)) {
				found = true && found;
			}
		}
		return found;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		boolean found = false;
		if ((c+1) < w.length() && (r+1) < w.length()) {
//			System.out.println(m[r].length - c);
			return false;
		}
		for (int i = 0; i<w.length() && (c+i)<m.length && (r+i)<m.length; i++)
		{
		//	System.out.println(i + " - " + r + ":" + c );
			if(w.charAt(i) == m[r+i][c+i].charAt(0)) {
				found = true && found;
			}
		}
		return found;
	}

    public String toString()
    {
 		String out = "";
 		
 		for (String[] row : m) {
 			for (String s : row) {
 				out += s + " ";
 			}
 			out += "\n";
 		}
    	
    	return out;
    }
}
