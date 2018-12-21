package com.techlab.testcrud;

import com.techlab.crud.CustomerDb;
import com.techlab.crud.ICrudable;
import com.techlab.crud.OrderDb;
import com.techlab.crud.ProductDb;

public class TestPolymorphism {
	public static void main(String[] args) {
		ICrudable crud1 = new CustomerDb();
		doDbOperation(crud1);

		ICrudable crud2 = new OrderDb();
		doDbOperation(crud2);

		ICrudable crud3 = new ProductDb();
		doDbOperation(crud3);

	}

	public static void doDbOperation(ICrudable crud) {
		System.out.println("DB Operations:-");
		crud.create();
		crud.read();
		crud.update();
		crud.delete();
	}

}
