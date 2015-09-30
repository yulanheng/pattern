package cn.ylh.pattern.chain;

public class HTMLFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequest(request.getRequest().replace("<", "&lt;").replace(">", "&gt;"));
		System.out.println(request.getRequest()+"HTMLFilter");
		chain.doFilter(request, response, chain);
		response.setResponse(response.getResponse()+"HTMLFilter");
		System.out.println(response.getResponse());
		
	}

}
