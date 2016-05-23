package mod06.ex01;

public class Test {

    public static void main(String[] args) {
        PrepaidPhone pp = new PrepaidPhone(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("Current limit: " + pp.getLimit());
            try {
				pp.makeCall(7);
			} catch (PrepaidPhoneException e) {
				/*
				 * printStackTrace() -> kieruje na metote System.err
				 * pozosta³e komunikaty sa wyœwitlane przez System.out
				 * i jest typowy przyk³ad wyœcigu w¹tków do procesora.
				 */
//				e.printStackTrace(System.out);
				
				//e.printStackTrace();
				System.out.println("******** " + e.getMessage()); 
				/*
				 * obs³uga prawid³owa wyj¹tku czyli do³adowanie karty
				 */
				pp.addToLimit(10); 
			}
            pp.addToLimit(3);
        }
        System.out.println("Current limit: " + pp.getLimit());
    }
}