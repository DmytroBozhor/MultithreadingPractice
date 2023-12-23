package com.kaluzny.demo.util;

import jakarta.jms.Topic;

public interface TopicCreator {
    Topic createTopic(String topicName);
}
