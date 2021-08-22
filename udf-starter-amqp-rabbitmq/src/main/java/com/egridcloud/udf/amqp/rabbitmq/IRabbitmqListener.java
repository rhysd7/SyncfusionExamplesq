/**
 * IRabbitmqListener.java
 * Created at 2016-11-17
 * Created by wangkang
 * Copyright (C) 2016 egridcloud.com, All rights reserved.
 */
package com.egridcloud.udf.amqp.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;

/**
 * 描述 : IRabbitmqListener
 *
 * @author wangkang
 *
 */
public interface IRabbitmqListener<T> {

  /**
   * 描述 : 消费者队列(Bean)
   *
   * @return Queue
   */
  public Queue queue();

  /**
   * 描述 : 死信消费者队列(Bean)
   *
   * @return Queue
   */
  public Queue dlxQueue();

  /**
   * 描述 : 绑定(Bean)
   *
   * @return Binding
   */
  public Binding binding();

  /**
   * 描述 : 死信绑定(Bean)
   *
   * @return Binding
   */
  public Binding dlxBinding();

  /**
   * 描述 : 处理消息
   *
   * @param message 消息
   */
  public void process(RabbitmqMessage<T> message);

}