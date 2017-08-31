package composite.demo2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

	private List<Company> clist;

	public ConcreteCompany() {
		clist = new ArrayList<Company>();
	}

	public ConcreteCompany(String name) {
		super(name);
		clist = new ArrayList<Company>();
	}

	@Override
	protected void add(Company company) {
		clist.add(company);
	}

	@Override
	protected void remove(Company company) {
		clist.remove(company);
	}

	@Override
	protected void display(int depth) {

		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}

		System.out.println(new StringBuffer(sb) + this.getName());
		for (Company c : clist) {
			c.display(depth +2);
		}
	}

}
