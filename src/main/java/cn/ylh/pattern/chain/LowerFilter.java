package cn.ylh.pattern.chain;

public class LowerFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequest(request.getRequest().toLowerCase());
		System.out.println(request.getRequest()+"LowerFilter");
		chain.doFilter(request, response, chain);
		response.setResponse(response.getResponse()+"LowerFilter");
		System.out.println(response.getResponse());
		
	}

}
