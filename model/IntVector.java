package model;

import java.util.Arrays;

public class IntVector implements IntList{

	private int[] array;
	private int length;
	
	
	public IntVector() {
		array=new int[20];
		length=0;
	}
	
	
	public int getLengthArray() {
		return array.length;
	}
	
	@Override
	public void add(int element) {
		if(array.length==this.length) {//Si el array esta lleno (si 10==10)
			int new_length=array.length*2;
			int[] array2=new int[new_length];//creo un nuevo array
			for (int i = 0; i < array.length; i++) { //copio los datos
				array2[i]=array[i];
			}
//			array2[length]=element;
//			length++;
			array=array2;
		}
//		else {
			array[length]=element;
			length++;
//		}
		//System.out.println(array.length);
		
		
	}

	@Override
	public int get(int id) {
		// TODO Auto-generated method stub
		return array[id];
	}


	@Override
	public String toString() {
		return "IntVector [array=" + Arrays.toString(array) + ", length=" + length + "]";
	}

}
