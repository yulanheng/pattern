package cn.ylh.pattern.chain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{

	private List<Filter> chains=new ArrayList<Filter>();
	private int index=0;
	public FilterChain add(Filter filter){
		this.chains.add(filter);
		return this;
	}
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		if(index>=chains.size()){
			return;
		}
		Filter filter=chains.get(index);
		index++;
		filter.doFilter(request, response, chain);
	}

}
