package cn.zz.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class Myfilter extends ZuulFilter {

    /**
     * 设置当前过滤器类型的
     * (1)	pre：路由之前
     * (2)	routing：路由之时
     * (3)	post： 路由之后
     * (4)	error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 当前过滤器的优先级
     * 可以为负数,值越小,则优先级越高
     * 但是: 当前的优先级是针对相同的过滤器而言的
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否过滤,是否起作用
     * true:过滤
     * false:忽略
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器中的核心代码
     * @return
     * @throws ZuulException
     * 在路由前，判断拦截是否带参数
     */
    @Override
    public Object run() throws ZuulException {
        // 首先获取当前的请求对象
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        // 获取参数名所对应的参数
        String name = request.getParameter("name");
        if (name!=null){
            return null;
        }

        try {
            //如果错误,设定响应的信息
            RequestContext.getCurrentContext().setSendZuulResponse(false);
            //设定错误编号
            RequestContext.getCurrentContext().setResponseStatusCode(401);
            //设定提示信息
            RequestContext.getCurrentContext().getResponse().getWriter().write("Name is null");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
