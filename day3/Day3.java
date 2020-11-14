package day3;

import java.util.HashSet;

public class Day3 {
	public int getArraysNum(int[][] param) {
		HashSet<String> data = new HashSet<String>();
		for (int i = 0; i < param[0].length; i++) { //???¡Æ ??
			
			for (int j = 0; j<param[1].length;j++) {//???¡Æ ??
				
				for (int k=0; k<param[2].length; k++) {//????¡Æ ??
					String result = ""+param[0][i]+param[1][j]+param[2][k];
					data.add(result);						
				}
			}
		}
		return data.size();
	}
}
