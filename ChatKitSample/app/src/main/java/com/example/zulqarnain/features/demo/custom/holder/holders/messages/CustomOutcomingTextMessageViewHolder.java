package com.example.zulqarnain.features.demo.custom.holder.holders.messages;

import android.view.View;

import com.stfalcon.chatkit.messages.MessageHolders;
import com.example.zulqarnain.common.data.model.Message;

public class CustomOutcomingTextMessageViewHolder
        extends MessageHolders.OutcomingTextMessageViewHolder<Message> {

    public CustomOutcomingTextMessageViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void onBind(Message message) {
        super.onBind(message);

        time.setText(message.getStatus() + " " + time.getText());
    }
}
