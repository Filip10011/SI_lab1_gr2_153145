class Student {
	String index;
	String firstName;
	String lastName;
	int grades[];
	int num1 = 6;
	int num2 = 7;
	int num3 = 8;
	int num4 = 7;
	int num5 = 10;
	string polozen;
	int br;

	//TODO constructor

	//TODO seters & getters

	public double getAverage() {
		//TODO
		int average = (num1 + num2 + num3 + num4 + num5) / 5);
		System.out.println(average);
		
	}

	public int ECTSCredits() {
		//TODO
		if(num1 == polozen) {
			br++;
		}else if(num2 == polozen) {
			br++;
		}else if(num3 == polozen) {
			br++;
		}else if(num4 == polozen) {
			br++;
		}else if(num5 == polozen) {
			br++;	
		}else(){
			System.out.println("nema bed");
		}
	}
}
