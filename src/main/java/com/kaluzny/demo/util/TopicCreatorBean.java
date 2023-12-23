package com.kaluzny.demo.util;

import com.kaluzny.demo.exception.TopicNotCreatedException;
import jakarta.jms.Connection;
import jakarta.jms.Topic;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@RequiredArgsConstructor
public class TopicCreatorBean implements TopicCreator {

    private final JmsTemplate jmsTemplate;

    @Override
    public Topic createTopic(String topicName) {
        Topic autoTopic;
        try (Connection connection = Objects.requireNonNull(jmsTemplate.getConnectionFactory()).createConnection()) {
            autoTopic = connection.createSession().createTopic(topicName);
        } catch (Exception exception) {
            throw new TopicNotCreatedException("Could not create the topic", exception);
        }
        return autoTopic;
    }
}
