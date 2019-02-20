package hamzi_hw;


import static org.junit.Assert.*;


class booktest {

	
	void test() {
		shc p = new shc();
		assertEquals(0,book.create_shc(p).get_cou());
		assertEquals(0,book.create_shc(p).get_coa());
	}
	void test1() {
		shc f = new shc();
		assertEquals(1,book.add_java_book(f).get_cou());
		assertEquals(127,book.add_java_book(f).get_coa());
	}
	void test2() {
		
		shc c = new shc();
		
		assertEquals(2,book.add_java_book_and_web(c).get_cou());
		assertEquals(227,book.add_java_book_and_web(c).get_coa());
	}

}
