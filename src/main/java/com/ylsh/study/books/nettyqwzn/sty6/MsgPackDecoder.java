package com.ylsh.study.books.nettyqwzn.sty6;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.msgpack.MessagePack;

import java.util.List;

public class MsgPackDecoder extends MessageToMessageDecoder<ByteBuf>{

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        final byte[] array;
        final int len = byteBuf.readableBytes();
        array = new byte[len];
        byteBuf.getBytes(byteBuf.readerIndex(), array, 0, len);
        MessagePack messagePack = new MessagePack();
        list.add(messagePack.read(array));
    }
}
