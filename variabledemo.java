class Student {
	
	int id = 1000;
    int ID = id+1;
	//byte age = -187;
	static void go (int[] array){
		//array[0] = 2;
		//array[1] = 21;
		System.out.println("array[0] : " +array[0]);
		System.out.println("array[1] : " +array[1]);
		
	}
	
	public static void main(String[] args){
		 int[] array = {1,2};
		 go(array);
		 array[1] = 33;
		 System.out.println("array[1] : " +array[1]);
	}
}