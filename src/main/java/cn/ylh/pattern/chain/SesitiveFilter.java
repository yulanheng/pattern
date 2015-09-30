package cn.ylh.pattern.chain;
//敏感词过滤
public class SesitiveFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequest(request.getRequest().replace("靠", "*"));
		System.out.println(request.getRequest()+"SesitiveFilter");
		chain.doFilter(request, response, chain);
		response.setResponse(response.getResponse()+"SesitiveFilter");
		System.out.println(response.getResponse());
		
	}

}
