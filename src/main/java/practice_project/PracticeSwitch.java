package practice_project;

public class PracticeSwitch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] nums = {1, 3, 4, 2, 3, 5, 2, 1, 5, 4};
		
		for (int i = 0; i < nums.length; i++) {
			switch (nums[i]) {
				case 1: 
					System.out.println("1：勇者");
					break;
				case 2: 
					System.out.println("2：バトルマスター");
					break;
				case 3: 
					System.out.println("3：パラディン");
					break;
				case 4: 
					System.out.println("4：海賊");
					break;
				case 5: 
					System.out.println("5：魔法剣士");
					break;
			}
		}
	}

}
