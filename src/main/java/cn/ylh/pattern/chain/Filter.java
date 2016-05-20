package cn.ylh.pattern.chain;

public interface Filter {
	/**
	 *
	 * @param request
	 * @param response
	 * @param chain
     */
	void doFilter(Request request,Response response,FilterChain chain);
}
