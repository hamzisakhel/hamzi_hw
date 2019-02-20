package hamzi_hw;


public class shc {
	
		int count, coast;

	
	void setvalue(int a , int b) {
			this.coast=b;
			this.count=a;
		}
	int get_cou() {
		return count;
		
	}
	int get_coa() {
		return coast;
	}
	public static Object create_shc(shc c) {
		shc j = new shc();
		j.setvalue(0, 0);
		return j;
	}
		
};

