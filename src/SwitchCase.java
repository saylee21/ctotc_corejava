public class SwitchCase {
    public static void main(String[] args) {
	int enteredNum = 10;

		
	/*if (enteredNum == 1) { 
        System.out.println("The value of enteredNum is 1");
    } 
	else if (enteredNum== 2){
		System.out.println("The value of enteredNum is 2"); 
    } 
	else if (enteredNum == 3){ 
		System.out.println("The value of enteredNum is 3"); 
    } 
	else{
	System.out.println("The value of enteredNum is other than 1,2,3"); 
	}*/
		 
		
	switch (enteredNum) {
	case 1: 
		System.out.println("The value of enteredNum is 1");
		break;
	case 2:
		System.out.println("The value of enteredNum is 2");
		break;
	case 3:
		System.out.println("The value of enteredNum is 3");
		break;
	default:
	    System.out.println("The value of enteredNum is other than 1,2,3");
		break;

	}

	}

}
