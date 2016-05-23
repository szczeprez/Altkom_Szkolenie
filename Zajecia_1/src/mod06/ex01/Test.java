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
				 * pozosta�e komunikaty sa wy�witlane przez System.out
				 * i jest typowy przyk�ad wy�cigu w�tk�w do procesora.
				 */
//				e.printStackTrace(System.out);
				
				//e.printStackTrace();
				System.out.println("******** " + e.getMessage()); 
				/*
				 * obs�uga prawid�owa wyj�tku czyli do�adowanie karty
				 */
				pp.addToLimit(10); 
			}
            pp.addToLimit(3);
        }
        System.out.println("Current limit: " + pp.getLimit());
    }
}