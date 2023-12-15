package core;

import java.util.ArrayList;

public class Stack implements IStack {
	
	private ArrayList<Object>elms;
	
	public Stack() {
		elms = new ArrayList<Object>();
	}

	@Override
	public boolean isEmpty() {
		if(elms != null) {
			if(elms.size() == 0)
				return true;
			else
				return false;
		}else
		return true;
	}

	@Override
	public int getSize() {
		if(elms != null)
			return elms.size();
		else
			return 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(Object elm) {
		elms.add(elm);
		
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return elms.get(getSize() - 1);
	}
	
}
