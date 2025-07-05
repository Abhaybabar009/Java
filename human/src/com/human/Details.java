package com.human;

public class Details {

	public static void main(String[] args) {
		human[] arr= new human[4];
		
		arr[0] = new human (23, 34, 65); //agee,weight,height
		arr[1] = new human (32, 64, 74);
		arr[2] = new human (42, 64, 84);
		arr[3] = new human (53, 74, 84);
		
		for(int i=0; i< arr.length ; i++) {
			arr[i].display();
			
		}
	}

}
