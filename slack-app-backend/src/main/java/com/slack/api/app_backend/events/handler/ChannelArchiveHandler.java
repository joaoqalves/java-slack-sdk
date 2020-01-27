package com.slack.api.app_backend.events.handler;

import com.slack.api.model.event.ChannelArchiveEvent;
import com.slack.api.app_backend.events.EventHandler;
import com.slack.api.app_backend.events.payload.ChannelArchivePayload;

public abstract class ChannelArchiveHandler extends EventHandler<ChannelArchivePayload> {

    @Override
    public String getEventType() {
        return ChannelArchiveEvent.TYPE_NAME;
    }
}
