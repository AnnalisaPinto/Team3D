package heritage.controllerData;

import heritage.model.Users;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(Users.readUserById(4).getNickname());
		

	}

}
