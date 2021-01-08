package server.netty;

import com.google.gson.Gson;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import server.code.ActionJson;

public class ProcessingHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        RequestData requestData = (RequestData) msg;
        ResponseData responseData = new ResponseData();
        String requestString = requestData.getStringValue();
        String testtest = requestString;
        Gson gson = new Gson();
        ActionJson actionJson = gson.fromJson(requestString, ActionJson.class);
        actionJson.setAction("otsosal");
        requestString=gson.toJson(actionJson);
        responseData.setStringValue(requestString);
        responseData.setIntValue(requestData.getIntValue() * 2);
        ChannelFuture future = ctx.writeAndFlush(responseData);
        future.addListener(ChannelFutureListener.CLOSE);
        System.out.println(requestData);
    }
}
