package org.tnsif.springioc;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CardExecutor {
	
	//driver class
	
	public static void main(String [] args ) {
	/*SBICard s=new SBICard();
	HDFCCard H=new HDFCCard();
	s.deposit();
	s.withdraw();
	h.deposit();
	h.withdraw();
	*/
	
	BeanFactory b=new ClassPathXmlApplicationContext("beans.xml");
	
	/*SBICard s=(SBICard) b.getBean("sbi");
	s.deposit();
	s.withdraw();
	
	HDFCCard h=(HDFCCard) b.getBean("hdfc");
	h.deposit();
	h.withdraw();
	*/
	
	DebitCard s1=(DebitCard) b.getBean("sbi");
	s1.deposit();
	s1.withdraw();
	
	DebitCard h1=(DebitCard) b.getBean("hdfc");
	h1.deposit();
	h1.withdraw();
	
	}
}
