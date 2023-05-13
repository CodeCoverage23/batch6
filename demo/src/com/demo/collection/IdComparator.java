package com.demo.collection;

import java.util.Comparator;

public class IdComparator implements Comparator{

	@Override
//	public int compare(Object arg0, Object arg1) {
//		Book b1 = (Book) arg0;
//		Book b2 = (Book) arg1;
//
//		if (b1.book_id == b2.book_id)
//			return 0;
//		else if (b1.book_id > b2.book_id)//true{30>20}->swapping false{20>30}->no swaping
//			return 1;
//		else
//			return -1;//(b1.book_id<b2.book_id)->false{30<20}-> swapping  true{20<30}->no swapping
//
//	}
	// descending order : ->
	public int compare(Object arg0, Object arg1) {
		Book b1 = (Book) arg0;
		Book b2 = (Book) arg1;

		if (b1.book_id == b2.book_id)
			return 0;
		else if (b1.book_id < b2.book_id)//true{30<20}->swapping false{20>30}->no swaping
			return 1;
		else
			return -1;//(b1.book_id<b2.book_id)->false{30<20}-> swapping  true{20<30}->no swapping

	}

}
