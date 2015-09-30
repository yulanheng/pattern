package cn.ylh.pattern.chain;

public class ChainTest {

	public static void main(String[] args) {
        FilterChain chain1=new FilterChain();
        chain1.add(new HTMLFilter()).add(new SesitiveFilter());
        /**
         * 链中最好不要套链，假如子链含有多个Filter只会执行一个,因为filter.doFilter(request, response, chain);
         * 的chain一直是主链的
         * 假如将FilterChain中的调用filter.doFilter(request, response, chain);
         * 改为filter.doFilter(request, response, this);
         * 主链调用会终止，除非子链放在主链最后
         *  FilterChain chain2=new FilterChain();
         *  chain2.add(new LowerFilter()).add(new SesitiveFilter());
         *  将另一个链加入到这个链中
         *  chain1.add(chain2);
         */
       
        chain1.add(new HTMLFilter());
        Request request=new Request();
        request.setRequest("<<scriptUUT我靠/>");
        Response response=new Response();
        response.setResponse("response");
        Process  process=new Process(request,response,chain1);
        process.process();
	}
}
