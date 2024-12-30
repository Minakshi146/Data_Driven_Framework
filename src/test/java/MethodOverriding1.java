
class PaymentGateway{
	void ProcessPayment(double amount){
		System.out.println("Default payment"+amount);
}}
	class GooglePay extends PaymentGateway{
		@Override
		void ProcessPayment(double amount) {
			System.out.println(" payment through gpay"+amount);
		}
	}

	
public class MethodOverriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentGateway pg=new PaymentGateway();
		pg.ProcessPayment(23.6);
		
		GooglePay gp=new GooglePay();
		gp.ProcessPayment(455);
		
		PaymentGateway payg=new GooglePay();
		payg.ProcessPayment(900);
	}

}
