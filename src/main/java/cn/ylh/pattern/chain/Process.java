package cn.ylh.pattern.chain;
public class Process {

	private Request request;
	private Response response;
	private FilterChain chain;
	public Process(Request request,Response response,FilterChain chain){
		this.request=request;
		this.response=response;
		this.chain=chain;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public FilterChain getChain() {
		return chain;
	}
	public void setChain(FilterChain chain) {
		this.chain = chain;
	}
	public void process(){
		chain.doFilter(request, response, chain);
	}
	
}
