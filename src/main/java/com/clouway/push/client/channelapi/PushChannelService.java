package com.clouway.push.client.channelapi;

import com.clouway.push.shared.PushEvent;
import com.google.gwt.user.client.rpc.RemoteService;

/**
 * @author Ivan Lazov <ivan.lazov@clouway.com>
 */
public interface PushChannelService extends RemoteService {

  String openChannel();

  void subscribe(PushEvent.Type type);

  void unsubscribe(PushEvent.Type event);

  PushEvent dummyMethod();
}
