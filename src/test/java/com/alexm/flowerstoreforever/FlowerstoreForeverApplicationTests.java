package com.alexm.flowerstoreforever;

import com.alexm.flowerstoreforever.delivery.PostDeliveryStrategy;
import com.alexm.flowerstoreforever.item.FlowerPack;
import com.alexm.flowerstoreforever.item.Item;
import com.alexm.flowerstoreforever.item.decorator.BasketDecorator;
import com.alexm.flowerstoreforever.item.decorator.PaperDecorator;
import com.alexm.flowerstoreforever.item.flower.Chamomile;
import com.alexm.flowerstoreforever.item.flower.Rose;
import com.alexm.flowerstoreforever.payment.CreditCardPaymentStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlowerstoreForeverApplicationTests {
	@Test
	void testBasic() {
		Order order = new Order();
		order.setDelivery(new PostDeliveryStrategy());
		order.setPayment(new CreditCardPaymentStrategy());
		order.addItem(new BasketDecorator(new FlowerPack(new Chamomile())));
		order.addItem(new Rose());
		Assertions.assertEquals(order.calculateTotalPrice(), 34);
		order.processOrder();
	}

	@Test
	void testAdvanced() {
		Order order = new Order();
		order.setDelivery(new PostDeliveryStrategy());
		order.setPayment(new CreditCardPaymentStrategy());
		Item chamomiles = new PaperDecorator(new FlowerPack(new Chamomile()));
		order.addItem(chamomiles);
		order.addItem(new BasketDecorator(new FlowerPack(new Rose(), 20)));
		order.addItem(new Rose());
		order.removeItem(chamomiles);
		Assertions.assertEquals(order.calculateTotalPrice(), 214);
		order.processOrder();
	}
}
